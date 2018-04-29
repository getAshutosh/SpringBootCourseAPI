package innerClasses;

interface Showable{  
	  void show(); 
	  /*
	   * There are given some points that should be remembered by the java programmer.
		Nested interface must be public if it is declared inside the interface but it can have any access modifier if declared within the class.
		Nested interfaces are declared static implicitely.*/
	  interface Message{  
	   void msg();  
	  }  
	}  
	  
	class TestNestedInterface1 implements Showable.Message{  
	 public void msg(){System.out.println("Hello nested interface");}  
	  
	 public static void main(String args[]){  
	  Showable.Message message=new TestNestedInterface1();//upcasting here  
	  message.msg();  
	 }  
	}  
