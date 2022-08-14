import java.util.Scanner;

public class TVDISC {
    public static void main(String[] args) {
        int t;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        for(int i=0;i<t;i++) {

            int a, b, c, d;
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
            d = in.nextInt();

            int aDis = a - c;
            int bDis = b - d;

            if ( aDis > bDis) {
                System.out.println("Second");
            } else if ( aDis < bDis) {
                System.out.println("First");
            }else {
                System.out.println("Any");
            }
        }
    }
}
