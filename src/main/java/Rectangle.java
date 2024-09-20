public class Rectangle {
	private int length ;
	private int width ;

	public Rectangle(int l, int w) {
		this.length = l ;
		this.width = w ;
	}

	public void draw(){
		for(int i = 0 ; i < this.length ; i++) {
			for (int j = 0 ; j < this.width ; j++)
				System.out.print("*");
			System.out.println("");
		}
	}

	public int calcArea() {
		int Area = (length * width);
		return Area;
	}

	public int calcPara() {
		int Para = (2 * (length + width));
		return Para;
	}
}