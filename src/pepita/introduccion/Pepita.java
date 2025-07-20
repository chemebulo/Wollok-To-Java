package pepita.introduccion;

public class Pepita {
	
	private int energy = 100; // It represent the energy value of Pepita.
	
	public int getEnergy() {
		// This is the getter of the energy attribute.
		return energy;
	}
	
	public void setEnergy(int energy) {
		// This is the setter of the energy attribute.
		this.energy = energy;
	}
	
	public void eat(Birdseed birdseed) {
		// It represent the order that makes Pepita eat the given birdseed.
		this.energy += birdseed.getEnergyThatProvides();
	}
	
	public void fly(int distance) {
		// It represent the order that makes Pepita fly the given distance.
		this.energy -= 10 + distance;
	}
}