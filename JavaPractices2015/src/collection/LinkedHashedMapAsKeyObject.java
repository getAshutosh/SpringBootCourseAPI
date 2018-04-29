package collection;

import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashedMapAsKeyObject {
	public static void main(String[] args) {
		Dog d1 = new Dog("red");
		Dog d2 = new Dog("black");
		Dog d3 = new Dog("white");
		Dog d4 = new Dog("white");
		 
		LinkedHashMap<Dog,Integer> treeMap = new LinkedHashMap<Dog,Integer>();
		treeMap.put(d1, 10);
		treeMap.put(d2, 15);
		treeMap.put(d3, 5);
		treeMap.put(d4, 20);
		 
		for (Entry entry : treeMap.entrySet()) {
		System.out.println(entry.getKey() + " - " + entry.getValue());
		}
		}
}
