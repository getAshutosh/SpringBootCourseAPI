package hsbc;

public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//InheritanceB b = new InheritanceB();
		//InheritanceA a = new InheritanceA(6);
		InheritanceA a1 = new InheritanceB();
		a1.show();
		//a1.hide();//child method is not accesiable by Parent class object Directly.
		((InheritanceB)a1).hide();
		
	}

}
