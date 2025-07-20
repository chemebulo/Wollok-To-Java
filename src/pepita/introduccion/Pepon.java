package pepita.introduccion;

public class Pepon {

	private int energy = 30; // It represent the energy value of Pepita.
	
	// ########################################################################## \\
	
	public int getEnergy() {
		// This is the getter of the energy attribute.
		return energy;
	}
	
	public void setEnergy(int energy) {
		// This is the setter of the energy attribute.
		this.energy = energy;
	}
	
	// ########################################################################## \\
	
	public void eat(Apple apple) {
		// It represent the order that make Pepon eat the given apple.
		this.energy += apple.getEnergyThatProvides() / 2;
	}
	
	public void fly(int distance) {
		// It represent the order that make Pepon fly the given distance.
		this.energy -= 20 + (distance * 2);
	}
}