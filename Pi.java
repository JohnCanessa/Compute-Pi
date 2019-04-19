package canessa.pi;

/*
 * Compute the value of Pi using different methods.
 * https://www.wikihow.com/Calculate-Pi
 */
public class Pi {

	// **** constructor ****
	public Pi () {
	}
	
	// **** Gregory-Leibniz infinite series ****
	public double computeGLSeries(int loops) {
		
		// **** ****
		double 	pi 	= 0.0;
		
		// **** loop computing Pi ****
		for (int i = 0; i <= loops; i++) {
			
			// **** compute this element in the series ****
			double p = 4.0 / (i * 2 + 1);
			
			// **** update value ****
			if (i % 2 == 0)
				pi += p;
			else
				pi -= p;
		}
				
		// **** return the value of Pi ****
		return pi;
	}
	
	// **** Nilakantha infinite series ****
	public double computeNSeries(int loops) {
		
		// **** ****
		double 	pi 	= 3.0;
		boolean add = true;

		// **** loop computing Pi ****
		for (int i = 1; i <= loops; i++) {

			// **** compute this element in the series ****
			double p = 4.0 / (1.0 * (i * 2) * (i * 2 + 1) * (i * 2 + 2));

			// **** update value ****
			if (add)
				pi += p;
			else
				pi -= p;
			
			// **** update flag ****
			add = add ? false : true;
		}

		// **** return Pi ****
		return pi;
	}
	
	// **** using a limit ****
	public double usingLimit(int largeNum) {
				
		// **** large number converted to radians ****
		double rad = Math.PI / largeNum;
		
		// **** compute Pi ****
		double pi = largeNum * Math.sin(rad);
				
		// **** return Pi ****
		return pi;
	}
	
	// **** using a number between 0 and 1 ****
	public double usingRandNum(double x) {
		
		// **** ****
		System.out.println("    x: " + x);

		// **** compute Pi ****
		double pi = 2.0 * (Math.asin(Math.sqrt(1.0 - (x * x))) + Math.asin(x));
		
		// **** ****
		return pi;
	}

}
