package exercise;

import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String characterSet, String targetWord) {
        String lowerCaseCharacterSet = characterSet.toLowerCase();
        String lowerCaseTargetWord = targetWord.toLowerCase();

        List<Character> listCharsInWord = lowerCaseTargetWord.chars().mapToObj(character -> (char) character).toList();
        List<Character> listCharsInSet = new ArrayList<>(lowerCaseCharacterSet.chars().mapToObj(character -> (char) character).toList());
        int indexInSet;
        for(Character oneSymbol: listCharsInWord) {
            indexInSet = listCharsInSet.indexOf(oneSymbol);
            if(indexInSet == -1) {
                return false;
            }
            listCharsInSet.remove(indexInSet);
        }
        return true;
    }

}
//END
