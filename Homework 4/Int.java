import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Int {
    public static void main(String[] args) throws IOException {
        BufferedReader red = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(red.readLine());
        int s = Integer.parseInt(red.readLine());
        int d = Integer.parseInt(red.readLine());

        if (a > s && a > d){
            System.out.println("Max is " + a);
        }
        else if (s > a && s > d){
            System.out.println("Max is " + s);
        }
        else if (d > a && d > s){
            System.out.println("Max is " + d);
        }

         if (d < a && d < s){
            System.out.println("Min is " + d);
        }
        else if (s < a && s < d){
            System.out.println("Min is " + s);
        }
        else if (a < s && a < d){
            System.out.println("Min is " + a);
        }
    }
}
