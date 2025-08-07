package empanadas.gimenez;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpanadasGimenezTest {
	private Gimenez gimenez;
    private Galvan galvan;
    private Baigorria baigorria;

    @BeforeEach
    public void setUp() {
        gimenez = new Gimenez();
        galvan = new Galvan();
        baigorria = new Baigorria();
        
        gimenez.setFondo(300000);
        
        galvan.setDinero(0);
        galvan.setDeuda(0);
        galvan.setSueldo(15000);
        
        baigorria.setSueldo(0);
        baigorria.setCantidadDeEmpanadas(0);
        baigorria.setTotalCobrado(0);
    }
	
    @Test
    public void primerPunto() {
    	baigorria.venderEmpanadas(500);
    	galvan.setSueldo(20000);
    	baigorria.venderEmpanadas(300);
    	assertEquals(12000, baigorria.getSueldo());
    	assertEquals(20000, galvan.getSueldo());
    	
    	gimenez.pagarSueldoA(baigorria);
    	gimenez.pagarSueldoA(galvan);
    	assertEquals(268000, gimenez.getFondo());
    }

    @Test
    public void segundoPunto() {
    	baigorria.venderEmpanadas(500);
    	galvan.setSueldo(20000);
    	baigorria.venderEmpanadas(300);
    	gimenez.pagarSueldoA(baigorria);
    	gimenez.pagarSueldoA(galvan);

    	baigorria.venderEmpanadas(100);
    	gimenez.pagarSueldoA(baigorria);
    	assertEquals(13500, baigorria.getTotalCobrado());
    }
    
    @Test
    public void tercerPunto() {
	   assertEquals(0, galvan.getDeuda()); 	
	   assertEquals(0, galvan.getDinero()); 	
	   assertEquals(15000, galvan.getSueldo()); 	

	   galvan.gastar(4000);
	   assertEquals(4000, galvan.getDeuda()); 	
	   assertEquals(0, galvan.getDinero()); 	
	   
	   galvan.gastar(8000);
	   assertEquals(12000, galvan.getDeuda());	
	   assertEquals(0, galvan.getDinero()); 	

	   gimenez.pagarSueldoA(galvan);   
	   assertEquals(0, galvan.getDeuda()); 	
	   assertEquals(3000, galvan.getDinero()); 	

	   galvan.gastar(25000);
	   assertEquals(22000, galvan.getDeuda()); 	
	   assertEquals(0, galvan.getDinero()); 	

	   gimenez.pagarSueldoA(galvan);   
	   assertEquals(7000, galvan.getDeuda()); 	
	   assertEquals(0, galvan.getDinero()); 	
    }
}