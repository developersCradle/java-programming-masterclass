package tutorial_76_and_77_classes;


//private is general rule for classes 

public class Car {
	
	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String color;
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		String validModel = model.toLowerCase();
		if (validModel.equals("Carrera") || validModel.equals("commondore")) {
			this.model = model;			
		} else {
			this.model = "Unknow";
		}
	}

}
