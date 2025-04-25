package operaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	
	static Calculadora calcMayor;
	static Calculadora calcNull;
	static Calculadora calcMenor;
	static Calculadora calcIgual;
	
	/*
	@BeforeEach
	static void crearCalculadoraMayor() {
		calcMayor = new Calculadora(20, 10);
	}
	
	@BeforeEach
	static void crearCalculadoraNull() {
		calcNull = new Calculadora(20, 0);
	}
	
	@BeforeEach
	static void crearCalculadoraMenor() {
		calcMayor = new Calculadora(5, 15);
	}
	
	@BeforeEach
	static void crearCalculadoraIgual() {
		calcMayor = new Calculadora(8, 8);
	}
	
	@AfterEach
	static void borrarCalculadoraMayor() {
		calcMayor = null;
	}
	
	@AfterEach
	static void borrarCalculadoraNull() {
		calcNull = null;
	}
	
	@AfterEach
	static void borrarCalculadoraMenor() {
		calcMenor = null;
	}
	
	@AfterEach
	static void borrarCalculadoraIgual() {
		calcIgual = null;
	}
	*/
	
	@BeforeAll
	static void prepararCalculadoras() {
		calcMayor = new Calculadora(20, 10);
		calcNull = new Calculadora(20, 0);
		calcMenor = new Calculadora(5, 15);
		calcIgual = new Calculadora(8, 8);
	}

	@AfterAll
	static void borrarCalculadoras() {
		calcMayor = null;
		calcNull = null;
		calcMenor = null;
		calcIgual = null;
	}
	

	@Test
	void testSuma() {
		int resul = calcMayor.suma();
		assertEquals(30, resul);
	}
	
	

	@Test
	void testRestaMayor() {
		int resul = calcMayor.resta();
		assertEquals(10, resul);
	}
	
    @Test
    void testRestaMenor() {
        int resultado = calcMenor.resta(); 
        assertEquals(10, resultado);
    }

    @Test
    void testRestaIguales() {
        int resultado = calcIgual.resta(); 
        assertEquals(0, resultado);
    }

    @Test
    void testResta2Mayor() {
        assertTrue(calcMayor.resta2());
    }
    
    @Test
    void testResta2Menor() {
        assertFalse(calcMenor.resta2());
    }

    @Test
    void testResta2Iguales() {
        assertTrue(calcIgual.resta2());
    }
    
	@Test
	void testValores() {
	    assertTrue(calcIgual.resta() == 0);
	    assertFalse(calcIgual.resta() != 0);
	    assertNotNull(calcIgual);
	}

	@Test
	void testMultiplica() {
		int resul = calcMayor.multiplica();
		assertEquals(200, resul);
	}

	@Test
	void testDivide() {
		try {
			int resul = calcNull.divide();
			fail("FALLO, debería haber lanzado la excepción");
			assertEquals(200, resul);
		} catch (ArithmeticException e) {
			// Prueba
		}
	}
	
	@Test
	void testDivide2() {
	    int resul = calcMayor.divide(); 
	    assertEquals(2, resul);    
	}

	@Test
	public void testDivide0() {
		assertThrows(ArithmeticException.class, () -> {
			calcNull.divide0();
		});
	}

}
