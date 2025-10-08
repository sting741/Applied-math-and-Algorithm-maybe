import java.util.Scanner;

public class EICREDITCARD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        double rate = sc.nextDouble();
        int t = sc.nextInt();
        double balance = 0;
        double debt = 0;
        long[] arr = new long[t+1];

        for (int i = 0; i < n; i++) {
            int day = sc.nextInt();
            arr[day] += sc.nextLong();
        }

        for (int i = 1; i <= t; i++) {
            if (i % 30 == 1 & i > 30) {
                balance = balance + ((debt / 30) * rate);
                debt = 0;
            } 
                balance += arr[i];
            
            if (balance < 0) {
                debt += balance;
            }

        }
        System.out.printf("%.6f",balance);
    }
}