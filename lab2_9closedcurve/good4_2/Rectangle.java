package lab2_9closedcurve.good4_2;

public class Rectangle extends ClosedCurve{
	private double width;
	private double height;
	
	public Rectangle(double w, double h){
		this.width = w;
		this.height = h;		
	}
	public double computeArea() {
		return width * height;
	}
}
