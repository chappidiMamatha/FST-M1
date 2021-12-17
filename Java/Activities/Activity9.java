package activities;

import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		ArrayList<String> mylist = new ArrayList<String>();
		mylist.add("mike");
		mylist.add("siri");
		mylist.add("hari");
		mylist.add(3,"priya");
		mylist.add(1,"sam");
	
	System.out.println("Print All the Objects:");
	
	for(String s: mylist) {
		System.out.println(s);
	}
	
	System.out.println("3rd element in the list is: " + mylist.get(2));
    System.out.println("Is sam is in list: " + mylist.contains("sam"));
    System.out.println("Size of ArrayList: " + mylist.size());
    
    mylist.remove("mike");

    System.out.println("New Size of ArrayList: " + mylist.size());
   }
}
	
