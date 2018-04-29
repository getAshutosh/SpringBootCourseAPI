package programing.practice.sep2017;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

/**
 * 
 * @author Ashutosh singh 24-Sep-2017
 * Java programming interview questions
 * http://www.instanceofjava.com/2014/12/reverse-string-without-using-string.html

		Print prime numbers? 
		What happens if we place return statement in try catch blocks 
		Write a java program to convert binary to decimal 
		Java Program to convert Decimal to Binary
		Is it possible to print message without using System.out.println()
		Java program to restrict a class from creating not more than three objects
		Java basic interview programs on this keyword 
		Java Program to Sort elements of Java ArrayList Example
		Interfaces allows constructors? 
		Can we create static constructor in java 
		Super keyword interview questions java 
		Java interview questions on final keyword
		Can we create private constructor in java
		Java Program Find Second highest number in an integer array 
		Java interview programming questions on interfaces 
		Top 15 abstract class interview questions  
		Java interview Questions on main() method  
		Sort employee object by id in descending order using comparable and TreesSet
		Top 20 collection framework interview Questions
 *
 */

public class AllProgramingPracticeExmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int num = 50;
		System.out.println("Natural  number of :"+num+ " having  Prime Number :"+primeNumber(num));
		//2 what will happen if return from try catch
		checkReturnFromFunction();*/
		//3
		//binaryToDecimal();
		//4
		//decimalToBinary();
		//5
		try {
			printWithoutSytemPrint();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static void printWithoutSytemPrint() throws IOException {
		System.out.write("www.instanceofjava.com \n".getBytes());
		System.out.format("%S","dshfdshfhjsdfhsd \n");
		System.err.println("This is the error message");
	}
	private static void decimalToBinary() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Decimal No :");
		int decimal = in.nextInt();
		Stack<Integer> stack = new Stack<Integer>();
		while(decimal!=0){
			int tem = decimal%2;
			stack.push(tem);
			decimal/=2;
		}
		System.out.println("Binary Number representation :");
		while(!stack.isEmpty()){
			System.out.print(stack.pop());
		}
		
	}
	private static void binaryToDecimal() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Binary Number :");
		int binary = in.nextInt();
		
		if(binary==0) return;
		int decimal=0;
		int power = 0;
		System.out.println("Decimal Number with Integer parse Int :"+Integer.parseInt(String.valueOf(binary),2));
		while(binary!=0){
			int temp = binary%10;
			decimal+=temp*Math.pow(2, power);
			binary = binary/10;
			power++;
			
		}
		System.out.println("Decimal number without using integer.parseInt :"+decimal);
	}
	private static int checkReturnFromFunction() {
		try{
			System.out.println("before return from try");
			int x=10/0;
			return 1;
			
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("after exception cached from catch");
			return 1;
		}
		finally{
			/*if(0==0)return 2;*/
			System.out.println("finally will be execute");
			return 2;
		}
	}
	//prime number which divided by 1 or self number and greater than 1.so check the module is not zero
	private static String primeNumber(int num) {
		int count =0;
		StringBuilder strB = new StringBuilder();
		for(int i=2;i<num;i++){
			count=0;
			for(int j=2;j<=i/2;j++){
				if(i%j==0){
					count++;
					break;
				}
			}
			if(count==0){
				strB.append(""+i+",");
			}
		}
		return strB.toString();
	}

}
