/**
 * 
 */
package averagevalue;

import java.lang.reflect.Array;
/**
 * @author ag71812
 * This class will calculate the average value
 * with the user given input
 *
 */
import java.util.*;
public class AverageValue {
	Scanner scanner = new Scanner(System.in);
	//instance array variable
	double[] average;
	//getter method 
	public double getAverage() {
		int sum = 0;
		//r is for desired length
		System.out.println("how many arguments?");
		int r = scanner.nextInt();
		average = new double[r];
		//set of user input numbers
		System.out.println("Write down the elements");
		for(int i=0; i<average.length; i++) {
			average[i] = scanner.nextDouble();
			//the numbers will be added
			sum+=average[i];
		}
			double averagevalue = sum / average.length;
			return averagevalue;
	}
		
			
	
}
