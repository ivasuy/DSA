package Codechef;

import java.util.Scanner;

public class SALESEASON {

    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        int t;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();

        for ( int i = 0; i < t; i++ ){

            int x = in.nextInt();

            if ( x <= 100 ){
                System.out.println(x);
            }else if ( x <= 1000 && x > 100 ){
                System.out.println(x - 25 );
            } else if ( x <= 5000 && x > 1000 ) {
                System.out.println(x-100);
            }else{
                System.out.println(x-500);
            }
        }
    }
}
