package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapHungry {
	public static void main(String arg[]){
		MapTest mapTest = new MapTest();
		mapTest.cal();
	}
}
class MapTest{
	Map<String,String> mapString = new HashMap<String, String>();
	public void cal(){
		mapString.put("st1", "AK");
		mapString.put("st2", "MK");
		Iterator<Map.Entry<String,String>> itr=mapString.entrySet().iterator();
		/*Set set=mapString.entrySet();
		Iterator itr=set.iterator();*/
		while(itr.hasNext())
		{
			Map.Entry<String, String> st=itr.next();
			System.out.println("key"+st);
			//System.out.println("value"+mapString.get(itr.next()));
		}
		
		//Iterator itr1=mapString.keySet().iterator();
		Set set1=mapString.keySet();
		Iterator itr1=set1.iterator();
		while(itr1.hasNext())
		{
			System.out.println("value"+mapString.get(itr1.next()));
		}
		for(Map.Entry<String, String> entry : mapString.entrySet()){
		    System.out.printf("Key : %s and Value: %s %n", entry.getKey(), entry.getValue());
		}
	}
	
}
