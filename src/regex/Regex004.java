package regex;

/*
Napisz Regex,
sprawdza czy użytkownik wprowadził poprawną nazwę miejscowosci.

Na przykład Wroclaw, Zielona Gora czy Bielsko-Biala jest ok, jednak Ptysiow123 już nie.
Dla uproszczenia załóżmy, że żadna nazwa miejscowości nie zawiera polskich znaków.
 */

public class Regex004 {
    public static void main(String[] args) {
        //                                      pierwszy człon nazwy | drugi człon ze ? <- czyli występuję albo nie występuje
        RegexTester tester = new RegexTester("[A-Z][a-z]+([ \\-][A-Z][a-z]+)?");

        tester.validate("Wroclaw");
        tester.validate("Zielona Gora");
        tester.validate("Bielsko-Biala");
        tester.validate("Ptysiow123");
        tester.validate("warszawa");
    }
}
