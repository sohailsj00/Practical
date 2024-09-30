
public class SUMUsingRecursion {
    public static void main(String[] args) {
        
        int a=1;
        int b=3;
        

        int sum= getSum(0,a,b);
        System.out.println(sum);

    }

    static int getSum( int i, int b)
    {
        if (i>b)
        return sum;

        return i + getSum(i+1, b);
    }
    
}
