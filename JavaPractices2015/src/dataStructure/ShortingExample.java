package dataStructure;

public class ShortingExample {

	public static void main(String[] args) {
		int[] arr={3,8,15,19,1,7,2};
		
		System.out.println("before shoring ");
		printArr(arr);
		System.out.println("Selection short");
		selectionSort(arr);
		
		int[] arr1={3,8,15,19,1,7,2};
		System.out.println();
		System.out.println("After insertion short");
		insertionShort(arr1);
		int[] arr2={3,8,15,19,1,7,2};
		System.out.println();
		System.out.println("After Bubble short");
		bubbleShort(arr2);
	}
	
	static void selectionSort(int a[])
	{
	  int i, j, min, temp, size=a.length;
	  for(i=0; i < size-1; i++ )
	  {
		  min = i;
		  for(j=i+1;j<size;j++){
			  if(a[j] < a[min]){
				  min=j;
			  }
		  }
		  temp=a[i];
		  a[i]=a[min];
		  a[min]=temp;
		  //System.out.print(a[i]+"  ");
		  printArr(a);
	  }
	}
	
	private static void printArr(int[] a) {
		// TODO Auto-generated method stub
		System.out.print("Array :");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	static void insertionShort(int a[]){
		int i,j,key,size=a.length;
		for(i=1;i<size;i++){
			key=a[i];
			j=i-1;
			while(j>=0 && key<a[j]){
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
			//System.out.print(a[j]+"  ");
			printArr(a);
		}
	}
	
	private static void bubbleShort(int[] a) {
		// TODO Auto-generated method stub
		int i, j, min, temp, size=a.length;
		  for(i=0; i < size-1; i++ )
		  {
			  for(j=0;j<size-i-1;j++){
				  if(a[j]>a[j+1]){
					  temp=a[j];
					  a[j]=a[j+1];
					  a[j+1]=temp;
				  }
				  printArr(a);
			  }
			 
		  }
		
	}
}



