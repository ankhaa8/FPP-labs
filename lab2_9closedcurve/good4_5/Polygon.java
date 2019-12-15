package lab2_9closedcurve.good4_5;

public interface Polygon {
	public int getNumberOfSides();	
	
	static double sum(double[] arr) {
		double sum=0;
		for(double a:arr) {
			sum+=a;
		}
		return sum;
	}
	
	default double computePerimeter() {		
		double[] arr = getArrayOfSides();		
		return sum(arr);			
	}
	
	public double[] getArrayOfSides();
}