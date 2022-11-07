package Assignment3;


import java.util.*;

public class Question3 {
	
	//Write a program which can store List of Integer values and print all the values using for iterator


	public static void main(String[] args) {
       List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		ArrayList<Integer> list = new ArrayList<>(list1);
		
		Iterator<Integer> I1 = list.iterator();
		
		while(I1.hasNext()) {
			int number = I1.next();
			
			System.out.println(number);
		}
		

	}

}
