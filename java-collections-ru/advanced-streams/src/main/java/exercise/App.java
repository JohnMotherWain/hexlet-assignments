package exercise;

import java.util.Arrays;
import java.util.Collection;

// BEGIN
public class App {
    public static String getForwardedVariables(String setData) {
        final String iniKey = "environment=\"";
        final String iniPrefix = "X_FORWARDED_";
        return Arrays.stream(setData.split("\n"))
                .filter(row -> row.contains(iniKey))
                .map(row -> row.replace(iniKey ,""))
                .map(row -> row.replace("\"" ,""))
                .map(row -> Arrays.stream(row.split(","))
                        .filter(cell -> cell.contains(iniPrefix))
                        .filter(cell -> !cell.trim().isBlank())
                        .map(cell -> cell.replace(iniPrefix ,""))
                        .toList()
                )
                .filter(row -> !row.isEmpty())
                .flatMap(Collection::stream)
                .toList()
                .toString()
                .replace("[" ,"").replace("]" ,"")
                .replace(" ", "")
                ;
    }
}
//END
