package com.bayamp.cart.functional;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class FunctionalTests {
	
	@Test
	public void removeDuplicatesTest(){
		int[] myArray = {3,4,2,10,2,1,5,3,12,4,7};
		//Print the array before removing duplicates
		print(myArray);
		int[] noDuplicateArray = removeDuplicates(myArray);
		//Print the array after removing duplicates
		print(noDuplicateArray);
	}
	
	@Test
	public void sortTest(){
		int[] myArray = {4,2,8,1,5,3,12,7};
		//Print the array before sorting
		print(myArray);
		
		Arrays.sort(myArray);
		//Print the array aft sorting
		print(myArray);
		
	}
	
	
	private int[] removeDuplicates(int[] array){
		
		Set<Integer> mySet = new HashSet<Integer>();

		for(int i=0;i<array.length;i++){
			mySet.add(array[i]);
		}
		
		
		int[] temp = new int[mySet.size()];
		int counter=0;
		
		for(Integer i:mySet){
			temp[counter] = i.intValue();
			counter++;
		}
		return temp;
		
		
		
		
	}
	
	private void print(int[] array){
		System.out.print("{");
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+",");
		}
		System.out.print("}\n");
	}
	


}
