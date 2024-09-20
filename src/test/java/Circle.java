public class Circle {
	
	private double radius ;
	
	public Circle(double rad) {
		this.radius = rad;
	}
	
	public double area() {
		double circArea;
		circArea = this.radius * this.radius * Math.PI;		
		return circArea;
	}

}