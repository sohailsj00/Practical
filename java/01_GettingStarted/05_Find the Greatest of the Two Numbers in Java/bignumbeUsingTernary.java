import java.util.Scanner;

public class bignumbeUsingTernary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println("both are equal numbers");
        }

        else {
            String result = num1 > num2 ? num1 + " is greater" : num2 + "is greater";
            System.out.println(result);
        }

    }

}
