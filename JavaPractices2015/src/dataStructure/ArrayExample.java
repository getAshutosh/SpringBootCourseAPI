package dataStructure;

public class ArrayExample {
	public static void main(String[] args) {
		twoDimentionarry(3);
	}
private static void twoDimentionarry(int n) {
		// TODO Auto-generated method stub
	int arrD[][] = new int[n][n];
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			arrD[i][j]=i+j;
			System.out.print(arrD[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("After Rotating 90 degree...");
	for(int i=0;i<n;i++){
		for(int j=n-1;j>=0;j--){
			//arrD[i][j]=i+j;
			System.out.print(arrD[j][i]+" ");
		}
		System.out.println();
	}
	
	}

}
