import java.util.Scanner;

public class PONnested {
    
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        int num=SC.nextInt();

        if(num !=0)
        {

            if(num>0){
                System.out.println("num is positive");  
            }
            else{
                System.out.println("num is negeative");
            }
        }
        else
        {
            System.out.println("Num is zero");
        }
    }
}
