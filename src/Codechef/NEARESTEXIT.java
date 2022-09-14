package Codechef;

import java.util.Scanner;

public class NEARESTEXIT {
    public static void main(String[] args) {

        int t;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();

        for (int i = 0; i < t; i++) {

            int x = in.nextInt();

            if ( 100 - x >= 50 ){
                System.out.println("LEFT");
            } else {
                System.out.println("RIGHT");
            }

        }
    }
}
