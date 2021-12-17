package activities;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		HashSet<String> myset= new HashSet<String>();
		myset.add("honey");
		myset.add("rosy");
		myset.add("mary");
		myset.add("saru");
		myset.add("emmy");
		myset.add("harry");
		
		System.out.println("Size of hashset: " + myset.size());
		
		System.out.println("remove of mammu: "+myset.remove("saru"));
		System.out.println("remove of mammu: "+myset.remove("mammu"));
		System.out.println("Size of hashset: "+ myset.contains("harry"));
		
		
		System.out.println("print all elements");
		
		for(String s : myset) {
			System.out.println(s);
		}
	}

}
