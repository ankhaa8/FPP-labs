package lab2_9closedcurve.good4_4;

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
	@Override
	public double computePerimeter() {		
		return 2*(width+height);
	}
}
