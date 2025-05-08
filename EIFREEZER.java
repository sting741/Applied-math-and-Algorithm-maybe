import java.util.Scanner;

public class EIFREEZER {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long fridge = sc.nextLong();
        long a = 0, b = 0, c = 0;

        for (int i = 1; i < fridge; i++) {
            if (Math.pow(i, 3) <= fridge) {
                a = i;
                if (Math.pow(i, 2)*a <= fridge) {
                    b = i;
                    c = fridge/(a*b);
                    if (a*b*c == fridge) {
                        System.out.println(c + " " + b + " " + a);
                    }
            }
        }
    }
}
}