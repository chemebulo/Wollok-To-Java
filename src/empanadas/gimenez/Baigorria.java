package empanadas.gimenez;

public class Baigorria extends Empleado {

	private int cantidadDeEmpanadas;
	private int totalCobrado;
	private static final int precioEmpanada = 15;
	
	public int getCantidadDeEmpanadas() {
		return cantidadDeEmpanadas;
	}
	
	public void setCantidadDeEmpanadas(int nuevaCantidad) {
		this.cantidadDeEmpanadas = nuevaCantidad;
	}
	
	public int getTotalCobrado() {
		return totalCobrado;
	}
	
	public void setTotalCobrado(int nuevaCantidad) {
		this.totalCobrado = nuevaCantidad;
	}
	
	public void venderEmpanadas(int cantidadEmpanadas) {
		this.cantidadDeEmpanadas += cantidadEmpanadas;
	}
	
	@Override
	public int getSueldo() {
		return precioEmpanada * cantidadDeEmpanadas;
	}
	
	@Override
	public void cobrarSueldo() {
		this.totalCobrado += getSueldo();
		this.cantidadDeEmpanadas = 0;
		setSueldo(0);
	}
}