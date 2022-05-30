
package com.java.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayList {

	// ADD ITEMS
	//1. Add items to array list
	//2. Create array list from another collections
	// ACCESS ITEMS
	//3. Size of List Collection
	//4. Get/Set items
	public static void main(String[] args) {
		// List of fruits
		// list = ['apple', 'peach', 'strawberry', 'plum', 'grapes'
		
		//1. Add items to array list
		List<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("peach");
		fruits.add("strawberry");
		fruits.add("plum");
		fruits.add("grapes");
		
		List<String> winterFruits = new ArrayList<>();
		winterFruits.add("pear");
		winterFruits.add("persimon");
		
		//2. create array list from another collections
		fruits.addAll(winterFruits);
		List<String> allFruits = new ArrayList<>(fruits);
		
		//3. size of list
		System.out.println("size: " + allFruits.size());
				
		//4. Get items from list
		System.out.println("Get item 2: " + allFruits.get(2));
		allFruits.set(3, "nectrine");
		System.out.println("Get item 3" +  allFruits.get(3));
		
		System.out.println(allFruits);
	}
	
}


