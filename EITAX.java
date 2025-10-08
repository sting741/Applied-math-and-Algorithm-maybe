    import java.util.Scanner;

    public class EITAX {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            long salary = sc.nextLong();
            long[] money = { 5000000, 5000000, 8000000, 14000000, 20000000, 28000000, Long.MAX_VALUE };
            int[] rates = { 5, 10, 15, 20, 25, 30, 35 };
            long tax = 0;
            if (salary < 11000000) {
                System.out.println(0);
            } else {
                salary -= 11000000;
                for (int i = 0; i < money.length; i++) {
                    if (salary <= 0) {
                        break;
                    }
                    long amount = Math.min(salary, money[i]);
                    tax += amount*rates[i]/100;
                    salary -= amount;
                }
                System.out.println(tax);
            }
        }
    }