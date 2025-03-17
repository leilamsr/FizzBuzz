import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 1; i < n; i++) {
            String word = "";

            if (i % 3 == 0) {
                word += "Fizz";
            }
            if (i % 5 == 0) {
                word += "Buzz";
            }

            if (word == "") {
                word = String.valueOf(i);
            }

            System.out.println(word);
        }
    }
}