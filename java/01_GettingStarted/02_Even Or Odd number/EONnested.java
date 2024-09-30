import java.util.Scanner;

/**
 * EONnested
 */
public class EONnested {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String status = num % 2 == 0 ? " is Even" : " is Odd";
        System.out.println(status + num);
    }
}