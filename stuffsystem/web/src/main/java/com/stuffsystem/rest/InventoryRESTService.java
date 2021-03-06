package com.stuffsystem.rest;

import java.util.Iterator;
import java.util.Set;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

import com.stuffsystem.service.InventoryServiceBean;

// path is:  http://localhost:8080/stuffsystem/rest/inventory
@Path("/inventory")
//@RequestScoped
public class InventoryRESTService { 

    // actually does the service action.
    @Inject
    private InventoryServiceBean bean;
    
    @Inject
    private Logger log;
        
    // ctor
    public InventoryRESTService() {
    }
    
//    @GET
//    @Path("{bookId}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Book findBookById(
//        @PathParam("bookId") long id)
//    {
//        Book b = actionBean.getBookDetails(id);
//        if(null==b) {
//            throw new WebApplicationException(
////                Response.Status.NOT_FOUND);
//                Response.status(400).entity(
//                   "BookID not found:  " + id).build());
//        }
//        return b;
////        Book b = new Book();
////        b.setId(69L);
////        b.setAuthor("Some Bitch");
////        return b;
//    }
//

    //------------------------------------------------------
    // Test Paths
    //------------------------------------------------------

    // test path - echoes back the text you enter
    @GET
    @Path("echo/{someText}")
    @Produces(MediaType.APPLICATION_JSON)
    public String echoTest(@PathParam("someText") String someText) {
        String result = someText;
        return result;
    }

    // get-request - echoes back the http request in JSON format.
    @GET
    @Path("get-request")
    @Produces(MediaType.APPLICATION_JSON)
    public String getRequest(
        @Context Request request,
        @Context HttpHeaders httpHeader,
        @Context UriInfo uriInfo) {
        String result = "";
        result += "URI-INFO:  " + uriInfo.getRequestUri().toString();
        result += "\nREQUEST:  " + request.getMethod();
        result += "\nHEADER:  ";
        MultivaluedMap<String, String> map = httpHeader.getRequestHeaders();
        Set<String> keySet = map.keySet();
        Iterator<String> it = keySet.iterator();
        while(it.hasNext()) {
            String key = (String)it.next();
            Iterator< String > valIter = map.get(key).iterator();
            boolean first = true;
            while(valIter.hasNext()) {
                if( !first ) {
                    result += "\r\n";
                }
                first = false;
                String val = (String)valIter.next();
                result += "    " + key + ":" + val;
            }
        }
        //log.warning("Word up");
        return result;
    }

}
