package tutorial_57_coding_exercise_part_3_speed_converter;


public class Main {

    public static void main(String[] args) {
    	double miles =  SpeedConverter.toMilesPerHour(10.5);
    	System.out.println(miles);

    	SpeedConverter.printConversion(10.5);
    }

}
