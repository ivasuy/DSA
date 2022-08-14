package Codechef;

import java.util.Scanner;

public class MAXIMUMSUBS {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        int t;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        for( int i = 0; i < t; i++ ){

            int x;
            x = in.nextInt();

            int ans = (x * 60)/30;

            System.out.println(ans);
        }
    }
}
