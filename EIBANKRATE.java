import java.util.Scanner;

public class EIBANKRATE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int month = sc.nextInt();
        double total = 0;
        total = n + n*(0.0075)*month;
        System.out.println(total);
    }
}
