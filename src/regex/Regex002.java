package regex;

/*
Napisz regex, który znajdzie tekst, w którym po jednej dużej literze następują male litery.

OK:
Java
Ja

ŹLE:
J
 */

public class Regex002 {
    public static void main(String[] args) {
        RegexTester tester = new RegexTester("[A-Z][a-z]+"); // + daje nam to, że musi wystąpic jeden raz chociaż [a-z]

        tester.validate("Aaasd");
        tester.validate("AZdasd");
        tester.validate("Bssa");
        tester.validate("Z5");
        tester.validate("za");
        tester.validate("J");
        tester.validate("Java");
        tester.validate("Ja");
    }
}

