package operaciones;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

public class RestaTest {

	@ParameterizedTest
	@MethodSource("resta")
	void testResta(int a, int b, int expected) {
		Calculadora calc = new Calculadora(a, b);
		assertEquals(expected, calc.resta());
	}

	private static Stream<Arguments> resta() {
		return Stream.of(Arguments.of(5, 3, 2), Arguments.of(0, 0, 0), Arguments.of(3, 5, -2));
	}
}
