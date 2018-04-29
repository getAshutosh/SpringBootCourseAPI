package Serialization;

import java.io.Serializable;  

public class Student implements Serializable{  
 /**
	 * 
	 */
private static final long serialVersionUID = 1;
int id;  
 String name;
 Address address;//HAS-A 
 public Student(int id, String name) {  
  this.id = id;  
  this.name = name;  
 }  
}  

class Student1 extends Person implements Serializable{  
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String course;  
	 static int fee;
	 transient Address adress;
	 public Student1(int id, String name, String course, int fee,Address adress) {  
	  super(id,name);  
	  this.course=course;  
	  this.fee=fee;
	  this.adress=adress;
	 }  
	}  

class FirstYearStudents extends Student1{

	public FirstYearStudents(int id, String name, String course, int fee, Address adress) {
		super(id, name, course, fee, adress);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}