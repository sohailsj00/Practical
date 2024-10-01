import java.util.Scanner;

public class LYUsingTernary {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int year=sc.nextInt();

        int sj=(year % 400 == 0) || (year % 4 == 0 && year % 100 !=0) ? 1:0;

        if(sj == 1)
        {
            System.out.println(year + " is the leap year");
        }
        else
        {
            System.out.println(year + "is not a leap Year");
        }


    }
    
}
