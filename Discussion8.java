import java.util.Scanner;
import java.io.*;

public class Discussion8 {

	public static void main(String[] args) {
	
		Scanner scanInt = new Scanner(System.in);
		PrintWriter data = null;
		int [][] A;
		
		//grab desired 2D array length
		System.out.println("Please provide the number of row");
		int rows = scanInt.nextInt();
		System.out.println("Please provide the number of columns");
		int cols = scanInt.nextInt();
		
		//create table
		A = new int[rows][cols];
		createTable(A,rows,cols);
		
		//print the table before sending it over
		printTable(A,rows,cols);
		
		
		//we are going to put the table of 1's and 0's very neatly over in the text file.
		try {
			data = new PrintWriter( new FileWriter("Week8/discussion8.txt"));
            for (int row = 0; row < rows; row++) {
            	for (int col = 0; col < cols; col++) {
            		data.print(" ");//add a space
            		data.print(A[row][col]);// iterate through the 2D array
            	}
            	data.println();//moves to next line
            }
            data.flush();//flushes data to file
            data.close();//closes PrintWriter
		}
		catch (IOException e) {
			
		}
		
		
	}
	//createTable method which replaces the empty contents of the 2D array with 1's and 0's in a pattern
	public static void createTable(int [][] A, int rows, int cols) {
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				if (row != col) {
					A[row][col] = 0;
				} else {
					A[row][col] = 1;
				}
			}
		}
	}
	//a method for printing the contents of the table
	public static void printTable(int[][] A, int rows, int cols) {
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				System.out.print(A[row][col]);
			}
			System.out.println();
		}
	}

}
