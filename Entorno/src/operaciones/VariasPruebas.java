package operaciones;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ SumaTest.class, RestaTest.class, MultiplicacionTest.class, CalculadoraTest2.class

})
public class VariasPruebas {
}