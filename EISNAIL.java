import java.util.Scanner;

public class EISNAIL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long v = sc.nextLong();
        double days = 0;
        long day = 0;

        days = (double) (v - a) / (a - b);
        day = Math.round(days);
        if (days > day) {
            day++;
        }
        day++;

        System.out.println(day);
    }
}
