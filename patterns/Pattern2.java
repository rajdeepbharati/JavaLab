/*
Print the following pattern:
      1
    1 2
  1 2 3
1 2 3 4
*/
class Pattern2 {
    public static void main(String[] args) {
        int j;
        for (int i = 1; i <= 4; i++) {
            for (j = 2 * (4 - i); j >= 1; j--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
