import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Variables {
    public static void main(String[] args) throws IOException {
        BufferedReader red = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("What is your name?");
        String name = red.readLine();
        System.out.println("Where are you live, " + name + "?");
        String address = red.readLine();
        System.out.println(name + " - " + address);
    }
}
