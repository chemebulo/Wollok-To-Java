package empanadas.gimenez;

public class Galvan extends Empleado {

	private int deuda;
	
	public int getDeuda() {
		return deuda;
	}
	
	public void setDeuda(int nuevaCantidad) {
		this.deuda = nuevaCantidad;
	}
	
	public void addDeuda(int nuevaCantidad) {
		this.deuda += nuevaCantidad;
	}
	
	public void gastar(int cantidad) {
		int dinero = getDinero();
		
		if(cantidad <= dinero) {
			setDinero(dinero - cantidad);
		} else {
			addDeuda(cantidad - dinero);
			setDinero(0);
		}
	}
	
	@Override
	public void cobrarSueldo() {
		int sueldo = getSueldo();
		
		if(sueldo >= deuda) {
			addDinero(sueldo - deuda);
			setDeuda(0);
		} else {
			setDeuda(deuda - sueldo);
		}
	}
}