package empanadas.gimenez;

public abstract class Empleado {
	
	private int sueldo;
	private int dinero;

	public int getSueldo() {
		return sueldo;
	}
	
	public void setSueldo(int nuevaCantidad) {
		this.sueldo = nuevaCantidad;
	}
	
	public int getDinero() {
		return dinero;
	}
	
	public void setDinero(int nuevaCantidad) {
		this.dinero = nuevaCantidad;
	}
	
	public void addDinero(int nuevaCantidad) {
		this.dinero += nuevaCantidad;
	}
	
	public abstract void cobrarSueldo();
}