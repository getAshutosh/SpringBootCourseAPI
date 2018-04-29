package capgemini;

public class ReverseString {

	public static void main(String[] args) {
		// TODO without using any string api reverse the string
		String str = "I know your Name";
		System.out.println("Original String : "+str);
		System.out.println("Reverse String : "+reverseString(str));
	}

	private static String reverseString(String str) {
		StringBuilder reverseStr =  new StringBuilder(str.length());
		if(null!=str && !"".equals(str)){
			for(int i=str.length()-1; i>=0;i--)
			{
				reverseStr =  reverseStr.append(str.charAt(i));
			}
		}
		return reverseStr.toString();
	}

}
