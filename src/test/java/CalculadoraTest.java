import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    // Cambio en el proyecto

    Calculadora calculadora = new Calculadora();
    @Test
    void suma() {
        System.out.println("Casos de prueba método sumar");
        assertEquals(2, calculadora.suma(1,1));
    }

    @Test
    void resta() {
    }

    @Test
    void multiplica() {
    }

    @Test
    void divide() {
    }
}