package averagevalue;
import java.util.*;

public class DifferentCalculation {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		AverageValue averagevalue = new AverageValue();
		Median median = new Median();	
		StandardDeviation Standardavvikelse = new StandardDeviation();
		
		System.out.println("1. Average value" + 
		"\n2. Median" + "\n3. StandardAvvikelse");
		System.out.println("Press a number from either one");
		int Switch = scanner.nextInt();
		switch(Switch) {
		case 1 : System.out.println("The average value is" + averagevalue.getAverage());
		break;
		case 2 : System.out.println("The median is " + median.getMedian());
		break;
		case 3 : System.out.println("StandardAvvikelse är " + Standardavvikelse.getStandardavvikelse());
		default:
			System.out.println("Try again");
			break;
		}
		

		
		
	}

}
