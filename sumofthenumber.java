import java.util.Scanner;

public class sumofthenumber {
    public static void main(String[] args) {
        int sum, sub, x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers");
        x = sc.nextInt();
        y = sc.nextInt();
        sum = x + y;
        sub = x - y;
        System.out.println("sum of the number" + sum);

    }
}