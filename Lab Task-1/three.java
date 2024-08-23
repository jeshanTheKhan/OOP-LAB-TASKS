import java.util.*;

public class three {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        sc.close();
        System.out.print("All the divisors of enter number : ");
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.print(i + ",");
            }
        }
    }
}
