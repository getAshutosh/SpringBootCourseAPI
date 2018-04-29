package effectivejavabookExample;

import java.util.HashMap;
import java.util.Map;

public class EqualAndHashCode {

	public EqualAndHashCode() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String []str) {
		/*PhoneNumber pn = new PhoneNumber(707, 867, 5309);
		System.out.println("hashcode :"+pn.hashCode());
		Map<PhoneNumber, String> m = new HashMap<PhoneNumber, String>();
		m.put(pn,"Ashutosh");
		System.out.println("hascode after setting into map : "+pn.hashCode());
		System.out.println("name :"+m.get(pn));*/
		
		System.out.println("hashcode without object creation :"+new PhoneNumber(707, 867, 5309).hashCode());
		System.out.println("hashcode without object creation :"+new PhoneNumber(708, 867, 5309).hashCode());
		Map<PhoneNumber, String> m = new HashMap<PhoneNumber, String>();
		m.put(new PhoneNumber(707, 867, 5309),"Ashutosh");
		m.put(new PhoneNumber(708, 867, 5309),"AJJ");
		System.out.println("hascode after setting into map : "+new PhoneNumber(707, 867, 5309).hashCode());
		System.out.println("hascode after setting into map : "+new PhoneNumber(708, 867, 5309).hashCode());
		System.out.println("name :"+m.get(new PhoneNumber(707, 867, 5309)));
		System.out.println("name :"+m.get(new PhoneNumber(708, 867, 5309)));
	}

}

final class PhoneNumber  implements Cloneable{
	private final short areaCode;
	private final short prefix;
	private final short lineNumber;

	public PhoneNumber(int areaCode, int prefix, int lineNumber) {
		rangeCheck(areaCode, 999, "area code");
		rangeCheck(prefix, 999, "prefix");
		rangeCheck(lineNumber, 9999, "line number");
		this.areaCode = (short) areaCode;
		this.prefix = (short) prefix;
		this.lineNumber = (short) lineNumber;
	}
	@Override
	protected PhoneNumber clone()  {
		// TODO Auto-generated method stub
		try{
		return (PhoneNumber)super.clone();
		}catch(CloneNotSupportedException e){
			throw new AssertionError();
		}
	}
	private static void rangeCheck(int arg, int max, String name) {
		if (arg < 0 || arg > max)
			throw new IllegalArgumentException(name + ": " + arg);
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof PhoneNumber))
			return false;
		PhoneNumber pn = (PhoneNumber) o;
		return pn.lineNumber == lineNumber && pn.prefix == prefix && pn.areaCode == areaCode;
	}
	// The worst possible legal hash function - never use!
	
	/*@Override public int hashCode()
	{ return 42; }*/
	//A good hash function tends to produce unequal hash codes for unequal
		//objects.
	/*@Override public int hashCode() {
		int result = 17;
		result = 31 * result + areaCode;
		result = 31 * result + prefix;
		result = 31 * result + lineNumber;
		return result;
		}
	*/
	
	// Lazily initialized, cached hashCode
	private volatile int hashCode; // (See Item 71)
	@Override public int hashCode() {
		System.out.println("hashCode :"+hashCode);
	int result = hashCode;
	if (result == 0) {
	result = 17;
	result = 31 * result + areaCode;
	result = 31 * result + prefix;
	result = 31 * result + lineNumber;
	hashCode = result;
	}
	return result;
	}
	
	// Broken - no hashCode method!
	// Remainder omitted
}