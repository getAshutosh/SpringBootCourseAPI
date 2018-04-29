package programmingInterview;

import java.util.Scanner;

public class GraphicsExample {
	public static void main(String[] args) {
		
		makeGraphicsOne(6);
		Scanner sc =  new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=0;i<n;i++){
			sum=sum+sc.nextInt();
		}
		System.out.println(""+sum);
	}

	private static void makeGraphicsOne(int n) {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++){
			int count=i;
			for(int j=n-1;j>=0;j--){
				if(j<=count){
					System.out.print("#");
				}
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}
}
