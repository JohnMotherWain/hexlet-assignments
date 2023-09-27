package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// BEGIN
public class App {
    public static <T> List<Map<T, T>> findWhere(List<Map<T, T>> books, Map<T, T> where) {
        List<Map<T, T>> findingBooks = new ArrayList<>();
        boolean isBookFind;
        for(Map<T, T> oneBook: books) {
            isBookFind = true;
            for(T wordKey: where.keySet()) {
                if (!where.get(wordKey).equals(oneBook.get(wordKey)) ) {
                    isBookFind = false;
                }
            }
            if(isBookFind) {findingBooks.add(oneBook);}
        }
        return findingBooks;
    }
}
//END
