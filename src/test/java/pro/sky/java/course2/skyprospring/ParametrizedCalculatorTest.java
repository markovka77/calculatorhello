package pro.sky.java.course2.skyprospring;

import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runners.Parameterized;

import java.util.stream.Stream;

public class ParametrizedCalculatorTest {
    private Integer result;

    public static @NotNull Stream<Arguments> provideParamsForTest() {
        return Stream.of(
                Arguments.of(1,2,3),
                Arguments.of(4,5,6),
                Arguments.of(7,8,9,0)
        );
    }
    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void shouldGenerateActualTest(Integer num1, Integer num2){

    }

}

