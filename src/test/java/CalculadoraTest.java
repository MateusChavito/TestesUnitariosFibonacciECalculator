import static org.junit.jupiter.api.Assertions.*;

import org.example.Calculadora;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    private final Calculadora calculadora = new Calculadora();

    @Test
    public void testAdicionar() {
        assertEquals(5, calculadora.adicionar(2, 3));
        assertEquals(0, calculadora.adicionar(0, 0));
        assertEquals(-1, calculadora.adicionar(-2, 1));
    }

    @Test
    public void testSubtrair() {
        assertEquals(-1, calculadora.subtrair(2, 3));
        assertEquals(0, calculadora.subtrair(3, 3));
        assertEquals(-3, calculadora.subtrair(-2, 1));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(6, calculadora.multiplicar(2, 3));
        assertEquals(0, calculadora.multiplicar(0, 5));
        assertEquals(-2, calculadora.multiplicar(-2, 1));
    }

    @Test
    public void testDividir() {
        assertEquals(2, calculadora.dividir(6, 3));
        assertEquals(0, calculadora.dividir(0, 5));

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculadora.dividir(5, 0);
        });

        assertEquals("Divisão por zero não é permitida.", exception.getMessage());
    }
}
