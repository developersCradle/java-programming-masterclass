package coding_exercises_33;

public class Floor {

	private double width;
	private double length;

	//In case the width parameter is less than 0 it needs to set the width field value to 0, in case the length parameter is less than 0 it needs to set the length field value to 0.
	public Floor(double width, double length) {

		if (width < 0) {
			this.width = 0;
		} else {
			this.width = width;

		}
		if (length < 0) {
			this.length = 0;
		} else {
			this.length = length;
		}
	}

	public double getArea() {
		return width * length;
	}

}
