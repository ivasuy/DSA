package Codechef;

import java.util.Scanner;

public class CHEFGAMES {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        int t;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();

        for (int i = 0; i < t; i++){

            int r1,r2,r3,r4;

            r1 = in.nextInt();
            r2 = in.nextInt();
            r3 = in.nextInt();
            r4 = in.nextInt();

            if ( r1 == 0 && r2 == 0 && r3 == 0 && r4 == 0 ){
                System.out.println("IN");
            } else {
                System.out.println("OUT");
            }
        }
    }
}
