package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Napisz Regex, który dopasowuje ciąg znaków, w którym po 'p' występuje zero lub więcej 'q'.
 */
// PONIŻEJ KOD OD RAFAŁA


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Napisz Regex,
który dopasowuje ciąg znaków, w którym po 'p' występuje
zero lub więcej 'q'.

p
pq
pqqqqqqq

 */
public class Regex000 {
   // private static final Pattern pattern = Pattern.compile("pq*");

    public static void main(String[] args) {

        RegexTester tester = new RegexTester("pq*");

// uproszczona wersja, używamy klasy RegexTester, a to co było poprzednio zakomentowaliśmy
        tester.validate("p");
        tester.validate("pq");
        tester.validate("pqqqq");
        tester.validate("pqqqqrrrrr");
        tester.validate("qqqqq");
        tester.validate("asdfsadf");
    }

//    private static void validate(String text) {
//        Matcher matcher = pattern.matcher(text);
//        if (matcher.matches()) {
//            System.out.println("Prawda dla tekstu: " + text);
//        } else {
//            System.out.println("Fałsz dla tekstu: " + text);
//        }
//    }
}

/*
KOD MÓJ

public class Regex000 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("pq*");

        Scanner scanner = new Scanner(System.in);
        String userText = scanner.nextLine();


        Matcher matcher = pattern.matcher(userText);
        System.out.println("matches: " + matcher.matches());

    }
}




 */