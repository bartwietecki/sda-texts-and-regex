package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("test");
        Matcher matcher = pattern.matcher("Teskt w ktorym szukam test");

        // dopasowanie do całego tekstu w ktorym szukamy
        System.out.println(matcher.matches());

        // metoda find -> to jest : czy jest pasujący fragment
        System.out.println(matcher.find());

        // szuka kolejnego dopasowania
        System.out.println(matcher.find()); // metoda za drugim razem daje false, tam jest taki wskaźnik, że jak już
                                           // znaleźliśmy dopasowanie to ta metoda dopiero od tego momentu na nowo szuka dopasowania


    }

}
