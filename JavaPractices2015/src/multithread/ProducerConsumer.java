package multithread;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumer {

	public static void main(String[] args) {
		/*Q q = new Q(); 
		new Producer(q); 
		new Consumer(q); 
		System.out.println("Press Control-C to stop."); */
		List<Integer> taskQueue = new ArrayList<Integer>();
	      int MAX_CAPACITY = 5;
	      Thread tProducer = new Thread(new Producer(taskQueue, MAX_CAPACITY), "Producer");
	      Thread tConsumer = new Thread(new Consumer(taskQueue), "Consumer");
	      tProducer.start();
	      tConsumer.start();

	}

}
/*//An incorrect implementation of a producer and consumer. 
class Q { 
int n; 
synchronized int get() { 
System.out.println("Got: " + n); 
return n; 
} 
synchronized void put(int n) { 
this.n = n; 
System.out.println("Put: " + n); 
} 
}

class Producer implements Runnable { 
Q q; 
Producer(Q q) { 
this.q = q; 
new Thread(this, "Producer").start(); 
} 
public void run() { 
int i = 0; 
while(true) { 
q.put(i++); 
} 
} 
}

class Consumer implements Runnable { 
Q q; 
Consumer(Q q) { 
this.q = q; 
new Thread(this, "Consumer").start(); 
} 
public void run() { 
while(true) { 
q.get(); 
} 
} 
}*/
/*class Q { 
int n; 
boolean valueSet = false; 
synchronized int get() { 
if(!valueSet) 
try { 
wait(); 
} catch(InterruptedException e) { 
System.out.println("InterruptedException caught"); 
} 
System.out.println("Got: " + n); 
valueSet = false; 
notify(); 
return n; 
} 
synchronized void put(int n) { 
if(valueSet) 
try { 
wait(); 
} catch(InterruptedException e) { 
System.out.println("InterruptedException caught"); 
} 
this.n = n; 
valueSet = true; 
System.out.println("Put: " + n); 
notify(); 
} 
}

class Producer implements Runnable { 
Q q; 
Producer(Q q) { 
this.q = q; 
new Thread(this, "Producer").start(); 
} 
public void run() { 
int i = 0; 
while(true) { 
q.put(i++); 
} 
} 
}

class Consumer implements Runnable { 
Q q; 
Consumer(Q q) { 
this.q = q; 
new Thread(this, "Consumer").start(); 
} 
public void run() { 
while(true) { 
q.get(); 
} 
} 
}*/

class Producer implements Runnable
{
   private final List<Integer> taskQueue;
   private final int           MAX_CAPACITY;
 
   public Producer(List<Integer> sharedQueue, int size)
   {
      this.taskQueue = sharedQueue;
      this.MAX_CAPACITY = size;
   }
 
   @Override
   public void run()
   {
      int counter = 0;
      while (true)
      {
         try
         {
            produce(counter++);
         }
         catch (InterruptedException ex)
         {
            ex.printStackTrace();
         }
      }
   }
 
   private void produce(int i) throws InterruptedException
   {
      synchronized (taskQueue)
      {
         while (taskQueue.size() == MAX_CAPACITY)
         {
            System.out.println("Queue is full " + Thread.currentThread().getName() + " is waiting , size: " + taskQueue.size());
            taskQueue.wait();
         }
           
         Thread.sleep(1000);
         taskQueue.add(i);
         System.out.println("Produced: " + i);
         taskQueue.notifyAll();
      }
   }
}
class Consumer implements Runnable
{
   private final List<Integer> taskQueue;
 
   public Consumer(List<Integer> sharedQueue)
   {
      this.taskQueue = sharedQueue;
   }
 
   @Override
   public void run()
   {
      while (true)
      {
         try
         {
            consume();
         } catch (InterruptedException ex)
         {
            ex.printStackTrace();
         }
      }
   }
 
   private void consume() throws InterruptedException
   {
      synchronized (taskQueue)
      {
         while (taskQueue.isEmpty())
         {
            System.out.println("Queue is empty " + Thread.currentThread().getName() + " is waiting , size: " + taskQueue.size());
            taskQueue.wait();
         }
         Thread.sleep(1000);
         int i = (Integer) taskQueue.remove(0);
         System.out.println("Consumed: " + i);
         taskQueue.notifyAll();
      }
   }
}