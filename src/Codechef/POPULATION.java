import java.util.Scanner;

public class POPULATION {

    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        int t;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        for( int i = 0; i < t; i++ ){

            int x,y,z;
            x = in.nextInt();
            y = in.nextInt();
            z = in.nextInt();

            int res = (x-y) + z;

            System.out.println(res);

        }
    }
}
