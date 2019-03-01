//package Part2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Main {

	
	public static BigInteger compute (HashMap<Integer, ArrayList<Integer>> hmap,
			String[] data, int index, HashSet<Integer> visited) {
		BigInteger mult_temp = new BigInteger("1");
		BigInteger add_temp = new BigInteger("0");
		if (data[index-1].equals("*") ){
			int size = hmap.get(index).size();
			ArrayList<Integer> l = hmap.get(index);
			visited.add(index);
			for(int i = 0; i < size;i++){
				if (!visited.contains(hmap.get(index).get(i))){
				if (data[l.get(i)-1].equals("*") ||data[l.get(i)-1].equals("+")){
					mult_temp = mult_temp.multiply(compute(hmap, data, l.get(i),visited));
				}
				else mult_temp = mult_temp.multiply(BigInteger.valueOf(Long.parseLong(data[l.get(i)-1])));
				}
			}
			return mult_temp;
		}

		else if (data[index-1].equals("+") ){
			int size = hmap.get(index).size();
			ArrayList<Integer> l = hmap.get(index);
			visited.add(index);
			for(int i = 0; i < size;i++){
				if (!visited.contains(hmap.get(index).get(i))){
				if (data[l.get(i)-1].equals("*") ||data[l.get(i)-1].equals("+")){
					add_temp = add_temp.add(compute(hmap, data, l.get(i),visited));
				}
				else add_temp = add_temp.add(BigInteger.valueOf(Long.parseLong(data[l.get(i)-1])));
				}
			}
			return add_temp;
		}
		return BigInteger.valueOf(Long.parseLong(data[index-1]));
	}

	public static void main(String[] args) { 

		int n;
		String[] data;
		HashMap<Integer, ArrayList<Integer>> hmap = new HashMap<Integer, ArrayList<Integer>>();
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		s.nextLine();

		data = s.nextLine().split(" ");

		for(int i = 0; i < n-1; i++){
			String []ranges = s.nextLine().split(" ");
			if (data[Integer.parseInt(ranges[0])-1].equals("*") ||
					data[Integer.parseInt(ranges[0])-1].equals("+")){
			if  (hmap.containsKey(Integer.parseInt(ranges[0]))){
				ArrayList <Integer> update = hmap.get(Integer.parseInt(ranges[0]));
				update.add(Integer.parseInt(ranges[1]));
				hmap.put(Integer.parseInt(ranges[0]),update);   
				}
			if (!hmap.containsKey(Integer.parseInt(ranges[0]))) {
				ArrayList<Integer> children = new ArrayList<Integer>();
				children.add(Integer.parseInt(ranges[1]));
				hmap.put(Integer.parseInt(ranges[0]),children);
			   }
			}
			if (data[Integer.parseInt(ranges[1])-1].equals("*") ||
					data[Integer.parseInt(ranges[1])-1].equals("+")){
			if (hmap.containsKey(Integer.parseInt(ranges[1]))) {
				ArrayList <Integer> update = hmap.get(Integer.parseInt(ranges[1]));
				update.add(Integer.parseInt(ranges[0]));
				hmap.put(Integer.parseInt(ranges[1]),update);   
				}
			if (!hmap.containsKey(Integer.parseInt(ranges[1]))) {
				ArrayList<Integer> children = new ArrayList<Integer>();
				children.add(Integer.parseInt(ranges[0]));
				hmap.put(Integer.parseInt(ranges[1]),children);
				}
			}
			} 
		
		s.close();

		/*Set set = hmap.entrySet();
		      Iterator iterator = set.iterator();
		      while(iterator.hasNext()) {
		         Map.Entry mentry = (Map.Entry)iterator.next();
		         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
		         System.out.println(mentry.getValue());
		} */

		HashSet<Integer> visited = new HashSet<Integer> ();
		BigInteger f = new BigInteger("10000000000000000"); 
		//System.out.print("The total is: ");
		System.out.println(compute(hmap,data,1,visited).mod(f));

	}

}