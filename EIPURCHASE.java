import java.text.DecimalFormat;
import java.util.Scanner;

public class EIPURCHASE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.#######");
        double V = sc.nextDouble();
        int T = sc.nextInt();
        double N = sc.nextDouble();
        double G = sc.nextDouble();
        double r = 0;

        for (double i = 0; i < 0.1; i+=0.0000001) {
            double R=1+i;
            double debtn = (V-N)*Math.pow(R,T)-(G*(Math.pow(R, T)-1))/(R-1);
            if (debtn > 0) {
                r = i;
                break;
            }
        }
        
        System.out.println(dc.format(r));
    }
}
