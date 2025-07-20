package pepita.introduccion;

public class Apple {

	private int ripeness = 1;	// It represent the ripeness value of the apple.
	private int base = 5;		// It represent the base value of energy that the apple provides.
		
	// ########################################################################## \\
		
	public int getRipeness() {
		// This is the getter of the ripeness attribute.
		return ripeness;
	}
		
	public void setRipeness(int ripeness) {
		// This is the setter of the ripeness attribute.
		this.ripeness = ripeness;
	}
	
	public int getBase() {
		// Returns the base value of the apple.
		return base;
	}

	// ########################################################################## \\
	
	public int getEnergyThatProvides() {
		// Returns the energy that provides the apple.
		return base + ripeness;
	}
	
	public void ripen() {
		// It makes the apple rippen.
		this.ripeness++;
	}
}