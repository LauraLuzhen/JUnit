package operaciones;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

public class MultiplicacionTest {

	@ParameterizedTest
	@MethodSource("multiplicacion")
	void testMultiplicacion(int a, int b, int expected) {
		Calculadora calc = new Calculadora(a, b);
		assertEquals(expected, calc.multiplica());
	}

	private static Stream<Arguments> multiplicacion() {
		return Stream.of(Arguments.of(2, 3, 6), Arguments.of(-1, 5, -5), Arguments.of(0, 100, 0));
	}
}
