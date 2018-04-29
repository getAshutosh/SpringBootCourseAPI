import java.util.Arrays;


public class OddNumber {
	
/*	static int[] oddNumbers(int l, int r) {
        
         * Write your code here.
         
		int size = r-l;
        int[] temp= new int[size];
        int j=0;
        while(l<=r){
            int number = l;
            if((number%2)!=0){
            	temp[j]= number;
            	j++;
            	}
            l=l+1;
        }
        return temp;
    }*/
	  static int[] oddNumbers(int l, int r) {
	        /*
	         * Write your code here.
	         */
	        int n=0;
	        if(l%2==0 |r%2==0){
	           n= r-l/2;
	        }
	        else if(l%2!=0 |r%2!=0){
	            n = (r-l)/2+1; 
	        }
	        else{
	            if(l%2!=0){
	                n=(r-l+1)/2;
	            }else{
	                n=(r-l-1)/2+1;
	            } 
	        }
	        int[] arr=new int[n];
	        int j=0;
	        for(int i=l;i<=r;i++){
	            if(i%2!=0){
	                arr[j] =i;
	                j++;
	            }
	            
	        }
	        return arr;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] res = OddNumber.oddNumbers(2, 5);
		Arrays.stream(res).filter(e->e!=0).forEach(System.out::println);
		
	}

}
