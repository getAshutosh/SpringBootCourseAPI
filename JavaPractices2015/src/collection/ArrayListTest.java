package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList<E>();
		for(int i=0;i<10;i++)
			list.add(i);
		System.out.println("before remove list :"+list);
		for(int j=0;j<5;j++)
			list.remove(j);
		System.out.println("After remove ::"+list);
		
		System.out.println("Bureau varitas Question");
		List list1=new ArrayList<E>();
		list1.add("abc");
		list1.add("aa");
		list1.add("bb");
		List list2=new ArrayList<E>();
		list2.add("1");
		list2.add("2");
		//list2.add("3");
		//list1.add(9, "1");//Hemant asked this Question
		
		
		list1=list2;
		list2.add("4");
		list2.add("5");
		System.out.println(list1);
		System.out.println(list2);
	}

}
