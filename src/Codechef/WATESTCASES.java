package Codechef;

import java.util.Scanner;

public class WATESTCASES {

    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        int t;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();

        for(int i = 0; i < t; i++ ) {

            int ans = Integer.MAX_VALUE;
            int n;
            n = in.nextInt();
            int[] arr = new int[n];

            for( int j = 0; j < n; j++ ){

            arr[j] = in.nextInt();;

            }
            String s = in.next();
            int k = 0;

            while( k < n ){
                for ( char c : s.toCharArray()){
                    if ( c == '0') {
                        ans = Math.min(ans, arr[k]);
                    }
                    k++;
                }
            }
            System.out.println(ans);
        }
    }

}
