package pepita.introduccion;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PepitaIntroduccionTest {
    private Pepita pepita;

    @BeforeEach
    public void setUp() {
        pepita = new Pepita();
    }
	
    @Test
    public void testInitialEnergy() {
        assertEquals(100, pepita.getEnergy());
    }

    @Test
    public void testEnergyAfterFly() {
        pepita.fly(10);
        assertEquals(80, pepita.getEnergy());
    }
}