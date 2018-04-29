package multithread;

public class SimpleThread {

	public static void main(String [] str){
		ThreadEx thread1 = new ThreadEx();
		System.out.println("current thread :"+Thread.currentThread().getName());
		thread1.start();
		Thread thread2 = new Thread(new ThreadEy(), "Second");		
		System.out.println("current thread :"+Thread.currentThread().getName());
		thread2.start();
		
	}
}
class ThreadEx extends Thread{
	ThreadEx(){
		System.out.println("Thread x started :"+Thread.currentThread().getName());
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread x Running");
		
	}
}

class ThreadEy implements Runnable {
	ThreadEy(){
		System.out.println("Thread y started :"+Thread.currentThread().getName());
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread y Running");
	}
}