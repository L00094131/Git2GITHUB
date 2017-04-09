package vehiclepkg;

public class Car extends Vehicle {
	private static int noDoors = 1;

	public static int getNoDoors() {
		return noDoors;
	}

	public static void setNoDoors(int noDoors) {
		if (noDoors < 1 || noDoors > 5)
			Car.noDoors = 1;// noDoors must be between 1 and 5
		else
			Car.noDoors = noDoors;
	}
}
