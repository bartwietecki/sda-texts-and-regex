package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample3 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(".*\\-\\-(\\w+)\\-\\-.*"); // dowolny znak, dowolną ilość razy,
        Matcher matcher = pattern.matcher("Francis Junior --Underwood-- został prezydentem USA");
        System.out.println(matcher.matches());
        System.out.println(matcher.group(1));
    }
}
