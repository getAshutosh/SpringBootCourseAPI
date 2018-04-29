
public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b= new B();
		C c = new C();
		b=c;
		c=(C) b;//notice this point
		newPrintB(c);
	}

	private static void newPrintB(A a) {
		// TODO Auto-generated method stub
		a.printName();
	}

}

class A{
	public void printName(){
		System.out.println("value-A");
	}
}
class B extends A{
	public void printName(){
		System.out.println("value-B");
	}
}
class C extends B{
	public void printName(){
		System.out.println("value-C");
	}
} 