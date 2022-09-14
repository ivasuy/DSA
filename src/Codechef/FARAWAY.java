package Codechef;

import java.util.Scanner;

public class FARAWAY {
    public static void main(String[] args) {

        int t;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();

        for (int i = 0; i < t; i++) {

            int n = in.nextInt();
            long m = in.nextLong();
            long[] a = new long[n];

            for (int j = 0; j < n; j++) {
                a[i] = in.nextLong();
            }

            long[] b = new long[n];

            long min = 1;
            long max = m;

            for (int j = 0; j < n; j++) {
                long s1 = Math.abs(min -a[j]);
                long s2 = Math.abs(max - a[j]);

                if (s1 > s2) b[j] = s1;
                else b[j] = s2;
            }

            long sol = 0;
            for (int j = 0; j < n; j++) {
                sol += b[j];
            }

            System.out.println(sol);

        }
    }
}
