import java.util.Scanner;

public class EIUBHOUSE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        double N = sc.nextDouble();
        double M = sc.nextDouble();
        double K = sc.nextDouble();
        double X = sc.nextDouble();
        X /= 100;
        double Debt = N-M;
        for (int i = 0; i < K; i++) {
            double Mdebt = Debt/K;
            // double pay = Debt/K + (Debt - (i*(Debt/K)*(X/100)));
            double Mpay = Mdebt + (Debt-(i)*Mdebt)*X - 0.000000000001; 
            sb.append(i+1 + " " + Math.round(Mpay) + "\n");
        }
        System.out.println(sb);
    }
}
