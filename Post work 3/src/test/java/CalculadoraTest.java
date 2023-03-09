import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @TestFactory
    @DisplayName("Pruebas dinamicas - Calculadora multiplicacion")
    Stream<DynamicTest> dynamicTestsMultiplicar() {


        Calculadora calculadora = new Calculadora();
        List<Integer> entradas = IntStream.range(0, 1000).boxed().collect(Collectors.toList());
        List<Integer> resultados = IntStream.range(0, 1000).map(n -> n * 2).boxed().collect(Collectors.toList());

        return entradas.stream()
                .map(numero -> DynamicTest.dynamicTest("multiplicacion: " + numero,
                        () -> {
                            assertEquals(calculadora.multiplicar(numero, 2), resultados.get(numero));
                        }));
    }
}