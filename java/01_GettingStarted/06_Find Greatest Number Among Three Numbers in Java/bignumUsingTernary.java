import java.util.Scanner;

public class bignumUsingTernary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int temp = 0, result = 0;

        temp = num1 > num2 ? num1 : num2;

        result = temp > num3 ? temp : num3;
        System.out.println(result);
    }
}
