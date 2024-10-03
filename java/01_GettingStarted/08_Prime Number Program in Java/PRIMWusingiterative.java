import java.util.Scanner;

class prime{


    public static void main(String[] args) {
        int n , count=0;
        System.out.println("Enter the number");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();


        for(int i=1;i<=n;i++)
        {
            if(n % i == 0)

            count++;
        }
        if(count==2)
        {
            System.out.println("this is prime number");
        }
        else
        {
            System.out.println("Not a prime number");
        }
    }
}