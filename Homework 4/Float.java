import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Float {

    public static void main(String[] args) throws IOException {
        BufferedReader red = new BufferedReader(new InputStreamReader(System.in));
        float f = java.lang.Float.parseFloat(red.readLine());
        float a = java.lang.Float.parseFloat(red.readLine());
        float d = java.lang.Float.parseFloat(red.readLine());

        if (f > -5 && f < 5 ){
            System.out.println(f + " belong to the range ");
        }
        else {
            System.out.println(f + " not belong to the range");
        }


        if (a > - 5 && a < 5){
            System.out.println(a + " belong to the range ");
        }
        else {
            System.out.println(a + " not belong to the range");
        }


        if (d > - 5 && d < 5){
            System.out.println(d + " belong to the range ");
        }
        else {
            System.out.println(d + " not belong to the range");
        }
    }
}


