package programmingInterview;

import java.util.Scanner;

public class FabonacciTest {

	public FabonacciTest() {
		// TODO Auto-generated constructor stubtatic
		
	}
	public static void main(String []arg){
		System.out.println("Enter Number upto which fabonacci series print :");
		int number = new  Scanner(System.in).nextInt();
		
		System.out.println("Fabanacci series upto "+number+" number");
		for(int i=0; i<=number;i++){
			System.out.print(fabonacci(i) + " ");
		}
	}
public static int fabonacci(int k){
	if(k==0){
		return 0;
	}
	if(k==1){
		return 1;
	}
	else{
		return fabonacci(k - 1) + fabonacci(k - 2);
	}
}
}


///Required Series
//1 1 2 3 5 8