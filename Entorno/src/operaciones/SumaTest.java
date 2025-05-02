package operaciones;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

public class SumaTest {

	@ParameterizedTest
	@MethodSource("suma")
	void testSuma(int a, int b, int expected) {
		Calculadora calc = new Calculadora(a, b);
		assertEquals(expected, calc.suma());
	}

	private static Stream<Arguments> suma() {
		return Stream.of(Arguments.of(1, 2, 3), Arguments.of(-1, 1, 0), Arguments.of(0, 0, 0));
	}
}