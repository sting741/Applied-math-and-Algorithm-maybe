import java.util.Arrays;
import java.util.Scanner;

public class EVERN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++) {
            boolean flag = true;
            int n = sc.nextInt();
            int thres = sc.nextInt();
            int arr[] = new int[thres + 1];

            for (int j = 0; j < n; j++) {
                int number = sc.nextInt();
                if (number > 0 && number <= thres) {
                    arr[number]++;
                }
            }

            for (int j = 1; j <= thres; j++) {
                if (arr[j] == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                sb.append("Yes\n");
            } else {
                sb.append("No\n");
            }
        }
        System.out.print(sb);
    }
}
