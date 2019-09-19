import java.util.Scanner;

public class PascalTriangle {

    public static int pascal(int row, int col) {
        if (col == 0 || col == row) {
            return 1;
        } else {
            return pascal(row - 1, col - 1) + pascal(row - 1, col);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the number of rows for Pascal's triangle: ");
            int rows = sc.nextInt();
            int cols = rows * 2 - 1;
            for (int row = 0; row <= rows; row++) {
                System.out.print(" ".repeat(cols - row));
                for (int col = 0; col <= row; col++) {
                    System.out.print(pascal(row, col) + " ");
                }
                System.out.println();
            }
        } finally {
            sc.close();
        }
    }
}
