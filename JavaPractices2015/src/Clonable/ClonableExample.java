package Clonable;

import java.io.Serializable;

public class ClonableExample {
	/*Shallow copy:
	 * Generally clone method of an object, creates a new instance of the same class and 
	copies all the fields to the new instance and returns it. This is called shallow copy. Object 
	class provides a clone method and provides support for the shallow copy. It returns ‘Object’ 
	as type and you need to explicitly cast back to your original object. Since the Object class has 
	the clone method, you cannot use it in all your classes. The class which you want to be cloned 
	should implement clone method and overwrite it. It should provide its own meaning for copy or 
	to the least it should invoke the super.clone(). Also you have to implement Cloneable marker 
	interface or else you will get CloneNotSupportedException. When you invoke the super.clone() 
	then you are dependent on the Object class’s implementation and what you get is a shallow copy.
	*/
	/*Deep copy:
	 * When you need a deep copy then you need to implement it yourself. 
	When the copied object contains some other object its references are copied 
	recursively in deep copy. When you implement deep copy be careful as you might fall 
	for cyclic dependencies. If you don’t want to implement deep copy yourselves then 
	you can go for serialization. It does implements deep copy implicitly and gracefully handling cyclic dependencies.
	*/
	//- See more at: http://www.java2novice.com/java_interview_questions/shallow-deep-cloning/#sthash.7FxnVAKp.dpuf
	public static void main(String[] args)  {
		Employee emp=new Employee();
		emp.setName("Ashutosh");
		emp.setAge("30");
		Address ad = new Address("Mapple");
		emp.setAdress(ad);
		
		System.out.println("original Employee Name :"+emp.getName()+"  Age :"+emp.getAge()+"  Address :"+emp.getAdress().getAddLine());
		Employee emp1=null;
		try{
		emp1=(Employee)emp.clone();
		System.out.println("After clone Name:"+emp1.getName()+"  Age :"+emp1.getAge()+"  Address :"+emp1.getAdress().getAddLine());
		}catch(CloneNotSupportedException ex){
			ex.printStackTrace();
		}
		
		emp1.setName("Ashu");
		emp1.setAge("32");
		emp1.getAdress().setAddLine("Dumma");;
		System.out.println("after updating  original Employee Name :"+emp.getName()+"  Age :"+emp.getAge()+"   Address :"+emp.getAdress().getAddLine());
		System.out.println("After updating  Copy Employe Name:"+emp1.getName()+"  Age :"+emp1.getAge()+"   Address :"+emp1.getAdress().getAddLine());
	}
	

	
}
class Employee implements Cloneable{
	String name;
	String age;
	Address adress;
	public Employee(){
		
	}
	public Employee(String name,String agge,Address address){
		this.name=name;
		this.age=age;
		this.adress=adress;
				
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	public Address getAdress() {
		return adress;
	}
	public void setAdress(Address adress) {
		this.adress = adress;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		System.out.println("cloning method called");
		/*Employee empDeep = new Employee();
		empDeep.setName(this.name);
		empDeep.setAge(this.age);
		Address add1 = new Address(this.getAdress().getAddLine());
		empDeep.setAdress(add1);
		//add1.setAdress(this.adress);
		return empDeep;*/
		return super.clone();
		
	}
}
class Address{
	String addLine;

	public String getAddLine() {
		return addLine;
	}

	public void setAddLine(String addLine) {
		this.addLine = addLine;
	}
	public Address(String addLine) {
		// TODO Auto-generated constructor stub
		this.addLine=addLine;
	}
}