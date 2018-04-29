package rsystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> aList = new ArrayList<Integer>();
		aList.add(1);
		aList.add(2);
		aList.add(3);
		aList.add(4);
		Map<String,List> aMap = new HashMap<String, List>();
		
		aMap.put("myList", aList);
		
		Employee e1 = new Employee();
		e1.setName("Ashutosh");
		Map<String,Employee> bMap = new HashMap<String, Employee>();
		bMap.put("myEmployee", e1);
		
		aList=null;
		System.out.println("myList :"+aMap.get("myList"));
		
		e1.setName(null);
		System.out.println("myEmployee  :"+((Employee)bMap.get("myEmployee")).getName());
	}

}
class Employee{
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
