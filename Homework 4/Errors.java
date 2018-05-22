
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class Errors {

    public enum HTTPError {
        BAD_REQUEST, UNAUTHORIZED, PAYMENT_REQUIRED
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

            HTTPError error = null;

        switch (a) {
                case 400:
                    error = HTTPError.BAD_REQUEST;
                    break;
                case 401:
                    error = HTTPError.UNAUTHORIZED;
                    break;
                case 402:
                    error = HTTPError.PAYMENT_REQUIRED;
                    break;
            }
        }
    }



