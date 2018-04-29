package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class InheritanceExmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A aa = new A();
		System.out.println("a :"+aa.a);
		B bb = new B();
		bb.add(8,10);
		
		System.out.println("b :"+bb.b);
		C cc = new C();
		cc.c=15;
		cc.b=28;
		cc.a=6;
		System.out.println("c :"+cc.c);
		FileOutputStream fout = null;
		  ObjectOutputStream out = null;
		  try{
		  fout=new FileOutputStream("f.txt");  
		  out=new ObjectOutputStream(fout);  
		 // out.writeObject(aa);  
		 out.writeObject(bb);
		  out.writeObject(cc);
		  out.flush();
		  out.close();
		  fout.close();
		  }catch(IOException e){
			  e.printStackTrace();
			  
		  }
		  finally{
			  System.out.println("success");  
		  }
		  
		  try {
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));
			B b1=(B)in.readObject();
			C c1=(C)in.readObject();
			//System.out.println("super A : "+b1.a);
			//System.out.println("sub B  b: "+b1.b);
			System.out.println("super A : "+c1.a);
			System.out.println("sub C b :"+c1.b);
			System.out.println("sub C c:"+c1.c);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		   
	}

}
class A{
int a;	
}
class B extends A implements Serializable{
	static int b;
	
	public int add(int a, int b){
		A aa= new A();
		aa.a=a;
		this.b=b;
		int d= a+b;
		System.out.println(" a+b :"+d);
		return this.b+aa.a;
		
	}
	
}
class C extends B{
	int c=b+3;
}