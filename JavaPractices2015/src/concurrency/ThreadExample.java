package concurrency;

public class ThreadExample {

public static void main(String[] args) throws InterruptedException {
	TestThreadA tdA =  new TestThreadA("First Thread");	
	TestThreadB tdB =  new TestThreadB("Second Thread");
	Thread tdC1= new Thread(new ThreadC(),"Runnable Thread C1");
	Thread tdC2= new Thread(new ThreadC(),"Runnable Thread C2");
	Thread tdC3= new Thread(new ThreadC(),"Runnable Thread C3");
	
	
	
	tdC1.setPriority(Thread.MAX_PRIORITY);
	tdC2.setPriority(Thread.MIN_PRIORITY);
	tdC3.setPriority(Thread.NORM_PRIORITY);
	tdB.start();
	try {
		tdB.join(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	tdA.start();
	tdA.join();
	tdC1.start();
	tdC2.start();
	tdC3.start();
	
	tdC3.join();
	
	/*
	 * Syncronyzation block
	 */
	Printable print = new Printable();
	Thread synck1 = new Thread(new SynchronizationThread(print,10, "thread 1"));
	Thread synck2 = new Thread(new SynchronizationThread(print,100, "thread 2"));
	Thread synck3 = new Thread(new SynchronizationThread(print,1000, "thread 3"));
	System.out.println("calculation start for thread");
	synck1.start();
	synck2.start();
	synck3.start();
	System.out.println("calculation end for thread");
	
	synck1.join();
	synck2.join();
	synck3.join();
	final SynchornizationMistakes synch = new SynchornizationMistakes();
	Thread t1= new Thread(new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i=0;i<5;i++){
			synch.getCount();
			SynchornizationMistakes.increment();
			}
		}
	});
	
Thread t2= new Thread(new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i=0;i<5;i++){
				SynchornizationMistakes.increment();
				synch.getCount();
			
			}
		}
	});
	
	t1.start();
	t2.start();	
	
	
	
}
}
class TestThreadA extends Thread{
	public TestThreadA(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=0;i<10;i++) {
			System.out.println("Hello "+Thread.currentThread().interrupted()+":"+i);
		}
	}
}

class TestThreadB extends Thread{
	public TestThreadB(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=0;i<10;i++) {
			try {
				//Thread.sleep(1000);
				System.out.println("Hello "+Thread.currentThread()+": "+i);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
		}
	}
}

class ThreadC implements Runnable {
	@Override
	public void run() {
		for(int i=0;i<5;i++){	
			System.out.println(Thread.currentThread().getName()+" Iterator count :"+i);
			if(Thread.currentThread().getName().equals("Runnable Thread C1")){
				System.out.println("yielding control +"+Thread.currentThread().getName());
			Thread.yield();
			}
		}
		System.out.println(Thread.currentThread().getName()+" thread Finished");

	}
}



class SynchronizationThread implements Runnable{
	private int num=0;
	private String threadName=null;
	private Printable print=null;
	public SynchronizationThread(Printable print,int num,String name) {
		// TODO Auto-generated constructor stub
		super();
		this.num=num;
		this.threadName=name;
		this.print=print;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("current thread :"+threadName);
		print.print(num);
		
	}
	
}

class Printable{
	/*static */synchronized void print(int num){
		 //synchronized(this){
		for(int i=1;i<5;i++){
			try {
				Thread.sleep(40);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("output of :"+i*num);
		}
		// }
	}
}


class SynchornizationMistakes {
    private static int count = 0;
  
    //locking on this object lock
    public synchronized int getCount(){
    	System.out.println("get count :"+count);
        return count;
    }
  
    //locking on .class object lock
    public static synchronized void increment(){
    
        count++;
    	System.out.println("increament count :"+count);
    }
    
}


