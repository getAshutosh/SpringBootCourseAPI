package concurrency;

public class InterThreadCommunicationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final Customer customer = new Customer();
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					customer.withdraw(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				customer.deposit(2000);
			}
		});
		
		t1.start();
		t2.start();
	}

}

class Customer{
	int amount=1000;
	public synchronized void withdraw(int amount) throws InterruptedException{
		if(this.amount<amount){
			System.out.println("less balance, waiting for Deposit...");
			wait();
		}
		this.amount-=amount;
		System.out.println("withraw is completed..."+this.amount);
		
		
	}
	public synchronized void deposit(int amount){
		if(amount<0)
			System.out.println("this amount can not deposit");
		this.amount+=amount;
		notify();
		System.out.println("amount deposited..."+this.amount);
	}
}