package dev;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Test2015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello test 2015");
		A a=new B();
		try {
			a.methodA();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
class A{
	void methodA()throws Exception, SQLException{
	List<String> al=new ArrayList<String>();
	al.add("A");
	methodB(al);
	System.out.println("al A:"+al);
	}
	public void methodB(List b){
		b.add("B");
		System.out.println("b :"+b);
	}
}
class B extends A{
	int bl=0;
	protected void methodA()throws Exception, SQLException{
		System.out.println("al B:"+bl);
	}
}