package tutorial_163_hashset_equals_and_hashcode;

import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody {
	private final String name;
	private final double orbitalPerioid;//in days
	private final Set<HeavenlyBody> satellites;

	
	public HeavenlyBody(String name, double orbitalPerioid) {
		this.name = name;
		this.orbitalPerioid = orbitalPerioid;
		this.satellites = new HashSet<>();
	}


	public double getOrbitalPerioid() {
		return orbitalPerioid;
	}


	public String getName() {
		return name;
	}
	
	public boolean addMoon(HeavenlyBody moon)
	{
		return this.satellites.add(moon);
	}


	public Set<HeavenlyBody> getSatellites() {
		return new HashSet<>(this.satellites);
	}
	
}
