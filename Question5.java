package Assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question5 {

	public static void main(String[] args) {
		/* Create a list of numbers 33,44,55,66,77,88 and perform below operation
		Remove second element from list using index
		Remove second element from list using value
		Add 90 at index 3
		Get the length of list
		Print all values from list using any values
		Convert List into array.*/
		
		//List<Integer> list = Arrays.asList(3,44,55,66,77,88);
		
		ArrayList<Integer> alist = new ArrayList<>();
		alist.add(33);
		alist.add(44);
		alist.add(55);
		alist.add(66);
		alist.add(77);
		alist.add(88);
		//Remove second element from list using index
		alist.remove(1);
		
		System.out.println(alist);
		
		//Remove second element from list using value
		alist.remove(Integer.valueOf(55));
		
		System.out.println(alist);
		
		//Add 90 at index 3
		alist.add(3, 99);
		
		System.out.println(alist);
		
		//Get the length of list
		
		System.out.println("Length of List is:"+alist.size());
		
		//Convert List into array
		int[] arr = new int[alist.size()];
		
		for(int i=0 ;i<arr.length ; i++)
		{
			arr[i]= alist.get(i);
		}
		for(int number: arr)
		{
			System.out.println(number);
		}


	}

}
