import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = input.nextInt();

        int sq = n * n;
        int sum = 0;

        while (sq > 0) {
            sum = sum + sq % 10;
            sq = sq / 10;
        }

        if (sum == n) {
            System.out.println("Neon number");
        } else {
            System.out.println("Not neon number");
        }

        input.close();
    }
}
