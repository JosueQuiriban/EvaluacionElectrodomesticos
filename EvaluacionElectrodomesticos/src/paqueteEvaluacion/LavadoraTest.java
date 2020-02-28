package paqueteEvaluacion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LavadoraTest {

	Lavadora lavadoraPrueba;
	Lavadora lavadoraPrueba2;
	
	@BeforeEach
	void setUp() throws Exception {
		lavadoraPrueba = new Lavadora(35, 100000, 8, "blanco", 'A');
		lavadoraPrueba2 = new Lavadora(5,100000, 2, "azul", 'F');
	}

	@Test
	void testPrecioFinal() {
		assertEquals(100020, lavadoraPrueba2.precioFinal(5, 100000));
	}

	@Test
	void testGetCarga() {
		assertEquals(35, lavadoraPrueba.getCarga());
	}

}
