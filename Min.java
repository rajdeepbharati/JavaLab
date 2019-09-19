import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b, and c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int min;
        min = (a > b ? (c > b ? b : c) : (c > a ? a : c));
        System.out.println("Minimum of a, b, and c is: " + min);
        sc.close();
    }
}
