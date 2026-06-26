import java.util.*;

public class user_inp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;
        int mul = a * b;
        int div = a / b;
        System.out.println("Sum: " + sum);
    System.out.println("Mul: " + mul);
    System.out.println("Div: " + div);
        sc.close();
    }
}