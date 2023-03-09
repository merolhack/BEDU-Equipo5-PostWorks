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
    Stream<DynamicTest> dynamicTestsFromStreamInJava8() {

        Calculadora calculadora = new Calculadora();
        List<Integer> numbers = IntStream.range(0, 1000).boxed().collect(Collectors.toList());
        List<Integer> results = IntStream.range(0, 1000).map(n -> n + 1).boxed().collect(Collectors.toList());

        return numbers.stream().map(number -> DynamicTest.dynamicTest("Sumando: " + number + " + 1", () -> {
            assertEquals(results.get(number), calculadora.suma(number, 1));
        }));
    }
}