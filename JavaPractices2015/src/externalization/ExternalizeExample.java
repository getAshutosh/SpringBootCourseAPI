package externalization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ExternalizeExample {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Book book =new Book("java", new Author("Ashutosh"));
		try {
			FileOutputStream fos= new FileOutputStream("temp");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(book);
			System.out.println("Original book:"+book);
			
			FileInputStream fis= new FileInputStream("temp");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Book book1 =(Book)ois.readObject();
			System.out.println("after externalizebook:"+book);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
class Book implements Externalizable{
	String name;
	Author author;
	public Book() {
		// TODO Auto-generated constructor stub
	}
	Book(String name,Author author){
		this.name=name;
		this.author=author;
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeObject(this.name);
		//out.writeObject(this.author);
		
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		this.name =(String) in.readObject();
		//this.author =(Author) in.readObject();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("Book name:"+this.name+", Author name :"+this.author);
	}
}
class Author{
	String authorName;
	public Author(String author) {
		// TODO Auto-generated constructor stub
		this.authorName=author;
	}
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return (""+this.authorName);
	}
}