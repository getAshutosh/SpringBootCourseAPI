package innerClasses;
abstract class Person{  
  abstract void eat();  
}  
interface Eatable{  
	 void eat();  
	}  
/**
 * Java Anonymous inner class
A class that have no name is known as anonymous inner class in java. 
It should be used if you have to override method of class or interface. 
Java Anonymous inner class can be created by two ways:
1.Class (may be abstract or concrete).
2.Interface
 * */
class TestAnonymousInner{  
 public static void main(String args[]){  
  Person p=new Person(){  
  void eat(){System.out.println("nice fruits");}  
  };  
  p.eat(); 
  Eatable e= new Eatable() {
	
	@Override
	public void eat() {
		System.out.println("nice Pulse");
		
	}
};
e.eat();
 }  
}  