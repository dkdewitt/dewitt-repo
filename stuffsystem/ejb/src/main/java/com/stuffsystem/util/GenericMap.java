package com.stuffsystem.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GenericMap
{
    private Map<String, Object> map = null;

    // Default constructor - uses a hashmap:
    public GenericMap() {
        this.map = new HashMap<String, Object>();
    }

    // Optionally, you can specify the type of map object to use.
    public GenericMap(Map<String, Object> map) {
        this.map = map;
    }

    // Wrappers for normal map methods:
    public Object put(String key, Object value) {
        return map.put(key, value);
    }
    public Object get(String key) {
        return map.get(key);
    }
    public boolean containsKey(String key) {
        return map.containsKey(key);
    }
    public Object remove(String key) {
        return map.remove(key);
    }
    public Iterator<String> getKeyIterator() {
        return map.keySet().iterator();
    }

    // Returns the value as the type you specify.  If it is non-null (it exists),
    // it MUST be able to be converted, otherwise we assert.
    public <V> V getAs(String key) {
        V returnObj = null;
        Object obj = map.get(key);
        if(obj != null) {
            try {
                returnObj = (V)obj;
            }
            catch(ClassCastException e) {
                System.err.println("Error - value for key " + key + " could not be casted to the requested type.");
                assert(false);
            }
        }
        return returnObj;
    }

    // Returns the value as the type you specify.  It MUST exist, and it MUST 
    // be able to be converted, otherwise we assert.
    public <V> V mustGetAs(String key) {
        V returnObj = null;
        Object obj = map.get(key);
        assert(obj != null);
        try {
            returnObj = (V)obj;
        }
        catch(ClassCastException e) {
            System.err.println("Error - value for key " + key + " could not be casted to the requested type.");
            assert(false);
        }
        return returnObj;
    }

    // Test method - TODO add unit tests
    public static void main(String args[])
    {
        GenericMap gm = new GenericMap();

        String key = "KEY";
        String value = "Value";
        gm.put(key, value);
        assert(gm.containsKey(key)==true);
        assert(gm.get(key) != null);
        assert(((String)gm.get(key)).equals(value));
        assert( gm.get(key) == (Object)value );

        Object value2 = gm.remove(key);
        assert(value2 == (Object)value);
        assert(((String)value2).equals(value));
        assert(gm.containsKey(key)==false);
        assert(gm.get(key) == null);

        String key2 = "KEY2";
        Integer i = new Integer(4201928);
        gm.put(key2, i);
        Integer i2 = gm.getAs(key2);
        assert(i2 == i);
        assert(i2.equals(i));

        System.out.println("\n\nOK\n\n");
    }
}
