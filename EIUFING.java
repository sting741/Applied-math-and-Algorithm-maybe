import java.util.Scanner;

public class EIUFING {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        int m = 0;
        String hand = "0";
        String[] fingers = {"cai", "tro", "giua", "ap ut", "ut", "ut", "ap ut", "giua", "tro", "cai"};
        if (n > 18) {
            m = (int) n%18;
        }
        if (m > 10) {
            m = 20-m;
        } 
        if (m <= 5) {
            hand = "trai";
        } else {
            hand = "phai";
        }
        System.out.println("Ngon " + fingers[m-1] + " cua ban tay " + hand);
    }
}
