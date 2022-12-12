/*
ZADANIE 21.
Napisz metodę, która odpowiada na pytanie, czy podany string jest palindromem. Palindromy to słowa,
które są takie same czytane od początku i od końca, np. kajak.
Dla przykładu, dla argumentu "kajak" (a także "Kajak"), metoda ta powinna zwrócić true, a dla argumentu "kot" – false.
Napisz program, który pobierze od użytkownika tekst i wypisze czy dany tekst jest palindromem.
 */

public class Problem021 {
    public static void main(String[] args) {
        System.out.println("Kajak: " + isPalindrome("kajak"));
        System.out.println("Kot: " + isPalindrome("kot"));
    }

    private static boolean isPalindrome(String text) {
        text = text.toLowerCase();
        int length = text.length();
        for(int i = 0; i < length; i++){
            if(text.charAt(i)!=text.charAt(length - 1- i)){ //sprawdzam jednocześnie znaki z początku i końxa
                return false;
            }
        }
        return true;
    }

}
