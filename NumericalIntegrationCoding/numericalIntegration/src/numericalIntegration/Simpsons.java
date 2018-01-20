package numericalIntegration;

public class Simpsons {
	
	public static double f(double[] coeffs, double x) {
		//our formula that was given
		//f(x)=Ax^5 + Bx^4 + Cx^3 + Dx^2 + Ex + F
		return (coeffs[0]*Math.pow(x, 5))+(coeffs[1]*Math.pow(x, 4))+
				(coeffs[2]*Math.pow(x, 3))+(coeffs[3]*Math.pow(x, 2))+
				(coeffs[4]*x)+coeffs[5];
	}


	public static double getSimps(double a, double b, int n, double[] coeffs) {
		
		double h = (b - a)/n;//Rectangle width
		double x = a;//initial value of x will be a
		double mid = x + h/2;//midpoint of each "rectangle"
		double sum = f(coeffs, x);//start the sum as the initial value f(x)
		int i = 0;//counter for adding

		//add up all the functions at the different points along the curve
		while (i < n - 1){
			i++;
			x = a + i * h;
			sum = sum + 4 * f(coeffs, mid) + 2 * f(coeffs, x);
			mid = x + h/2;
		}

		//finally add the last two points
		sum = sum + 4 * f(coeffs, mid) + f(coeffs, b);
		return sum * h / 6;
	}
}
