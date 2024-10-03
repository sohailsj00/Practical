import java.util.Scanner;

public class PMUsingSqrt {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        int m = sn.nextInt();

        int n;
        boolean isprime = true;

        if (m < 2) {
            isprime = false;
        } else {

            for (int i = 2; i <= Math.sqrt(m); i++) {
                if (m % i == 0) {
                    isprime = false;
                    break;
                }
            }

        }
        String sj = isprime ? "Prime" : "Not prime";

        System.out.println("The given number is "  + sj);
    }

}
