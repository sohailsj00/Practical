import java.lang.*;
import java.util.Scanner;
public class bigNumberusingInbuiltfn {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
    
        if(num1==num2)
        {
            System.out.println("both numbers are equal");
        
        }
    else
    {
        System.out.println(Math.max(num1,num2)+ " is greater number");
    }
    }
   

}