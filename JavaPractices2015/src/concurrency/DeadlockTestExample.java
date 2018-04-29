package concurrency;

public class DeadlockTestExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String resource1="Ashutosh";
		final String resource2="Vijay";
		Thread t1 = new Thread(){
			@Override
			public void run() {
			// TODO Auto-generated method stub
				synchronized (resource1) {
					System.out.println("aquire resource 1 by "+Thread.currentThread().getName());
				
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				synchronized (resource2) {
					System.out.println("Waiting for Resource 2");
				}
			}
				
			}
		};
		
		
		Thread t2 = new Thread(){
			@Override
			public void run() {
			// TODO Auto-generated method stub
				synchronized (resource2) {
					System.out.println("aquire resource 2 by "+Thread.currentThread().getName());
				
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				synchronized (resource1) {
					System.out.println("Waiting for Resource 2");
				}
			}
				
			}
		};
		
		t1.start();
		t2.start();
		
		}

}
