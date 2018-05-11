import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Circle {
    public static void main(String[] args) throws IOException {

        BufferedReader red = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(red.readLine());

        System.out.println("S = " + 3.14 * (a * a));
        System.out.println("P = " + 2 * 3.14 * a);
    }
}
