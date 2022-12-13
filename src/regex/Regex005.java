package regex;

/*
Napisz 2 regexy:
1 -> sprawdza poprawność imienia
2 -> sprawdza poprawność nazwiska (weź pod uwagę nazwiska wieloczłonowe) // bez polskich znakow
np. Bachleda-Curus, von der Leyen, de Silva
 */

public class Regex005 {
    public static void main(String[] args) {

        // Mój kod
       RegexTester tester = new RegexTester("[A-Za-z][a-z]+([ \\-][A-Za-z][a-z]+)?([ \\-][A-Za-z][a-z]+)?");

        tester.validate("Bachleda-Curus");
        tester.validate("von der Leyen");
        tester.validate("de Silva");
        tester.validate("Bachleda--Leyen");
        tester.validate("de Silva3");

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        // Kod od Rafała
        RegexTester firsnameTester = new RegexTester("[A-Z][a-z]+");
        firsnameTester.validate("Urszula");
        firsnameTester.validate("Tomek");
        firsnameTester.validate("Janusz");
        firsnameTester.validate("janusz");

        RegexTester surnameTester = new RegexTester("[a-zA-Z]+([ '\\-][a-zA-Z]+)*");
        surnameTester.validate("Kowalski");
        surnameTester.validate("von der Leyen");
        surnameTester.validate("von der Leyen Aasd");
        surnameTester.validate("von der Leyen-Kowalska");
        surnameTester.validate("Bachleda-Curus");
        surnameTester.validate("de Silva");
        surnameTester.validate("Bachleda--Curus");
        surnameTester.validate("kowalski");
    }
}



