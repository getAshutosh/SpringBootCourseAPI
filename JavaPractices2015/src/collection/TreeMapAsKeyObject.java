package collection;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapAsKeyObject {
public static void main(String[] args) {
Dog1 d1 = new Dog1("red",30);
Dog1 d2 = new Dog1("black",20);
Dog1 d3 = new Dog1("white",10);
Dog1 d4 = new Dog1("white",11);
 
TreeMap<Dog1,Integer> treeMap = new TreeMap<Dog1,Integer>();
treeMap.put(d1, 10);
treeMap.put(d2, 15);
treeMap.put(d3, 5);
treeMap.put(d4, 20);
 
for (Entry entry : treeMap.entrySet()) {
System.out.println(entry.getKey() + " - " + entry.getValue());
}
}
}

class Dog1 implements Comparable{
String color;
int size;
 
Dog1(String c,int s) {
color = c;
size=s;
}
public boolean equals(Object o) {
return ((Dog1) o).color == this.color;
}
 
public int hashCode() {
return color.length();
}
public String toString(){  
return color + " dog";
}
@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Dog1 dog = (Dog1)o;
		if(this.color.equals(dog.color))
			 return 0;
		else		
			return 1;
	}
}