import java.util.Scanner;

public class EIDINRATE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            double n = sc.nextDouble();
            double l = sc.nextDouble();
            double m = sc.nextDouble();
            int year = 0;
    
            while (n < m) {
                n += (n*l/100);
                year++;
            }
            sb.append(year).append("\n");
        }   
        System.out.println(sb);
    }
}
