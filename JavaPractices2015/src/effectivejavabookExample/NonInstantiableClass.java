package effectivejavabookExample;

public class NonInstantiableClass {

	private NonInstantiableClass() {
		// TODO Auto-generated constructor stub
		throw new AssertionError();
	}

}
/*class myTest extends NonInstantiableClass{
	public myTest() {
		// TODO Auto-generated constructor stub
	}
}*/