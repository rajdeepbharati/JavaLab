import java.util.Scanner;
import java.lang.Math;

public class Series {
    public static long factorial(long n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (long i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values of x and n: ");
        long x = sc.nextLong();
        long n = sc.nextLong();
        double sum = 0;
        for (long i = 0; i <= n; i++) {
            sum += (Math.pow(-1, i) * Math.pow(x, i)) / (double) factorial(i);
        }
        System.out.println("Sum = " + sum);
        sc.close();
    }
}
