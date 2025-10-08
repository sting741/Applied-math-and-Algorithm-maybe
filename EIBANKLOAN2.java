import java.util.Scanner;

public class EIBANKLOAN2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double r = sc.nextDouble() / 100;
        
        for (int i = 1; i < 10000000; i++) {

            double interest = x*r/12;
            double principal = y-interest;
            x -= principal;

            if (x <= 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
