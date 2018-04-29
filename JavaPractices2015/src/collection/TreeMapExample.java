package collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		 
        //TreeMap
		Employee emp =  new Employee();
		emp.setId("1111");
		emp.setName("aba");
		
		Employee emp1 =  new Employee();
		emp1.setId("111");
		emp1.setName("akhil");
		//Map<Employee,String> myMapObj = new TreeMap<Employee,String>();
		Map<Employee,String> myMapObj = new TreeMap<Employee,String>(new NameComparatorForEmplyee());
        myMapObj.put(emp, "1");
        myMapObj.put(emp1, "1");
       /* myMap.put("6", "1");
        myMap.put("8", "1");
        myMap.put("5", "1");
        myMap.put("1", "1");*/
        System.out.println("TreeMap before iterator: "+myMapObj);
        Iterator<Employee> it = myMapObj.keySet().iterator();
 
        while(it.hasNext()){
            Employee key = it.next();
            System.out.println("tree Map Key: id :"+key.id +" name: "+key.name);
            /*if(key.equals("6")){
            	myMap.put(key+"new", "new3");
            	break;
            }*/
        }
        System.out.println("TreeMap after iterator: "+myMapObj);
 
        //HashMap
        Map<String,String> myMap = new HashMap<String,String>();
        myMap.put("6", "1");
        myMap.put("2", "1");
        myMap.put("8", "1");
        myMap.put("3", "1");
        myMap.put("5", "1");
        myMap.put("6", "1");
        System.out.println("HashMap before iterator: "+myMap);
        Iterator<String> it1 = myMap.keySet().iterator();
 
        while(it1.hasNext()){
            String key = it1.next();
            System.out.println("hash Map key:"+key);
            //Step 1
            //if(key.equals("3"))	myMap.put(key+"new", "new3");
            //Step 2: if add break then it will not give error 
            /*if(key.equals("3")){ 
            	myMap.put(key+"new", "new3");
            	break;
            	//Step 3
            	//if we adding updating key value pair then it will not throw exception
            	//myMap.put(key, "new3");
            }*/
        }
        System.out.println("HashMap after iterator: "+myMap);
    }
 
}
class Employee /*implements Comparable<Employee>*/{
	String id;
	String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/*@Override
	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub
		return this.id.equals(emp.id)? 0 :!(this.id.equals(emp.id))?-1:1;
	}
	*/
	
}

class NameComparatorForEmplyee implements Comparator<Employee>{
	
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
}
