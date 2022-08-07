/*/* Name: Devin Spiker
 * Course: CMIS 242-6384
 * Date: 19 May 2022
 * Description: Project1 class that calls upon the weight class, creates weight objects and uses the methods from the weight class to do calculations
 * Assignment 1
 */
import java.util.Arrays;
import java.util.ArrayList;
public class Project1 {
	
	//begin testing within main method
	public static void main(String[] args) {
	
		Weight weight1 = new Weight(11, 3);
		Weight weight2 = new Weight(7, 20);
		weight2.setNormalize();
		System.out.println(weight2);
		Weight weight3 = new Weight(14, 6);
		
		ArrayList<Weight> listOfWeights = new ArrayList<Weight>();
		
		listOfWeights.add(findMinimum(weight1, weight2, weight3));
		System.out.println("The minimum weight value is " + listOfWeights.get(0));
		listOfWeights.add(findMaximum(weight1,weight2,weight3));
		System.out.println("The maximum weight value is " + listOfWeights.get(1));
		listOfWeights.add(findAverage(weight1,weight2,weight3));
		System.out.println("The average weight value is " + listOfWeights.get(2));
		System.out.println("Weight 1 has the attributes: " + weight1);
		
		weight1.addTo(weight2);
		System.out.println(weight1);
		
		System.out.println("Weight 1 has the attributes: " + weight1);
		
		boolean marker = weight1.lessThan(weight3);
		System.out.println(marker);
		
		marker = weight2.lessThan(weight3);
		System.out.println(marker);
	}//end of main
	//private method that finds the Minimum weight object
	private static Weight findMinimum(Weight weight1, Weight weight2, Weight weight3) {
		ArrayList<Weight> weightList = new ArrayList<Weight>();
		weightList.add(weight1);
		weightList.add(weight2);
		weightList.add(weight3);
		double comparison = weight1.totalOunces();
		int index = 0;
		for (int i = 0; i < weightList.size(); i++) {
			double placeHolder = weightList.get(i).totalOunces();
			if (placeHolder < comparison) {
				comparison = placeHolder;
				index = i;
			}//end of conditional
		}//end of for loop
		return weightList.get(index);
	}//end of method
	//private method that finds the Maximum weight object
	private static Weight findMaximum(Weight weight1, Weight weight2, Weight weight3) {
		ArrayList<Weight> weightList = new ArrayList<Weight>();
		weightList.add(weight1);
		weightList.add(weight2);
		weightList.add(weight3);
		double comparison = weight1.totalOunces();
		int index = 0;
		for (int i = 0; i < weightList.size();i++) {
			double placeholder = weightList.get(i).totalOunces();
			if (placeholder > comparison) {
				comparison = placeholder;
				index = i;
			}//end of conditional
		}//end of for loop
		return weightList.get(index);
	}//end of method
	// a private method that finds the average weight object
	private static Weight findAverage(Weight weight1,Weight weight2, Weight weight3) {
		ArrayList<Weight> weightList = new ArrayList<Weight>();
		weightList.add(weight1);
		weightList.add(weight2);
		weightList.add(weight3);
		Weight tempWeight = new Weight(0, 0);
		for (int i =0; i <weightList.size(); i++) {
			tempWeight.addTo(weightList.get(i));
		}
		double total = tempWeight.totalOunces();
		double averageOunces = total / 3;
		int pounds = (int) averageOunces / 16;
		double ounces = averageOunces % 16;
		Weight newWeight = new Weight(pounds, ounces);
		newWeight.setNormalize();
		return newWeight;
	}//end of method
}//end of class
