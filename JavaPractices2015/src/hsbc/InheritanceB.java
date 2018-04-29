package hsbc;

public class InheritanceB extends InheritanceA {
	public InheritanceB() {
		//Implicit super constructor InheritanceA() is undefined. Must explicitly invoke another constructor
		super(5);
		System.out.println("B");
	}
	public void hide(){
		System.out.println("hide");
	}
}
