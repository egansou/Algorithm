package Question2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static int non_overlapping (int n, List<List<Integer>>l) { 
		int i = 0;
		int counter = 1;
		//Returning 0 if n is less than or equal to zero 
		//or in the list size is different from the predefined size
		if (n <= 0) return 0;
		
		//Sorting array by first element in each list
		Collections.sort(l, new SortByFirst());
		
		int current = l.get(0).get(1);
		while (i < n){
			int j;
		
			 for(j = i + 1; j < n; j++){
				 if(current < l.get(j).get(0)){
					 counter += 1;
					 current = l.get(j).get(1);
					 i = j;
					 break;
				 }	
			 }
 
			 if(counter == 1 && n > 1) {
				 counter = 0;
			 }
			 
			i++;
		}
		return counter;
	}
	   public static void main(String[] args) { 
		   Scanner s = new Scanner(System.in);
		   List<List<Integer>> list = new ArrayList<List<Integer>>();
		   List <Integer> w;
		   String range;
		   int n;
		   
		   n = s.nextInt();
		   s.nextLine();
		   for(int i = 0; i < n; i++){
			   range = s.nextLine();
			   String []ranges = range.split(" ");
			   w = new ArrayList<Integer>();
			   w.add(Integer.parseInt(ranges[0]));
			   w.add(Integer.parseInt(ranges[1]));
			   list.add(new ArrayList<Integer>(w));   
		   } 
		   
		   System.out.println("Non-ordered list: " + list.toString());
		   System.out.println("List size: " + list.size());
	       System.out.println("Result: " + non_overlapping (n,list));  
	       System.out.println("Ordered list: " + list.toString()); 
	   }
	
}
