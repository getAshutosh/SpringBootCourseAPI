package cognizant;

import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.text.NavigationFilter;

public class CognizantIntvw {

	public CognizantIntvw() {
		// TODO Auto-generated constructor stub
		
		
		
	}
	public static void main(String[] str){
		System.out.println("Enter Duplicat char String");
		//String userInput = new Scanner(System.in).next();
		String val="MISISPPI";
		System.out.println("Original char :"+val);
		System.out.println("removeDuplicate :"+removeDuplicate(val));
		
		String[] strArr = {"AKS","BKS","SKS","DPS","Sona","Chadi"};
		System.out.print("actualArrayString :");
		for(int i=0;i<strArr.length;i++)
			System.out.print(strArr[i]+ " ,");
		
		String temp[] = reverseAyya(strArr);
		System.out.println();
		System.out.println("reverseArrayString :");
		for(int i=0;i<temp.length;i++)
			System.out.print(temp[i]+ " ,");
		
		System.out.println("find sum fo left last leaf from tree +"+findSumOfleftLastLeafNode());
		
		int a[] = {2,4,6,7,9};
		int b[] = {5,1,10,3,8,18,16,19,11,21};
		System.out.println("Merge shorted array :");
		int arr[]= mergeSec(a, b);
		int l=arr.length;
		for(int i=0; i<l;i++){
			System.out.print(arr[i]+" ,");
		}
}
private static int findSumOfleftLastLeafNode() {
		// TODO Auto-generated method stub
	TreeSet<Integer> tresSet =  new TreeSet<Integer>();
	tresSet.add(8);
	tresSet.add(3);
	tresSet.add(10);
	tresSet.add(1);
	tresSet.add(6);	
	tresSet.add(14);
	tresSet.add(4);
	tresSet.add(7);
	tresSet.add(13);
	NavigableSet<Integer> navSet = tresSet;
	Iterator<Integer> itr = navSet.iterator();
	
		return 0;
	}
public static String removeDuplicate(String val){
	
	StringBuilder sb=new StringBuilder();
	
	Set<Character> set= new HashSet<Character>();
	
	String finalVsl="";
	//need out put MISP
	//char []arr = new char[val.length()] ;
	for(int i=0; i<val.length();i++){
		char c= val.charAt(i);
		if(!set.contains(c)){
			set.add(c);
			sb.append(c);
		}
	}
	return sb.toString();
	
}

public static String[] reverseAyya(String [] strArr){
	String[] tempArr = new String[strArr.length];
	int count=0;
	for (int i=strArr.length-1; i>=0;i--){		
		tempArr[count]=strArr[i];
		count++;	
	}
	return tempArr;
	
}


public static int[] merge(int[] a, int[] b) {

    int[] answer = new int[a.length + b.length];
    int i = 0, j = 0, k = 0;

    while (i < a.length && j < b.length)
    {
        if (a[i] < b[j])       
            answer[k++] = a[i++];

        else        
            answer[k++] = b[j++];               
    }

    while (i < a.length)  
        answer[k++] = a[i++];


    while (j < b.length)    
        answer[k++] = b[j++];

    return answer;
}



public static int[] mergeSec(int[] a, int[] b) {
    int[] answer = new int[a.length + b.length];
    int i = a.length - 1, j = b.length - 1, k = answer.length;

    while (k > 0)
        answer[--k] = (j < 0 || (i >= 0 && a[i] >= b[j])) ? a[i--] : b[j--];
        
     return answer;
}

}