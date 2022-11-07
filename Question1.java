package Assignment3;
import java.util.*;

public class Question1 {

	public static void main(String[] args) {
		
		//Write a program which can store List of Integer values and print all the values using for loop

		
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		ArrayList<Integer> list = new ArrayList<>(list1);
		
		for(int i=0 ; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		

	}
	
	
	

}
