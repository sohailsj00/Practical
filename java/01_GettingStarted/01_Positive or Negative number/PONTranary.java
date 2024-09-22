import java.util.Scanner;

public class PONTranary {

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();

    if(num==0)
    {
        System.out.println("Number is zero");
    }

    else{
        String result= num >0 ? "the num is pos":"the num is neg";
        System.out.println(result);
    }
}    
}
