package numericalIntegration;

public class Midpoint {
	
	public static double f(double[] coeffs, double x) {
		//our formula that was given
		//f(x)=Ax^5 + Bx^4 + Cx^3 + Dx^2 + Ex + F
		return (coeffs[0]*Math.pow(x, 5))+(coeffs[1]*Math.pow(x, 4))+
				(coeffs[2]*Math.pow(x, 3))+(coeffs[3]*Math.pow(x, 2))+
				(coeffs[4]*x)+coeffs[5];
	}
	
	//Gets the approximate area under the curve using the midpoint rule
	public static double getMidpoint(double a, double b, int n, double[] coeffs) {
		//Rect Width = b-a/n
		double rectWidth = (b-a)/n;
		//We will use this to keep track of our running total of all the rectangles
		double total = 0;
		//This is the midpoint of each of each rectangle we are finding the area of
		double x = a + (.5 * rectWidth);
		
		for(int i =0; i < n; i++) {
			//Each incriment find f(x)/2
			total = total + ((f(coeffs, x))*rectWidth);
			//Add the rect width to x to find the next x we will calculate
			x = x + rectWidth;
		}
		//return the midpoint approximation
		return total;
	}
}
