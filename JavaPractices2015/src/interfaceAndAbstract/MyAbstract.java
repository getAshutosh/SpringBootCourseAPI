package interfaceAndAbstract;

public class MyAbstract {

	private int value=0;
	public MyAbstract() {
		// TODO Auto-generated constructor stub
	}
	public MyAbstract(int value) {
		// TODO Auto-generated constructor stub
		this.value=value;
	}
	public int name() {
		return value;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyFirstAbstractClass myFirst= new MyFirstAbstractClass() {
			
			@Override
			public void show() {
				// TODO Auto-generated method stub
				
			}
		};// we can not create object directly for absract class, need to use ananymous subclass
		//myFirstAbstractClass myFirst= new myFirst();		
		//myFirst.show();

	}

}

abstract class MyFirstAbstractClass{
	abstract public void show();
	public String getName(){
		return "Abstract Class executable method";
	}
}
class myFirst extends MyFirstAbstractClass{
	public int getValue()
	{
		MyAbstract abs=new MyAbstract(6);
		
	    return abs.name();
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("call from subclass");
		
	}
}