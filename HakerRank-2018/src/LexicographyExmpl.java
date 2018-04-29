import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class LexicographyExmpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.nextLine();
		System.out.println("Enter Lenght : ");
		int count = sc.nextInt();
		List<String> aList = new ArrayList<>();
		for(int i=0;i<str.length();i++){
			if(str.length()-i>=count){
				aList.add(str.substring(i, count+i));
			}
		}
		
		Collections.sort(aList);
		System.out.println("All Lexcoghraphy String : " +aList);
		System.out.println("Smallest string : " +aList.get(0));
		System.out.println("Largest string : " +aList.get(aList.size()-1));
	}

}
