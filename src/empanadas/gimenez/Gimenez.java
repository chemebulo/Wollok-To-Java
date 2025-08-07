package empanadas.gimenez;

public class Gimenez {

	private int fondo = 300000;
	
	public int getFondo() {
		return fondo;
	}
	
	public void setFondo(int fondo) {
		this.fondo = fondo;
	}
	
	public void pagarSueldoA(Empleado empleado) {
		this.fondo -= empleado.getSueldo();
		empleado.cobrarSueldo();
	}
}