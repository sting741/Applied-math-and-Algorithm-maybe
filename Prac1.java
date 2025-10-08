import java.util.Scanner;

public class Prac1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();  
        long temp = N;
        int i = 1;
        for (; i < Math.sqrt(N); i++) {
            temp -= i*i;
            if (temp <= 0) {
                break;
            }
        }
        System.out.println(i-1);
    }
}
