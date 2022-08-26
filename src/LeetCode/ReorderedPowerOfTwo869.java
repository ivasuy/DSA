package LeetCode;

public class ReorderedPowerOfTwo869 {

    public static boolean reorderedPowerOf2(int n) {

        int[] num = counter(n);

        for ( int i = 0; i < 31; i++ ){

            int power = (int)Math.pow( 2, i );

            int[] powerArr = counter(power);

            if ( compare(num,powerArr) ){

                return true;
            }
        }

        return false;
    }

    public static boolean compare ( int[] freq1, int[] freq2 ){

        for ( int i = 0; i < 10 ; i++ ){

            if ( freq1[i] != freq2[i] ){
                return false;
            }
        }

        return true;

    }

    public static int[] counter ( int N ){
//        There are total of 10 num

        int[] freq = new int[10];

        while ( N > 0 ){
//             inc freq of last int in num
            freq[N%10]++;
            N =  N/10;
        }

        return freq;

    }
}
