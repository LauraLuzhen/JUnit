package operaciones;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class CalculadoraTest2 {

	@ParameterizedTest
	@MethodSource("division")
	void testDivide(int num1, int num2, int excepted) {
		Calculadora calc = new Calculadora(num1, num2);
		int resul = calc.divide();
		assertEquals(excepted, resul);
	}

	
	private static Stream<Arguments> division() {
		return Stream.of(
				Arguments.of(20, 10, 2),
				Arguments.of(30, -2, -15),
				Arguments.of(5, 2, 2)
		);
	}
}
