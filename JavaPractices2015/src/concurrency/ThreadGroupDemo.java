package concurrency;

public class ThreadGroupDemo  implements Runnable{
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("name :"+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		ThreadGroupDemo tgd=new ThreadGroupDemo();
		ThreadGroup tg= new ThreadGroup("Group-1");
		Thread t1= new Thread(tg,tgd,"One");
		t1.start();
		Thread t2= new Thread(tg,tgd,"two");
		t2.start();
		Thread t3= new Thread(tg,tgd,"three");
		t3.start();
		
		System.out.println("Thread group name :"+tg.getName());
		tg.list();
	}
}
