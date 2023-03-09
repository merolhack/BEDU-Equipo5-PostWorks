import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraTest {
    private Calculadora calculadora = new Calculadora();
    private int limite = 1000;
    private Random rdn = new Random();
    @TestFactory
    @DisplayName("Prueba Suma")
    Stream<DynamicTest> suma() {
        List<Integer> entradas1   = IntStream.range(0, limite).boxed().collect(Collectors.toList());
        List<Integer> entradas2   = IntStream.range(0, limite).map(n -> rdn.nextInt(limite)+1 ).boxed().collect(Collectors.toList());
        // Sumamos los valores aleatorios
        List<Integer> resultados  = IntStream.range(0, limite).map(n -> n + entradas2.get(n) ).boxed().collect(Collectors.toList());

        return entradas1.stream()
                .map(numero -> DynamicTest.dynamicTest("Sumando : [" + numero + "] más ["+entradas2.get(numero)+"] Valor esperado["+calculadora.suma(numero, entradas2.get(numero))+"]",
                        () -> {
                            assertEquals(calculadora.suma(numero, entradas2.get(numero)), resultados.get(numero));
                        }));
    }
    @TestFactory
    @DisplayName("Prueba Resta")
    Stream<DynamicTest> resta() {
        List<Integer> entradas1   = IntStream.range(0, limite).boxed().collect(Collectors.toList());
        List<Integer> entradas2   = IntStream.range(0, limite).map(n -> rdn.nextInt(limite)+1 ).boxed().collect(Collectors.toList());
        // Sumamos los valores aleatorios
        List<Integer> resultados  = IntStream.range(0, limite).map(n -> n - entradas2.get(n) ).boxed().collect(Collectors.toList());

        return entradas1.stream()
                .map(numero -> DynamicTest.dynamicTest("Restando : [" + numero + "] menos ["+entradas2.get(numero)+"] Valor esperado["+calculadora.resta(numero, entradas2.get(numero))+"]",
                        () -> {
                            assertEquals(calculadora.resta(numero, entradas2.get(numero)), resultados.get(numero));
                        }));
    }
    @TestFactory
    @DisplayName("Prueba Multipliacion")
    Stream<DynamicTest> multiplica() {

        List<Integer> entradas1   = IntStream.range(0, limite).boxed().collect(Collectors.toList());
        List<Integer> entradas2   = IntStream.range(0, limite).map(n -> rdn.nextInt(limite)+1 ).boxed().collect(Collectors.toList());
        // Mulriplicamos los valores aleatorios
        List<Integer> resultados  = IntStream.range(0, limite).map(n -> n * entradas2.get(n) ).boxed().collect(Collectors.toList());

        return entradas1.stream()
                .map(numero -> DynamicTest.dynamicTest("multiplicando: [" + numero + "] por ["+entradas2.get(numero)+"] Valor esperado["+calculadora.multiplica(numero, entradas2.get(numero))+"]",
                        () -> {
                            assertEquals(calculadora.multiplica(numero, entradas2.get(numero)), resultados.get(numero));
                        }));

    }


    @TestFactory
    @DisplayName("Prueba division")
    Stream<DynamicTest> divideTest() {

        List<Integer> entradas1   = IntStream.range(0, limite).boxed().collect(Collectors.toList());
        List<Integer> entradas2   = IntStream.range(0, limite).map(n -> rdn.nextInt(limite)+1 ).boxed().collect(Collectors.toList());
        // Dividimos los valores aleatorios
        List<Integer> resultados  = IntStream.range(0, limite).map(n -> n / entradas2.get(n) ).boxed().collect(Collectors.toList());

        return entradas1.stream()
                .map(numero -> DynamicTest.dynamicTest("divide : [" + numero + "] entre ["+entradas2.get(numero)+"] Valor esperado["+calculadora.divide(numero, entradas2.get(numero))+"]",
                        () -> {
                            assertEquals ( calculadora.divide(numero, entradas2.get(numero)), resultados.get(numero),10 );
                        }));

    }
}
