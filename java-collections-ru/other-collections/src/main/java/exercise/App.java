package exercise;

import java.util.*;

// BEGIN
public class App {
    public static Map<String, String> genDiff(Map<String, Object> dictitionary1, Map<String, Object> dictitionary2) {
        Map<String, String> expected = new LinkedHashMap<>();
        Map<String, String> result = new LinkedHashMap<>();

        Set<String> firstSet = new HashSet<>(dictitionary1.keySet());
        Set<String> secondSet = new HashSet<>(dictitionary2.keySet());

        secondSet.removeAll(firstSet);
        for(String key: secondSet) {
            expected.put(key, "added");
        }
        secondSet = new HashSet<>(dictitionary2.keySet());
        firstSet.removeAll(secondSet);
        for(String key: firstSet) {
            expected.put(key, "deleted");
        }
        firstSet = new HashSet<>(dictitionary1.keySet());
        firstSet.retainAll(secondSet);
        for(String key: firstSet) {
            if(!dictitionary1.get(key).equals(dictitionary2.get(key))) {
                expected.put(key, "changed");
            } else {
                expected.put(key, "unchanged");
            }
        }
        for(String key: expected.keySet().stream().sorted().toList()) {
            result.put(key, expected.get(key));
        }
        return result;
    }
}
//END
