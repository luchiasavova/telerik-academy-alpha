package telerikacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p02_Trapezoid {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        printTopSide(n);
        printMiddlePart(n);
        printBottomLine(n);
    }

    private static void printBottomLine(int n) {
        System.out.println(newString(2 * n, '*'));
    }

    private static void printMiddlePart(int n) {
        for (int i = 0; i < n - 1; i++) {
            System.out.printf("%s*%s*\n",
                    newString(n - i - 1, '.'),
                    newString(2 * n - (n - i - 1) - 2, '.'));
        }
    }

    private static void printTopSide(int n) {
        System.out.printf("%s%s\n", newString(n, '.'), newString(n, '*'));
    }

    private static String newString(int n, char character) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(character);
        }

        return sb.toString();
    }
}
