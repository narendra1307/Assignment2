package Assignment3;

import java.util.ArrayList;
import java.util.Arrays;

public class Question6 {

	public static void main(String[] args) {
		/*Write a program which will display true if list contains Mobile else prints false
	      List  - Web Automation, API Automation, Mobile Automation.
	      Output – True */
		
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Web Automation");
		list.add("API Automation");
		list.add("Mobile Automation");
			
		String str= list.toString();
		
		String[] a =str.split(" ");
		
		ArrayList<String> newlist = new ArrayList<String>(Arrays.asList(a));
		System.out.println(newlist.contains("Mobile"));
	}

}
