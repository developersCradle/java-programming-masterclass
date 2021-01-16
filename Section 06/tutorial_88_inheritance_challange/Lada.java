package tutorial_88_inheritance_challange;

	public class Lada extends Car {
	    private int roadServiceMonths;

	    public Lada(int roadServiceMonths) {
	        super("Lada", "4WD", 5, 5, 6, false);
	        this.roadServiceMonths = roadServiceMonths;
	    }
	}

