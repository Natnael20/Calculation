/**
 * 
 */
package averagevalue;

import java.util.Arrays;

/**
 * @author ag71812
 * This class will calculate the median
 * of given numbers
 *
 */
public class Median extends AverageValue {
	
	//instance array variable
	double [] median;
	
	//getter method
	 public double getMedian() {
		 
		//r is for desired length
		 System.out.println("how many elements do you want to add");
		 int r = scanner.nextInt();
		 median = new double[r];
		 //set of user input numbers
		 System.out.println("Enter the numbers");
		 for(int i=0; i < r; i++) {
			 median[i] = scanner.nextDouble();
		 }
		 //will sort from smaller to bigger number
		 Arrays.sort(median);
		  //if the length of the array is odd, find the middle number  
		 if(median.length % 2 != 0) {
			 return median[median.length/2];
	        }
	         //if the length of the data set is even, take the average of the two middle numbers
	        else {
	         return (median[median.length/2] + median[median.length/2-1]) / 2.0;
	        }
		 
	 }

}
