
public class MyThread extends Thread{
	public MyThread() {
		System.out.println("MyThread");
	}
	public void run(){
		System.out.println("run");
	}
	public void run(String s){
		System.out.println("run string");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new MyThread(){
			public void  run(){
				System.out.println("foo");
			}
		};
		t.start();
	}

}
