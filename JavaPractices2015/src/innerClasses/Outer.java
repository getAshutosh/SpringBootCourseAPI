package innerClasses;

public class Outer {
	static int i=10;
	static int data=300;
	static class NestedStatic{
		public NestedStatic() {
			// TODO Auto-generated constructor stub
		}
		void msg(){
			System.out.println("i"+i);
		}
		static void disp(){System.out.println("data is "+data);}  
	}
	class Inner{
		void show(){
			System.out.println("i"+i);
		}
		
	}
	/*A class i.e. created inside a method is called local inner class in java. 
	 * If you want to invoke the methods of local inner class, 
	 * you must instantiate this class inside the method.
	 * */
	void display(){
		final int value=50;//local variable must be final till jdk 1.7 only  
		  class Local{  
		   void msg(){
			   System.out.println(value);
			   }  
		   }
		 /** Rule: Local variable can't be private, public or protected.
		  Rules for Java Local Inner class
		  1) Local inner class cannot be invoked from outside the method.
		  2) Local inner class cannot access non-final local variable till JDK 1.7. Since JDK 1.8, 
		  it is possible to access the non-final local variable in local inner class.
		  **/
		  Local l=new Local();  
		  l.msg(); 
		  } 
	public static void main(String []arg){
		Outer.NestedStatic.disp();//no need to create the instance of static nested class  
		Outer.NestedStatic nestedStatic= new Outer.NestedStatic();//created inner class object
		nestedStatic.msg();
		//for calling inner classes(Non-static) method and variable we must create the Outer object
		// and then we need to instantiate inner class as bellow.
		Outer outer=new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.show();
		Outer localAccess= new Outer();
		localAccess.display();
		
	}
}
