
public class LineProgram {
	// Co-ordinates of point-1 of line 1
	double x1;
	double y1;
	// Co-ordinate of point-2 of line 2
	double x2;
	double y2;

	//// Co-ordinates of point-1 of line 2
	double a1;
	double b1;
	// Co-ordinates of point-2 of line 2
	double a2;
	double b2;

//Calculating value of x2-x1 for line 1
	double ValueOfX(double x1, double x2) {
		double Valueofx = x2 - x1;
		this.x1 = x1;
		this.x2 = x2;
		return Valueofx;
	}

//Calculating value of y2-y1 for line 1
	double ValueOfY(double y1, double y2) {
		double Valueofy = y2 - y1;
		this.y1 = y1;
		this.y2 = y2;
		return Valueofy;
	}

	// Calculating value of a1-a1 for line 2
	double ValueOfA(double a1, double a2) {
		double Valueofx = a2 - a1;
		this.a1 = a1;
		this.a2 = a2;
		return Valueofx;
	}

	// Calculating value of b2-b1 for line 2
	double ValueOfB(double b1, double b2) {
		double Valueofy = b2 - b1;
		this.b1 = b1;
		this.b2 = b2;
		return Valueofy;
	}

	public static void main(String[] args) {
		LineProgram Var = new LineProgram();
		double Squareofx1andx2 = Math.pow(Var.ValueOfX(0, 4), 2);
		double Squareofy1andy2 = Math.pow(Var.ValueOfY(0, 4), 2);
		double lengthofline1 = Math.sqrt(Squareofx1andx2 + Squareofy1andy2);
		System.out.println("Length of line is: " + lengthofline1);

		double Squareofa1anda2 = Math.pow(Var.ValueOfA(0, 4), 2);
		double Squareofb1andb1 = Math.pow(Var.ValueOfB(0, 4), 2);
		double lengthofline2 = Math.sqrt(Squareofa1anda2 + Squareofb1andb1);
		System.out.println("Length of line is: " + lengthofline2);

		// Comparing the end point to check if the lines are equal
		if (Var.x2 == Var.a2 && Var.y2 == Var.b2) {
			System.out.println("Both the lines are equal");
		} else {
			System.out.println("Both the lines are unequal");
		}

		// Comparing the line1 is equal/greater/lesser then line 2
		if (lengthofline1 == lengthofline2) {
			System.out.println("line 1 and line 2 are equal in length");
		} else if (lengthofline1 > lengthofline2) {
			System.out.println("Line 1 is greater in length than line 2");
		} else {
			System.out.println("Line 1 is lesser  in length than line 2");
		}
	}

}