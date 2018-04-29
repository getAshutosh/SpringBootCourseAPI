package programing.practice.sep2017;
//adding to GIT remot
public class SynechronIntrvwExmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arraInt = {0,0,1,0,0,1,0,1,0};
		int count=0;
		for(int i=0; i<arraInt.length; i++){
			int j=arraInt[i];
			
			if(equalToZero(j))
				count++;
		}
		System.out.println("Count :"+count);
	}

	private static boolean equalToZero(int j) {
		// TODO Auto-generated method stub
		try{
		int val = 1/j;
			return false;
		}catch(Exception e){
			return true;
		}
		
	}
	
}
