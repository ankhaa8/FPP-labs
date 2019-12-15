package lab2_9closedcurve.good4_5;

public class Rectangle extends ClosedCurve implements Polygon{
	private double width;
	private double height;
	
	public Rectangle(double w, double h){
		this.width = w;
		this.height = h;		
	}
	public double computeArea() {
		return width * height;
	}
	@Override
	public int getNumberOfSides() {		 
		return 4;		
	}
	/*@Override
	/*public double computePerimeter() {		
		return 2*(width+height);
	}*/
	@Override
	public double[] getArrayOfSides() {
		double[] arr = {width,width,height,height};
		return arr;
	}
}
