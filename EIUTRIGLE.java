import java.util.Arrays;
import java.util.Scanner;

public class EIUTRIGLE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int triangles = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for (int i = n-1; i >= 2; i--) {
            int left = 0;
            int right = i - 1;

            while (left < right) {
                if ((arr[left] + arr[right] > arr[i])) {
                    triangles += right-left;
                    right--;
                } else {
                    left++;
                }
            }
        }

        System.out.println(triangles);
    }
}
