package Serialization;
import java.io.*;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class Persist{  
	 public static void main(String args[]){  
	  ///Student s1 =new Student(211,"ravi");  
		 Address add = new Address("Mapple", "Ghz", "U.p");
	  //Student1 s2 =new Student1(213,"Assh","Java",10000,add); 
	  FirstYearStudents fisrtYrStudents=new FirstYearStudents(213,"Assh","Java",10000,add);
	  FileOutputStream fout = null;
	  ObjectOutputStream out = null;
	  try{
	  fout=new FileOutputStream("f.txt");  
	  out=new ObjectOutputStream(fout);  
	  out.writeObject(fisrtYrStudents);  
	  out.flush();
	  out.close();
	  fout.close();
	  }catch(IOException e){
		  e.printStackTrace();
		  
	  }
	  finally{
		  
	  }
	  System.out.println("success");  
	 }  
	}
