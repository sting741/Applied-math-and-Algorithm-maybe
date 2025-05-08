import java.util.Scanner;

public class EIINCRDES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int temp = -1;
        long[] arr = new long[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLong();
        }

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == arr[i - 1]) {
                sb.append("none");
                break;
            } else if (arr[i] > arr[i - 1]) {
                if (temp == 0) {
                    sb.append("none");
                    break; 
                }
                temp = 1;
            } else {
                if (temp == 1) {
                    sb.append("none");
                    break;
                }
                temp = 0;
            }

            if (i == arr.length-1) {
                if (temp == 1) {
                    sb.append("increasing");
                } else {
                    sb.append("decreasing");
                }
            }
        }

        System.out.println(sb);
    }
}
