package concurrency;

public class JoinThreadExmpl {

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyRunnable("t1"),"t1");
		Thread t2 = new Thread(new MyRunnable("t2"),"t2");
		Thread t3 = new Thread(new MyRunnable("t3"),"t3");
		
		t1.start();
		/*try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		t2.start();
		/*try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		t3.start();
	}
}

class MyRunnable implements Runnable{
	int count=0;
	public MyRunnable(String name) {
		System.out.println("thread is initialized..."+name);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i=0;i<2;i++){count++;
			System.out.println("Thread "+Thread.currentThread().getName()+" :: running");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName()+ " :: reading count value : "+count);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
