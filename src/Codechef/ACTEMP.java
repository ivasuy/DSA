package Codechef;

import java.util.Scanner;

public class ACTEMP {

    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        int t;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();

        for(int i=0;i<t;i++) {

            int  a,b,c ;
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();

            if ( a > b || c > b ){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}
