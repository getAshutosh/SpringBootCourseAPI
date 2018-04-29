package concurrency;

import java.lang.reflect.Executable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		for(int i=0;i<10;i++){
			Runnable wt=new WorkerThread("Thread"+i);
			executor.execute(wt);
			
		}
		executor.shutdown();
		while(!executor.isTerminated()){}
		
		System.out.println("Finish All thread");
	}
}
class WorkerThread implements Runnable{
	String message=null;
	public WorkerThread(String msg) {
		// TODO Auto-generated constructor stub
		this.message=msg;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+" Thread start and Message :"+message);
		processMessage();
		System.out.println(Thread.currentThread().getName()+" (End)");
		
	}
	private void processMessage() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}