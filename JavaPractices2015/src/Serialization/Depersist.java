package Serialization;

import java.io.*;  
class Depersist{  
 public static void main(String args[])throws Exception{  
    
  ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));  
  /*Student s=(Student)in.readObject();  
  System.out.println(s.id+" "+s.name);
*/  
 // Student1 s1=(Student1)in.readObject();  
  FirstYearStudents s1=(FirstYearStudents)in.readObject();  
  System.out.println(s1.id+" "+s1.name+" "+s1.course+" "+s1.fee);  
  if(s1.adress!=null)
	  System.out.println(" Address"+s1.adress.addressLine);
  
  in.close();  
 }  
}  
