import java.util.ArrayList;
import java.util.List;


public class AllArrayExmpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> aList = new ArrayList<>();
		aList.add(10);
		aList.add(20);
		aList.add(5);
		aList.add(30);
		aList.add(4);
		aList.add(20);
		aList.add(60);
		List<Integer> bList = solution(aList);
		bList.stream().forEach(System.out::println);

	}
	public static List<Integer> solution(List<Integer> aList){
		for(int i=1; i<aList.size()-1;i++){
			if(aList.get(i)<aList.get(i-1) && aList.get(i)<aList.get(i+1)){
				aList.remove(i);
				solution(aList);
			}
		}
		return aList;
		
	}

}
