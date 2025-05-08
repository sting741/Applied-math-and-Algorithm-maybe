import java.util.Scanner;

/**
 * WIFI
 */
public class WIFI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long result;
        for (int i = 0; i < n; i++) {
            long length = sc.nextLong();
            long width = sc.nextLong();
            if (length == 0 && width == 0) {
                System.out.println(0);
            } else {
                long l_ap = Math.round((length - 1.5) / 3);
                long w_ap = Math.round((width - 1.5) / 3);
                result = l_ap * w_ap;
                System.out.println(result);
            }

        }
    }
}