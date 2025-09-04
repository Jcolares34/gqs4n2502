package calculadora;

import org.junit.Before;
import org.junit.Test;

public class Calculadora {
    private Calculadora calculadora;

    @Before
    public void setUp(){
        //Arrange - Preparação
        calculadora = new Calculadora();
    }

    @Test
    public void deveSomar(){
        // Action - Ação
        int resultado = calculadora.somar(15, 3);

        // Assert - Verificação
        assertEquals(18, resultado);
    }

    @Test

    public void deveSubtrair(){
        // Action - Ação
        int resultado = calculadora.subtrair(15, 3);

        // Assert - Verificação
        assertEquals(12, resultado);
    }

    @Test

    public void deveMultiplicar(){
        // Action - Ação
        int resultado = calculadora.multiplicar(15, 3);

        // Assert - Verificação
        assertEquals(45, resultado);
    }

    @Test

    public void deveDividir(){
        // Action - Ação
        int resultado = calculadora.dividir(15, 3);

        // Assert - Verificação
        assertEquals(5, resultado);
    }

    @Test

    public void deveFatorar(){
        //Action - Ação
        int resultado = calculadora.fatorial(5);

        // Assert - Verificação
        assertEquals(18, resultado);
    }
}
