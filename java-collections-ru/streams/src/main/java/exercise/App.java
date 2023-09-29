package exercise;

import org.apache.commons.lang3.StringUtils;
import java.util.List;
import java.util.Arrays;

// BEGIN
public class App {
    public static long getCountOfFreeEmails(List<String> emailsList) {
        return (int) emailsList.stream()
                .filter(StringUtils::isNotBlank)
                .filter(name -> Arrays.asList("@gmail.com", "@yandex.ru", "@hotmail.com").contains(name.substring(name.lastIndexOf('@'))))
                .count();
    }
}
// END
