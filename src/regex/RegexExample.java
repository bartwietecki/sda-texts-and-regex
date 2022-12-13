package regex;

// predefiniowane klasy w regex'ach w Javie


public class RegexExample {
    public static void main(String[] args) {
        String fourDigitsNumbersPattern = "\\d{4}";

        RegexTester tester = new RegexTester(fourDigitsNumbersPattern);

        tester.validate("1984");
        tester.validate("2022");
        tester.validate("292212312");
        tester.validate("202");
        tester.validate("adfbadsg");
        tester.validate("asdf");

        String pattern = "\\d\\w\\d";
        RegexTester tester1 = new RegexTester(pattern);
        tester1.validate("0_0");
        tester1.validate("0X1");
        tester1.validate("x8x");
        tester1.validate("0 0");
    }
}
