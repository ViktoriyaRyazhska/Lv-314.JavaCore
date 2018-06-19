import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please set task:");

        switch (Integer.parseInt(reader.readLine())) {
            case 1: {
                task1();
                break;
            }
            case 2: {
                task2();
                break;
            }
            case 3: {
                task3();
                break;
            }
            case 4: {
                task4();
                break;
            }
            case 5: {
                task5();
                break;
            }
            case 6: {
                task6();
                break;
            }
            case 7: {
                task7();
                break;
            }
            case 8: {
                task8();
                break;
            }
            case 9: {
                task9();
                break;
            }
            case 10: {
                task10();
                break;
            }
            case 11: {
                task11();
                break;
            }
            case 12: {
                task12();
                break;
            }
            case 13: {
                task13();
                break;
            }
            case 14: {
                task14();
                break;
            }

        }
    }

    static void task1() {
        int num = 1;
        int num2 = 1;
        int loop;
        int fibonacci = 0;


        for (loop = 0; loop < 6; loop++) {
            System.out.println(num);
            fibonacci = num + num2;
            num = num2;
            num2 = fibonacci;

        }

    } //yarik

    static void task2() throws IOException {
        BufferedReader enter = new BufferedReader(new InputStreamReader(System.in));
        float multiplier = Integer.parseInt(enter.readLine());
        float sum;
        int i = 2;
        while (i <= multiplier) {
            sum = multiplier / i;
            if (sum % 1 == 0) //int else float
            {
                System.out.println(i);
                multiplier = sum;
            } else
                i++;


        }
    }

    static void task3() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input exchange rate eg.26.1");
        double rate = 0;
        double grivna = 0;
        rate = Double.parseDouble(br.readLine());
        System.out.println("Input some of grivna");
        grivna = Double.parseDouble(br.readLine());
        System.out.printf("You can buy " + (grivna / rate) + " dollars");
    }//taras

    static void task4() throws IOException {
        BufferedReader enter = new BufferedReader(new InputStreamReader(System.in));
        String s = enter.readLine();
        int count = 0;
        String loudletters = "aeyuio";
        for (int j = 0; j < loudletters.length(); j++) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == loudletters.charAt(j))
                    count++;

            }
        }
        System.out.println(count);
    }

    static void task5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String word = sc.nextLine();
        word.toLowerCase();
        boolean palindrome = true;
        int i1 = 0;
        int i2 = word.length() - 1;
        while (i2 > i1) {
            if (word.charAt(i1) != word.charAt(i2)) {
                palindrome = false;
                break;
            }
            ++i1;
            --i2;
        }
        System.out.println(palindrome);
    }

    static void task6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String input = sc.nextLine();
        do {
            input = input.replace("  ", " ");
        } while (input.contains("  "));
        String s[] = input.split(" ");
        System.out.println(s.length);
    }//taras

    static void task7() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input n");
        int n = 0;
        int result = 1;
        n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        System.out.println("Factorial of " + n + " is: " + result);
    }

    static void task8() {
    } // in process

    static void task9() {
        Random rnd = new Random();

        boolean a;
        int count = 0;

        for (int i = 0; i < 10; i++) {
            a = rnd.nextBoolean();
            if (a) {
                count++;
            }
        }
        System.out.println(count);
    }

    static void task10() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input number greater than one");
        int n;
        int count = 0;
        n = Integer.parseInt(br.readLine());
        while (n > 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = (n * 3) + 1;
            }
            count++;
        }
        System.out.println("Number of steps " + count);
    }

    static void task11() {
        int[] digits = {4, 7, 1, 0, 8, 8, 5, 5, 3, 0, 1, 8, 3, 9, 6, 8};
        int sum = 0;
        int length = digits.length;
        for (int i = 0; i < length; i++) {

            // get digits in reverse order
            int digit = digits[length - i - 1];

            // every 2nd number multiply with 2
            if (i % 2 == 1) {
                digit *= 2;
            }
            sum += digit > 9 ? digit - 9 : digit;
        }
        System.out.println(sum % 10 == 0);
    }

    static void task12() {
        int natural_number = 938;
        int sum = 0;
        for (int i = 1; i < natural_number; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                sum += i;
        }
        System.out.println(sum);
    }

    static void task13() {
        int number = 0;
        for (int i = 1; i < 999999999; i++) {
            if (i % 20 == 0 && i % 19 == 0 && i % 18 == 0 && i % 17 == 0 && i % 16 == 0 && i % 15 == 0 && i % 14 == 0
                    && i % 13 == 0 && i % 12 == 0 && i % 11 == 0) {
                number = i;
                break;
            }
        }
        System.out.println(number);
    }

    static void task14() {
        int sum = 200;
        int[] coins = {1, 2, 5, 10, 20, 50, 100, 200};
        int[] ways = new int[sum + 1];
        ways[0] = 1;

        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j <= sum; j++) {
                ways[j] += ways[j - coins[i]];
            }
        }
        // can be generate
        System.out.println(ways[ways.length - 1]);
    }

}
