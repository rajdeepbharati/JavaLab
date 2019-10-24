/*
Print the following pattern:
*****
 ***
  *
*/
class Pattern3 {
    public static void main(String[] args) {
        int i = 5;
        int line = 1;
        while (i > 0) {
            for (int k = 1; k < line; k++) {
                System.out.print(" ");
            }
            for (int j = line; j <= i + line - 1; j++) {
                System.out.print("*");
            }
            line++;
            i -= 2;
            System.out.println();
        }
    }
}
