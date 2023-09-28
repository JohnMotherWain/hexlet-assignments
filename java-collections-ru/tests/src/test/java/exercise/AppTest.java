package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {
    @Test
    void testTake1() {
        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> numbers2 = new ArrayList<>(Arrays.asList(1, 2));
        assertThat(App.take(numbers1, 2)).isEqualTo(numbers2);
    }
    @Test
    void testTake2() {
        List<Integer> numbers3 = new ArrayList<>(Arrays.asList(7, 3, 10));
        assertThat(App.take(numbers3, 8)).isEqualTo(numbers3);
    }
}
