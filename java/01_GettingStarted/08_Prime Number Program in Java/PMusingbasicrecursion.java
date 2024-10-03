public class PMusingbasicrecursion {
public static void main(String[] args) {
    
    int n=23;
    boolean isPrime=true;

    int m=34;
    isPrime=checkPrime(n, i);

    String sj=isPrime ? "Prime" : " Not Prime";
    System.out.println(n+ " is :" + sj);
}

    static boolean checkPrime(int n,int m)
    {
        if(n<2)
            return false;

        if(m == n)
            return true;

        if(n % m== 0)
            return false;

        m+ =1;
        return checkPrime(n, i);
    }
    
}
