/*
ZADANIE 19.
Napisz program, który pobierze od użytkownika liczbę dodatnią (typu int) i narysuje falę
o zadanej długości i wysokości 4 linijek, zgodnie z poniższym schematem (puste pola uzupełniaj spacjami):
np dla długości dwa to:
*      **      *
 *    *  *    *
  *  *    *  *
   **      **
a dla długości trzy to:
*      **      **      *
 *    *  *    *  *    *
  *  *    *  *    *  *
   **      **      **

 */

// COŚ W ZADANIU JEST NIE TAK, POPRAWIĆ JE !!!!


import java.util.Scanner;

public class Problem019 {

    private static final String FIRST_ROW_ELEMENT = "*      *";
    private static final String SECOND_ROW_ELEMENT = " *    * ";
    private static final String THIRD_ROW_ELEMENT = "  *  *  ";

    private static final String FOURTH_ROW_ELEMENT = "   **   ";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę dodatnią.");
        int waveLength = scan.nextInt();
        printRow(waveLength, FIRST_ROW_ELEMENT);
        printRow(waveLength, SECOND_ROW_ELEMENT);
        printRow(waveLength, THIRD_ROW_ELEMENT);
        printRow(waveLength, FOURTH_ROW_ELEMENT);
    }

    private static void printRow(int waveLength, String rowElement){
        for(int i=0; i<waveLength;i++){
            System.out.print(rowElement);
        }
        System.out.println();
    }
}



/*
public class Problem019 {

    private static final String FIRST_ROW_ELEMENT = "*      *";
    private static final String SECOND_ROW_ELEMENT = " *    * ";
    private static final String THIRD_ROW_ELEMENT = "  *  *  ";
    private static final String FOURTH_ROW_ELEMENT = "   **   ";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int waveLength = scanner.nextInt();
        printRow(waveLength, FIRST_ROW_ELEMENT);
        printRow(waveLength, SECOND_ROW_ELEMENT);
        printRow(waveLength, THIRD_ROW_ELEMENT);
        printRow(waveLength, FOURTH_ROW_ELEMENT);
    }

    private static void printRow(int waveLength, String rowElement) {
        for(int i=0; i< waveLength;i++){
            System.out.print(rowElement);
        }
        System.out.println();
    }

}
 */