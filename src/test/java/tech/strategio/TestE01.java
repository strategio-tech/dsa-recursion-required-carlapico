package tech.strategio;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

public class TestE01 {
    @DisplayName("FIXME")
    @ParameterizedTest(name = "{index} => {0} is {1}")
    @MethodSource("argumentStream")
    // replace int[] and Boolean with the appropriate types
    void argumentStream(int value, int result) {
        E01 exercise = new E01();
        int val = exercise.getNthFib(value);
        assertEquals(result, val);
    }

    private static Stream<Arguments> argumentStream() {
        return Stream.of(
                Arguments.arguments(1, 0),
                Arguments.arguments(2, 1),
                Arguments.arguments(3, 1),
                Arguments.arguments(4, 2),
                Arguments.arguments(5, 3),
                Arguments.arguments(6, 5),
                Arguments.arguments(7, 8),
                Arguments.arguments(8, 13),
                Arguments.arguments(9, 21),
                Arguments.arguments(10, 34),
                Arguments.arguments(11, 55),
                Arguments.arguments(12, 89),
                Arguments.arguments(13, 144));
    }
}
