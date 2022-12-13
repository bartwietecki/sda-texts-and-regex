package regex;

/*
Napisz który sprawdza polskie numery telefonów komórkowych, zaczynajace się cyfrą 5

np. 545444321
 */

public class Regex003 {
    public static void main(String[] args) {
        RegexTester tester = new RegexTester("5[0-9]{8}");

        tester.validate("545555467");
        tester.validate("52215298");
        tester.validate("754458654");
        tester.validate("79450778");

        RegexTester tester1 = new RegexTester("\\+485[0-9]{8}");

        tester1.validate("+48545555467");
        tester1.validate("52215298");
        tester1.validate("754458654");
        tester1.validate("79450778");

        RegexTester tester2 = new RegexTester("(\\+48)?5[0-9]{8}");

        //true
        tester2.validate("+48515332123");
        tester2.validate("515336293");
        //false
        tester2.validate("51123");
        tester2.validate("615332123");
        tester2.validate("715332123");
        tester2.validate("+48715332123");
        tester2.validate("712123");
    }
}
