package Assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question4 {

	public static void main(String[] args) {
		// Write a program which will print sum of all numbers which is stored in list
		
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		ArrayList<Integer> list = new ArrayList<>(list1);
		
		
		int sum=0;
		
		for(int i=0;i<list.size(); i++)
		{
			sum = sum+list.get(i);
		}
		
		System.out.println(sum);
		

	}

}
