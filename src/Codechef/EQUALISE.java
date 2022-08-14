package Codechef;

import java.util.Scanner;

public class EQUALISE {

    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        int t;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();

        for (int i = 0; i < t; i++){

            int a,b;
            a = in.nextInt();
            b = in.nextInt();
            int Min = Math.min(a,b);
            int Max = Math.max(a,b);
            int flag = 0;

            while( Min <= Max ){
                if( Min == Max ){
                    System.out.println("Yes");
                    flag = 1;
                }
                Min *= 2;
            }
            if ( flag == 0 ){
                System.out.println("No");
            }
        }
    }
}
