public class PMUsingBreak {

    public static void main(String[] args) {

        int i, n = 13;
        boolean isprime = true;

        if (n < 2) {
            isprime = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isprime = false;
                    break;
                }
            }
        }
        String r = isprime ? "prime" : "Not prime";

        System.out.println("The num  " + n + "is " + r);
    }

}
