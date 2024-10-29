import static org.junit.jupiter.api.Assertions.*;

import org.example.Fibonacci;
import org.junit.jupiter.api.Test;

public class FibonacciTest {

    private final Fibonacci fibonacci = new Fibonacci();

    @Test
    public void testCalcularFibonacci() {
        assertEquals(0, fibonacci.calcularFibonacci(0), "Fibonacci de 0 deve ser 0");
        assertEquals(1, fibonacci.calcularFibonacci(1), "Fibonacci de 1 deve ser 1");
        assertEquals(1, fibonacci.calcularFibonacci(2), "Fibonacci de 2 deve ser 1");
        assertEquals(2, fibonacci.calcularFibonacci(3), "Fibonacci de 3 deve ser 2");
        assertEquals(3, fibonacci.calcularFibonacci(4), "Fibonacci de 4 deve ser 3");
        assertEquals(5, fibonacci.calcularFibonacci(5), "Fibonacci de 5 deve ser 5");
        assertEquals(8, fibonacci.calcularFibonacci(6), "Fibonacci de 6 deve ser 8");
        assertEquals(13, fibonacci.calcularFibonacci(7), "Fibonacci de 7 deve ser 13");
        assertEquals(21, fibonacci.calcularFibonacci(8), "Fibonacci de 8 deve ser 21");
        assertEquals(34, fibonacci.calcularFibonacci(9), "Fibonacci de 9 deve ser 34");
        assertEquals(55, fibonacci.calcularFibonacci(10), "Fibonacci de 10 deve ser 55");
    }

    @Test
    public void testCalcularFibonacciComNumeroNegativo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            fibonacci.calcularFibonacci(-1);
        });

        assertEquals("O índice não pode ser negativo.", exception.getMessage());
    }
}
