package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static Map<String, Integer> getWordCount(String sentence) {   //make Dictionary
        Map<String, Integer> dictionary = new HashMap<>();
        String[] allWords = sentence.split(" ");
        List<String> listOfWords = new ArrayList<>(List.of(allWords));

            for (String oneWord : listOfWords) {
                if(!oneWord.isEmpty()) {
                    if (dictionary.containsKey(oneWord)) {
                        dictionary.put(oneWord, dictionary.get(oneWord) + 1);
                    } else {
                        dictionary.put(oneWord, 1);
                    }
                }
            }

        return dictionary;
    }
    public static String toString(Map<String, Integer> dictionary) {   //вывести словарь
        String prefix ="{";
        String suffix ="}";
        StringBuilder outputDictionaries = new StringBuilder();
        for(String wordKey: dictionary.keySet()) {
            outputDictionaries.append("\n  ");
            outputDictionaries.append(wordKey).append(": ");
            outputDictionaries.append(dictionary.get(wordKey));
        }
        if (!outputDictionaries.isEmpty()) {
            outputDictionaries.append("\n");
        }
        return prefix + outputDictionaries + suffix;
    }
}
//END
