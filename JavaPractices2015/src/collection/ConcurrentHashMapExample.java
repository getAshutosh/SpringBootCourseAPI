package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
 
public class ConcurrentHashMapExample {
 
    public static void main(String[] args) {
 
        //ConcurrentHashMap
        Map<String,String> myMap = new ConcurrentHashMap<String,String>();
        myMap.put("1", "1");
        myMap.put("2", "1");
        myMap.put("3", "1");
        myMap.put("4", "1");
        myMap.put("5", "1");
        myMap.put("6", "1");
        System.out.println("ConcurrentHashMap before iterator: "+myMap);
        Iterator<String> it = myMap.keySet().iterator();
 
        while(it.hasNext()){
            String key = it.next();
            if(key.equals("3")) myMap.put(key+"new", "new3");
        }
        System.out.println("ConcurrentHashMap after iterator: "+myMap);
 
        //HashMap
        myMap = new HashMap<String,String>();
        myMap.put("1", "1");
        myMap.put("2", "1");
        myMap.put("3", "1");
        myMap.put("4", "1");
        myMap.put("5", "1");
        myMap.put("6", "1");
        System.out.println("HashMap before iterator: "+myMap);
        Iterator<String> it1 = myMap.keySet().iterator();
 
        while(it1.hasNext()){
            String key = it1.next();
            //Step 1
            //if(key.equals("3"))	myMap.put(key+"new", "new3");
            //Step 2: if add break then it will not give error 
            if(key.equals("3")){ 
            	myMap.put(key+"new", "new3");
            	break;
            	//Step 3
            	//if we adding updating key value pair then it will not throw exception
            	//myMap.put(key, "new3");
            }
        }
        System.out.println("HashMap after iterator: "+myMap);
    }
 
}
