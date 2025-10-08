import java.util.Scanner;

public class EIUCHRMS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long total = 0;
        long total_discount = 0;
        for (int i = 0; i < n; i++) {
            long temp = sc.nextInt();
            total += temp;
            if (temp > 200000000) {
                total_discount += temp*10/100;
            } else if(temp > 100000000) {
                total_discount += temp*9/100;
            } else if (temp > 50000000) {
                total_discount += temp*8/100;
            } else if(temp > 20000000) {
                total_discount += temp*7/100;
            } else if (temp > 10000000) {
                total_discount += temp*6/100;
            } else if(temp > 5000000) {
                total_discount += temp*5/100;
            } else if (temp > 2000000) {
                total_discount += temp*4/100;
            } else {
                total_discount += temp*3/100;
            }
        }
        System.out.println(total-total_discount);
    }
}
