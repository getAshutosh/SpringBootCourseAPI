package callbyvaluevscallbyreference;

public class JavaCallByValueNotCallByReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog a = new Dog();
		a.setName("Max");
		showDog(a);
		System.out.println("Dog name :"+a.getName());
	}

	private static void showDog(Dog d) {
		// TODO Auto-generated method stub
		d=null;
		d= new Dog();
		d.setName("FFF");
		System.out.println("show dog :"+d.getName());
	}

}
class Dog{
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}