package immutablepackage;

import java.util.Date;

import javax.net.ssl.ExtendedSSLSession;

public class ImmutableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contacts contacts = new Contacts("Ashutosh", "9818887692");
		System.out.println(" before changes :"+contacts.getName());
		contacts = new Contacts("Ashutosh1", "9818887692");
		System.out.println(" After changes :"+contacts.getName());

	}

}

/*
 *1)Don't provide "setter" methods — methods that modify fields or objects referred to by fields.
 *2)Make all fields final and private.
 *3)Don't allow subclasses to override methods. The simplest way to do this is to declare the class as final.
 	A more sophisticated approach is to make the constructor private and construct instances in factory methods.
 *4)If the instance fields include references to mutable objects, 
	*don't allow those objects to be changed:
	*Don't provide methods that modify the mutable objects.
	*Don't share references to the mutable objects. Never store references to external, mutable objects passed to the constructor; if necessary, create copies, and store references to the copies. Similarly, create copies 
		of your internal mutable objects when necessary to avoid returning the originals in your methods.
 */
 final class Contacts {

    private final String name;
    private final String mobile;

    public Contacts(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }
  
    public String getName(){
        return name;
    }
  
    public String getMobile(){
        return mobile;
    }
}
 
 /*class MyContact extends Contacts{
	 String name;
	 public MyContact(String name,String Mobile) {
		// TODO Auto-generated constructor stub
		 super(name, Mobile);
		 this.name=name;
	}
	 @Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
 }*/
 
 
 
/*
 * This Java class is immutable, because its state can not be changed once created. 
 * You can see that all of it’s fields are final. This is one of the most simple way of 
 * creating immutable class in Java, where all fields of class also remains immutable like 
 * String in above case. Some time you may need to write immutable class which includes mutable 
 * classes like java.util.Date, despite storing Date into final field it can be modified internally, 
 * if internal date is returned to the client. In order to preserve immutability in such cases, its advised 
 * to return copy of original object, which is also one of the Java best practice. here is another example of 
 * making a class immutable in Java, which includes mutable member variable.
*/
 final class ImmutableReminder{
    private final Date remindingDate;
  
    public ImmutableReminder (Date remindingDate) {
        if(remindingDate.getTime() < System.currentTimeMillis()){
            throw new IllegalArgumentException("Can not set reminder" +
                        " for past time: " + remindingDate);
        }
        this.remindingDate = new Date(remindingDate.getTime());
    }
  
    public Date getRemindingDate() {
        return (Date) remindingDate.clone();//defensive copy
    }
}



/* 
 Benefits of Immutable Classes in Java

 As I said earlier Immutable classes offers several benefits, here are few to mention:

 1) Immutable objects are by default thread safe, can be shared without synchronization in concurrent environment.
 2) Immutable object simplifies development, because its easier to share between multiple threads without external synchronization.

 3) Immutable object boost performance of Java application by reducing synchronization in code.

 4) Another important benefit of Immutable objects is reusability, you can cache Immutable object and reuse them, 
 much like String literals and Integers.  You can use static factory methods to provide methods like valueOf(), 
 which can return an existing Immutable object from cache, instead of creating a new one.

 Apart from above advantages, immutable object has disadvantage of creating garbage as well.
  Since immutable object can not be reused and they are just a use and throw. String being a prime example, 
  which can create lot of garbage and can potentially slow down application due to heavy garbage collection, 
  but again that's extreme case and if used properly Immutable object adds lot of value.


 Read more: http://javarevisited.blogspot.com/2013/03/how-to-create-immutable-class-object-java-example-tutorial.html#ixzz3hG957nXw
 */
//Read more: http://javarevisited.blogspot.com/2013/03/how-to-create-immutable-class-object-java-example-tutorial.html#ixzz3hG4eGC36