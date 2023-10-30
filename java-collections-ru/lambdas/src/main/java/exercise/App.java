package exercise;

import java.util.Arrays;
import java.util.stream.Stream;


// BEGIN
public class App {
    public static String[][] enlargeArrayImage(String[][] imageArray) {
        return Arrays.stream(imageArray)
                .map(row -> Stream.of(row)
                        .flatMap(cell -> Stream.of(cell, cell))
                        .toList()
                        .toArray(new String[0])
                )
                .flatMap(row -> Stream.of(row, row))
                .toList()
                .toArray(new String[0][0]);
    }
}
// END
