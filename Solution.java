package canessa.pi;

import java.util.Random;

/*
 * Test different methods to generate Pi
 */
public class Solution {

	// **** test scaffolding entry point ****
	public static void main(String[] args) {
		
		// **** ****
		final int MAX_LOOPS = 10000000;

		// **** instantiate object ****
		Pi pi = new Pi();
		
		// **** ****
		for (int loops = 1; loops <= MAX_LOOPS; loops *= 10) {
			
			// **** ****
			System.out.println("loops: " + loops);
			
			// **** compute Pi ****
			double val = pi.computeGLSeries(loops);
			
			// **** display pi ****
			System.out.println("computeGLSeries pi: " + val);
			
			// **** compute Pi ****
			val = pi.computeNSeries(loops);
			
			// **** display pi ****
			System.out.println(" computeNSeries pi: " + val);

			// **** compute Pi ****
			val = pi.usingLimit(loops);
			
			// **** display pi ****
			System.out.println("     usingLimit pi: " + val);
			
			// **** random number between 0 and 1 ****
			Random rand = new Random();
			double x = rand.nextDouble();
			while ((x <= 0.0) && (x >= 1.0))
				x = rand.nextDouble();
			
			// **** compute Pi ****
			val = pi.usingRandNum(x);
			
			// **** display pi ****
			System.out.println("   usingRandNum pi: " + val);
		}
		
	}

}
