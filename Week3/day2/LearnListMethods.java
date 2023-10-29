package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class LearnListMethods {
	
	public static void main(String[] args) {
		//syntax
//      Interface<Generic> listname = new Implementation class		
		List<String> mentors = new ArrayList<>();
		
		//add items into the list
		mentors.add("Aravind");//0
		mentors.add("Vidhya");//1
		mentors.add("Ragu");//3
		mentors.add("Dilip");//4
		mentors.add(2,"Jagadeesh");//2
		
		//to print the list
		System.out.println(mentors);
		
		//to find the size of the list
		int size = mentors.size();
		System.out.println("List Size is :"+size);
		
		//to get a particular element from the list
		String secondElement = mentors.get(2);
		System.out.println(secondElement);
		
		//to remove an element from List
		mentors.remove(3);
		System.out.println(mentors);
		System.out.println("List Size is :"+mentors.size());
		
		//to make list empty
		mentors.clear();
		System.out.println(mentors);
		System.out.println(mentors.isEmpty());
		
		
		
		
	}

}
