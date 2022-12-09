/**
 * 
 */
package averagevalue;

/**
 * @author ag71812
 * In this class we will calculate standardAvvikelse:
 * first Work out the Mean (the simple average of the numbers)
2. then for each number: subtract the Mean and square the result
3. Then work out the mean of those squared differences.
4. Take the square root of that!

 */
public class StandardDeviation extends AverageValue{
	
double[] standard_deviation;
double averagevalue;

	
	public double getStandardavvikelse() {
        //get average number
        double sum = 0;    
        for(double value : average)
        sum+=value;
        averagevalue = sum / average.length;     
        
     // in this part value/all elements will sum first
     // method math.pow will multiply with the number we get after subtraction of value and mean
        System.out.println("write the arguments");
        double i;
        for(i=0; i < standard_deviation.length; i++) {
        	standard_deviation[(int) i] = scanner.nextDouble();
            // använda potens 
        	standard_deviation[(int) i] += (int) Math.pow(standard_deviation[i]-averagevalue,2);
        } 
         
     // in this part the quotient will generally be divided by two using
        // square root
         return Math.sqrt(standard_deviation[(int) i]/i);
     }
}
