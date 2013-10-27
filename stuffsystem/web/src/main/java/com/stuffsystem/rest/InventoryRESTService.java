package com.stuffsystem.rest;

import java.lang.reflect.Type;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriInfo;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

// path is:  http://localhost:8080/stuffsystem-web/inventory/
@Path("inventory/")
public class InventoryRESTService {

   /**
    * 
    */
   public InventoryRESTService() {

   }

   /**
    * Get a listing of all inventory items.
    * 
    * @return
    */
   @GET
   @Produces(MediaType.APPLICATION_JSON)
   public String getAllItems() {
           String result = null;
           
           // setup mongo connection
           MongoClient client = null;
           try {
                   client = new MongoClient();
           } catch (UnknownHostException e) {
                   e.printStackTrace();
           }
           
           DB db = client.getDB("stuff");
           DBCollection items = db.getCollection("items");
           // finish connection setup
           
           DBCursor cursor = items.find();
           
           StringBuilder sb = new StringBuilder();
           sb.append("{\"items\":[");
           
           while (cursor.hasNext()) {
                   DBObject item = cursor.next();
                   sb.append(item.toString() + ",");
           }
           
           sb.deleteCharAt(sb.length() - 1);
           
           sb.append("]}");
           
           result = sb.toString();

           return result;
   }

   /**
    * Get a listing of a single item.
    * 
    * @param itemId
    * @return
    */
   @GET
   @Path("{itemId}")
   @Produces(MediaType.APPLICATION_JSON)
   public String getItem(@PathParam("itemId") String itemId) {
           String result = itemId;

           return result;
   }

   /**
    * Get a single item based on a query.
    * 
    * @param input
    * @return
    */
   @GET
   @Path("_search")
   @Consumes(MediaType.APPLICATION_JSON)
   @Produces(MediaType.APPLICATION_JSON)
   public String getItemFromJson(String input) {
           String result = input;

           return result;
   }

   /**
    * Create a new item.
    * 
    * @param input
    * @return
    */
   @POST
   @Consumes(MediaType.APPLICATION_JSON)
   @Produces(MediaType.APPLICATION_JSON)
   public String postItem(String input) {
           
       String result = null;

       // setup mongo connection
       MongoClient client = null;
       try {
               client = new MongoClient();
       } catch (UnknownHostException e) {
               e.printStackTrace();
       }

       DB db = client.getDB("stuff");
       DBCollection items = db.getCollection("items");
       // finish connection setup

       // parse json and setup document
       Gson gson = new Gson();

       Type type = new TypeToken<Map<String, String>>(){}.getType();
       Map<String, String> myMap = gson.fromJson(input, type);

       BasicDBObject document = new BasicDBObject(myMap);
       // end parse

       items.insert(document);

       client.close();

       result = document.toString();

       return result;
   }


   // test path - echoes back the text you enter
   @GET
   @Path("echo/{someText}")
   @Produces(MediaType.APPLICATION_JSON)
   public String echoTest(@PathParam("someText") String someText) {
       String result = someText + " - NEWDEPLOY";
       return result;
   }

   /**
    * Update an existing item.
    * 
    * @param input
    * @return
    */
   @PUT
   @Consumes(MediaType.APPLICATION_JSON)
   @Produces(MediaType.APPLICATION_JSON)
   public String putItem(String input) {
           String result = input;

           return result;
   }

   /**
    * Delete the specified item.
    * 
    * @param itemId
    * @return
    */
   @DELETE
   @Path("{itemId}")
   @Produces(MediaType.APPLICATION_JSON)
   public String deleteItem(@PathParam("itemId") String itemId) {
           String result = itemId;

           return result;
   }

   /**
    * Delete the item with id passed in as a json.
    * 
    * @param input
    * @return
    */
   @DELETE
   @Consumes(MediaType.APPLICATION_JSON)
   @Produces(MediaType.APPLICATION_JSON)
   public String deleteItemFromJson(String input) {
           String result = input;

           return result;
   }
   
   
   /**
    * Get a items based on a query.
    * 
    * @param input
    * @return
    */
   @GET
   @Path("search")
   
   @Produces(MediaType.APPLICATION_JSON)
   public String getItemSearch(@Context UriInfo info){
           MultivaluedMap<String, String> map = info.getQueryParameters();
           
           String result = "";
           
           Set<String> keys = map.keySet();
           
           // Enable MongoDB logging in general
           
           MongoClient client = null;
                                   try {
                                           client = new MongoClient();
                                   } catch (UnknownHostException e) {
                                           e.printStackTrace();
                                   }
           
           DB db = client.getDB("stuff");
           DBCollection items = db.getCollection("items");
           // finish connection setup
           
           BasicDBObject query = new BasicDBObject();
           List<String> fields = null;
           
           //Iterates to build query
           for (String key : keys)
           {
                   fields =  map.get(key);
                   
                   
                   for (String field : fields)
                   {
                           
                           //Does a LIKE %title% for title  (otherwise price = 10 would return if price = 100)
                           if(key.toString() == "title")
                           {
                           Pattern x = Pattern.compile( field);
                           query.put(key, x);
                           }
                           else{
                                   query.put(key, fields);
                           }
                   }
                   
           }
                   
                           
           DBCursor cursor = items.find(query);
                   
           StringBuilder sb = new StringBuilder();
           sb.append("{\"items\":[");
                           
                           
                           
           while (cursor.hasNext()) {
                   DBObject item = cursor.next();
                                   
                   sb.append(item.toString() + ",");}
                                   
                   if(cursor.count() == 0)
                   {
                                   sb.append("\"No Items Found\"");
                   }
                   else
                   {
                           sb.deleteCharAt(sb.length() - 1);
                   }
                   
                   sb.append("]}");
                           
                   result = sb.toString();

                   return result;
   }
   

   /**
    * Update an existing item.
    * 
    * @param input
    * @return
    */
   @PUT
   @Path("update/{itemId}")
   
   @Produces(MediaType.APPLICATION_JSON)
   public String updateItem(@PathParam("itemId") String itemId, @Context UriInfo info){
           MultivaluedMap<String, String> map = info.getQueryParameters();
           
           String result = "";
           
           Set<String> keys = map.keySet();
           
           // Enable MongoDB logging in general
           
           MongoClient client = null;
                                   try {
                                           client = new MongoClient();
                                   } catch (UnknownHostException e) {
                                           e.printStackTrace();
                                   }
           
           DB db = client.getDB("stuff");
           DBCollection items = db.getCollection("items");
           BasicDBObject query = new BasicDBObject("_id",  itemId);
           
           
           BasicDBObject update = new BasicDBObject();
           
           for (String key : keys){
                   
                   
                   for(String field :  map.get(key))
                   {
                           update.append(key, field);
                           
                   }
                   BasicDBObject updateCommand = new BasicDBObject("$set", update);
                   items.update(query, updateCommand);
                                   
           }
           
           DBCursor cursor = items.find(query);
           
           
           StringBuilder sb = new StringBuilder();
           sb.append("{\"items\":[");
                           
           while (cursor.hasNext()) {
                   DBObject item = cursor.next();
                                   
                   sb.append(item.toString() + ",");}
                                   
                   if(cursor.count() == 0)
                   {
                                   sb.append("\"No Items Found\"");
                   }
                   else
                   {
                           sb.deleteCharAt(sb.length() - 1);
                   }
                   
                   sb.append("]}");
                           
                   result = sb.toString();

                   return result;
   }
   
}

   

