package CollectionInJava;

import java.util.*;


public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<Integer> RollNum = new ArrayList<Integer>();
		RollNum.add(1001);
		RollNum.add(102);
		RollNum.add(111);
		RollNum.add(112);
		
		Collections.sort(RollNum);
		System.out.println(RollNum);
		System.out.println("Size of ArrayList is:- "+RollNum.size());
		
		for(int i=0; i<RollNum.size();i++) {
			
			System.out.println(RollNum.get(i));
		}
		
		
		
		
	}

}
