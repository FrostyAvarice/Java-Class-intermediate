import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArrayFile {

	public static void main(String[] args) {

		Scanner data = null;
		//REMOVED the following since they are not needed
		//PrintWriter display = null;
		//ArrayList names;
		//names = new ArrayList();
		String[][] output = new String[5][5];

		try {
			data = new Scanner(new File("C:/UMGC File/data.txt"));

			if (data.hasNextLine()) {

				for (int i = 0; i < output.length; i++) {
					String[] rowArray = data.nextLine().split(" "); //separated by space based on the data.txt provided
					for (int j = 0; j < rowArray.length; j++) {
						output[i][j] = rowArray[j];	//No need to parse since rowArray is already contains String datatype values
					}
				}

				//REMOVED the following since they are not needed
				//String inputName = data.nextLine();
				//String [][] output = data.split(",");
			}

			int row, col;

			System.out.println("This is the seating chart for this class.");

			for (row = 0; row < 5; row++) {
				for (col = 0; col < 5; col++) {
					// Used System.out.printf to format the display as a table
					// %-10s -> where 10 is the number of spaces used to display the name, 
					// 		-> where negative sign (-) is used to denote left indentation
					//		-> where "s" is used to inform that "String" will be displayed
					System.out.printf("%-10s", output[row][col]);	
				}
				System.out.println();
			}
			if (System.out.checkError())
				System.out.println("Some error occurred while writing the file.");
			else
				System.out.println("Done!");

			//display.close();
			data.close();
		}
		catch (FileNotFoundException e) {

			System.out.println("Cannot find file data.txt!");
			return;
		}
	}
}
