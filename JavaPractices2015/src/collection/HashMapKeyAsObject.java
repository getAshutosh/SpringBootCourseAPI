package collection;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapKeyAsObject {

	
		public static void main(String[] args) {
		HashMap<Dog,Integer> hashMap = new HashMap<Dog,Integer>();
		Dog d1 = new Dog("red");
		Dog d2 = new Dog("black");
		Dog d3 = new Dog("white");
		Dog d4 = new Dog("white");
		 
		hashMap.put(d1, 10);
		hashMap.put(d2, 15);
		hashMap.put(d3, 5);
		hashMap.put(d4, 20);
		 
		//print size
		System.out.println(hashMap.size());
		 
		//loop HashMap
		for (Entry<Dog,Integer> entry : hashMap.entrySet()) {
		System.out.println(entry.getKey().toString() + " - " + entry.getValue());
		}
}
}	

class Dog {
	String color;

	Dog(String c) {
		color = c;
	}

	public String toString() {
		return color + " dog";
	}
	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		return ((Dog)o).color==this.color;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.color.length();
	}
}
			 
