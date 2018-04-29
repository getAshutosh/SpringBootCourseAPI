package exception;

import java.io.IOException;

public class TestException4 {
	 public void start() throws Exception{ 
	    	System.out.println("super start");
	    }
	     
	    public void foo() throws RuntimeException{
	    	System.out.println("super foo");
	    }
	    public static void main(String []args){
	    	TestException5 test=new TestException5();
	    	test.foo();
	    }
	}
	 
	class TestException5 extends TestException4{
	     
	    public void start() throws IOException{
	    	System.out.println("sub start");
	    }
	     
	    public void foo() throws NullPointerException{
	    	System.out.println("sub foo");  
	    	String s1 = "abc";
	    	String s2 = "abc";
	    	if(s1!=s2)
	    	System.out.println("s1 == s2 is:" + s1 == s2);
	    }
	}
