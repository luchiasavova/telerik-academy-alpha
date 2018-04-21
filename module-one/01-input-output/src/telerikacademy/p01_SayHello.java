package telerikacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p01_SayHello {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String name = bufferedReader.readLine();

        System.out.printf("Hello, %s!\n", name);
    }
}
