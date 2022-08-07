/* Name: Devin Spiker
 * Course: CMIS 242-6384
 * Date: 19 May 2022
 * Description: Weight class that houses the constructors, instance methods and attributes that will be used for the Project1 class
 * Assignment 1
 */
import java.util.Scanner;
public class Weight {

	//attributes
	final private double OUNCES_IN_A_POUND = 16;
	private int pounds;
	private double ounces;

	//constructor that creates weight object
	public Weight(int pounds, double ounces) {
	       this.pounds = pounds;
	       this.ounces = ounces;
	}
	// getter for getting ounces
	private double toOunces() {
	      return this.ounces;
	}
	// a method for normalizing the attributes of an objects pounds and ounces
	private void normalize() {
		if (this.ounces >= this.OUNCES_IN_A_POUND) {
			this.pounds = this.pounds + ((int) this.ounces / (int) this.OUNCES_IN_A_POUND);
			this.ounces = this.ounces % this.OUNCES_IN_A_POUND;
		} else if (this.ounces < 0 || this.pounds < 0) {
			System.err.println("cannot be negative");
		} else { 
			System.out.println("Pounds and ounces are already normalized");
		}
	}
	// a method that evaluates whether an object is lessThan another object
	public boolean lessThan (Weight weight) {
		boolean isLessThan = true;
		if (((weight.pounds * (int) this.OUNCES_IN_A_POUND) + (int) weight.ounces) < ((this.pounds * (int) this.OUNCES_IN_A_POUND) + (int) this.ounces)) {
			isLessThan = false;
			return isLessThan;
		} else {
			isLessThan = true; 
			return isLessThan;
		}
	}
	// a method that adds the weight of an object to an object
	public void addTo (Weight weight) {
	this.pounds = weight.pounds + this.pounds;
	this.ounces = weight.ounces + this.ounces;
	}
	//a method I personally created that acts as a conversion to house the total number of ounces for easier comparison
	public double totalOunces() {
		double totalOunces = this.ounces + (this.pounds * this.OUNCES_IN_A_POUND);
		return totalOunces;
	}
	// a method that accesses the private method to normalize an object. Method is unreachable without this
	public void setNormalize() {
		normalize();
	}
	// a method used to change the number of ounces of an object
	public void setOunces(double ounces) { 
		this.ounces = ounces;
	}
	// a method that is a getter. retrieves the number of pounds for an object
	public int getPounds() {
		return this.pounds;
	}
	// a method that sets the number of pounds for an object
	public void setPounds(int pounds) {
		this.pounds = pounds;
	}
	// a getter that retrieves the private final constant for the total ounces in a pound
	public double getOUNCES() {
		return this.OUNCES_IN_A_POUND;
	}
	// a method that overwrites the print stream to print the objects in a specified format
	public String toString() {
		String toString = this.getPounds() + " pounds " + String.format("%.2f",this.toOunces()) + " ounces ";
		return toString;
	}
}
