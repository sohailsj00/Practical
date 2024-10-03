import java.util.Scanner;

public class PMusingItration {

    public static void main(String[] args) {

        Scanner sn=new Scanner(System.in);
        int m=sn.nextInt();

        int n;

        boolean isprime = true;

        if (m < 2) {
            isprime = true;
        } else {
            for (int i = 2; i <= m / 2; i++) {
                if (m % i == 0) {
                    isprime = false;
                    break;
                }
            }
        }
        String s = isprime ? "Prime" : "Not Prime";
        System.out.println(s);
    }

}
