import java.util.*;
public class Main {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
	// rectangle Main:
		
		int sumA = 0, sumP = 0, len, wid;
		for (int i = 1 ; i < 3 ; i++) {
		
			System.out.println("enter rec " + i + " length: ");
			len = input.nextInt();
			System.out.println("enter rec " + i + " width: ");
			wid = input.nextInt();
			Rectangle rec = new Rectangle(len,wid);

			// drawing the rectangle
			rec.draw();

			// duplicating the first rec
			if (i == 1) {
				System.out.println("duplicated rectangle: ");
				len *= 2;
				wid *= 2;
				rec = new Rectangle(len,wid);
				rec.draw();
			}

			// calculating area
			sumA += rec.calcArea();
			
			// calculating paramete
			sumP += rec.calcPara();
		}
		
		System.out.println("the sum of both rectangles areas is: "+ sumA);
		System.out.println("the sum of both rectangles parameters is: "+ sumP);
	
	// circle Main:
	double circRad;
	for (int j = 1 ; j < 3 ; j++) {
		System.out.println("enter radius for circle "+ j);
		circRad = input.nextDouble();
		Circle cir = new Circle(circRad);
		
		// calling the area calculator and printing the area
		System.out.println("the area of circle " + j + " is: " + cir.area());
		
		}
	}
}