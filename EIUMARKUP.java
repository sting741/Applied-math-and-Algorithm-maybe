import java.util.Scanner;

public class EIUMARKUP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int cost = 200;
        long payment = 0;

        while (n > 100 && cost > 180) {
            payment += 100*cost;
            cost--;
            n -= 100;
        }

        payment += n*cost;
        System.out.println(payment);
    }
}
