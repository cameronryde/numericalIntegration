package numericalIntegration;

public class Exact{
	
	public static double fIntgrl(double coeffs[], double x) {
		//this is the integral of our formula
		//(Ax^6/6)+(Bx^5/5)+(Cx^4/4)+(Dx^3/3)+(Ex^2/2)+(Fx/1)
		//To find the exact area we plug in our a and b into the
		//integral of the formula and subtract them
		return ((coeffs[0] * (Math.pow(x,6)))/6)+((coeffs[1] * (Math.pow(x,5)))/5) + 
		  ((coeffs[2] * (Math.pow(x,4)))/4) + ((coeffs[3] * (Math.pow(x,3)))/3) + 
		  ((coeffs[4] * (Math.pow(x,2)))/2) + ((coeffs[5] * x)/1);
	}
	
	public static double getExact(double[] coeffs, double a, double b) {
		//Subtracts the integral at a and b and subtracts them
		return Math.abs(fIntgrl(coeffs, a) - fIntgrl(coeffs, b));
	}
}

