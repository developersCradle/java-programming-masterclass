package tutorial_55_coding_exercise_part_1_speed_converter;

public class SpeedConverter {
	
	public static long toMilesPerHour(double kilometersPerHour)
	{
		if (kilometersPerHour < 0 ) {
			return -1;
		}
		return Math.round(kilometersPerHour / 1.609);
	}

}
