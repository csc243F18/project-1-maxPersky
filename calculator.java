package retirementPlanner;

import java.util.*;

public class calculator {
	public static void main(String[] args) {
		double yearlySavings = 0;
		int years = 0;
		double totalSaved = 0;
		Scanner input = new Scanner(System.in);
	
		System.out.println("enter your yearly savings");
		yearlySavings = input.nextDouble();
		while(yearlySavings<=0) {
			System.out.println("your yearly savings must be greater than 0");
			yearlySavings = input.nextDouble();
		}
		input.close();
		
		System.out.println("enter your years to retirement");
		years = input.nextInt();
		while(years<=0) {
			System.out.println("you must have at least 1 year to retirement");
			years = input.nextInt();
		}
		int totalYears = years;
		
		while(years > 0) {
			totalSaved += yearlySavings;
			totalSaved *= 1.05;
			years--;
		}
		System.out.println("by saving $" + yearlySavings 
				+ " per year for " + totalYears + 
				" years at 5% interest, you will retire with $"
				+ totalSaved);
	}
}
