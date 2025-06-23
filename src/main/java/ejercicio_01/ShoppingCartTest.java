package ejercicio_01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {

    private ShoppingCart cart;

    @BeforeEach
    void setUp() {
        cart = new ShoppingCart();
    }

    /**
     * Caso de Prueba Válido (Happy Path)
     */
    @Test
    @DisplayName("Debería añadir un producto y actualizar el total correctamente")
    void casoValido_alAgregarUnProducto() {
        cart.addProduct(19.99);

        // Verificación: Comprobar que el conteo y el total son los esperados.
        assertAll("Verificación de conteo y total",
            () -> assertEquals(1, cart.getProductCount(), "El conteo de productos debería ser 1."),
            () -> assertEquals(19.99, cart.getTotal(), 0.001, "El total debería ser 19.99.")
        );
    }

    /**
     * Caso de Prueba Inválido (Unhappy Path)
     */
    @Test
    @DisplayName("Debería lanzar una excepción al añadir un producto con precio cero")
    void casoInvalido_alAgregarUnProductoConPrecioCero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            cart.addProduct(0.0);
        });

        // Verificación adicional
        String expectedMessage = "Price must be positive";
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage, actualMessage, "El mensaje de la excepción no es el esperado.");
    }
}