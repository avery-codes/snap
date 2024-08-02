// Avery Robbins
// 3/12/24
//
// The purpose of this program is to iterate through and print a chosen range of integers with three variants.
// When the integer is divisible (int % int == 0) by one or both set of criteria integers, one or both
// strings are printed.

public class Main {
    public static void main(String[] args) {
        int start = 1;
        int finish = 100;
        int firstNumber = 3;
        int secondNumber = 5;
        String firstWord = "Crackle";
        String secondWord = "Pop";

        modPrint(start, finish, firstNumber, secondNumber, firstWord, secondWord);
    }


    public static void modPrint(int start, int finish, int firstNumber, int secondNumber,
                                  String firstWord, String secondWord){
        for (int i = start; i <= finish; i++) {
            // meets both conditions, prints both words
            if ((i % firstNumber == 0) && (i % secondNumber == 0)) {
                System.out.printf("%s%s\n", firstWord, secondWord);
            // meets first condition, prints first word
            } else if (i % firstNumber == 0) {
                System.out.printf("%s\n", firstWord);
            // meets second condition, prints second word
            } else if (i % secondNumber == 0) {
                System.out.printf("%s\n", secondWord);
            // meets neither condition, prints counter
            } else {
                System.out.println(i);
            }
        }
    }
}
