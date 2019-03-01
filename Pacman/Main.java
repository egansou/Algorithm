/*package Part1;*/

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) { 

		String[]dimensions;
		BigInteger [][]grid;
		int n;

		Scanner s = new Scanner(System.in);

		dimensions = s.nextLine().split(" ");
		grid = new BigInteger[Integer.parseInt(dimensions[0])+1][Integer.parseInt(dimensions[1])+1];
		int col_length = grid.length;
		int row_length = grid[0].length;
		for(int i = 0; i < col_length; i++){
			for(int j = 0; j < row_length; j++){
				grid [i][j] = new BigInteger("-1");
			}
		}
		
		n = s.nextInt();
		s.nextLine();
		
		for(int i = 0; i < col_length; i++){
			grid[i][0] = new BigInteger("1");
		}
		
		for(int i = 0; i < row_length; i++){
			grid[0][i] = new BigInteger("1");
		}
		
		for (int i = 0; i < n; i++){
			String [] obstacles = s.nextLine().split(" ");
			int row = Integer.parseInt(obstacles[0]);
			int col = Integer.parseInt(obstacles[1]);
			grid[row][col] = new BigInteger("0");
			if (row == 0){
				for(int j = col + 1; j < row_length; j++){
					grid[row][j] = new BigInteger("0");
				}
			}
			if (col == 0){
				for(int j = row + 1; j < col_length; j++){
					grid[j][col
					        ] = new BigInteger("0");
				}
			}
		}
		s.close();

		for(int i = 1; i < col_length; i++){
			for(int j = 1; j < row_length; j++){
				if (!grid [i][j].equals(new BigInteger("0"))){
					BigInteger val = new BigInteger("0");
					val = val.add(grid[i-1][j]);
					val = val.add(grid[i][j-1]);
					grid[i][j] = val;
				}
			}
		}
		
		/*for(int i = 0; i < col_length; i++){
			for(int j = 0; j < row_length; j++){
				System.out.print(grid [i][j]);
			}
			System.out.println();
		}*/
		
		BigInteger f = new BigInteger("10000000000000000");
		//System.out.print("The answer is: ");
		if(grid[0][0].equals(new BigInteger("0"))) System.out.println(0);
		else System.out.println(grid[col_length-1][row_length-1].mod(f));
	}
}
