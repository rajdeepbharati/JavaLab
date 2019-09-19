class Merge {
    static int[] merge(int[] a1, int[] a2) {
        int[] c = new int[a1.length + a2.length - 2];
        int i = 0, j = 0;
        for (int k = 0; k < c.length; k++) {
            if (a1[i] < a2[j]) {
                c[k] = a1[i];
                i++;
            } else {
                c[k] = a2[j];
                j++;
            }
        }
        return c;
    }

    public static void main(String args[]) {
        int inf = 32000;
        int[] a1 = { 2, 3, 6, 9, inf };
        int[] a2 = { -6, 4, 11, 12, inf };
        int[] c = merge(a1, a2);
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + "\t");
        }
        System.out.println();
    }
}
