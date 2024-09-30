public class bignumUsingIfElse1 {

    public static void main(String[] args) {
        

        int num1=12,num2=23,num3=245;

        if(num1>=num2 && num1>=num3)
        {
            System.out.println(num1 + " is greatest number");
        }

        else if(num2>=num1 && num2>=num3)
        {
            System.out.println(num2 + " is greatest number");
        }

        else
        {
            System.out.println(num3 + "  is greatest number");
        }
    }
    
}
