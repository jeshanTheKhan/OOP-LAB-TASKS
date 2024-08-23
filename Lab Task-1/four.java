import java.util.*;

public class four {
    public static void main(String[] args) {

        int flag = 0, m = 0;
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        sc.close();

        m = number / 2;

        if (number == 0 || number == 1) {
            System.out.println(number + " isn't a prime a number.");
        } else {
            for (int i = 2; i < m; i++) {
                if (number % i == 0) {
                    System.out.println(number + " isn't a prime a number.");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(number + " is a prime a number.");
            }
        }
    }
}
