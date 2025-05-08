import java.util.Scanner;

public class EIUMADIS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        long min = 0;
        long max_diff = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLong();
        }

        min = arr[0];
        max_diff = Long.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            max_diff = upperCompare(max_diff, arr[i] - min);
            min = lowerCompare(min, arr[i]);
        }

        if (max_diff > 0) {
            System.out.println(max_diff);
        } else {
            System.out.println(0);
        }
    }

    static public long lowerCompare(long a, long b) {
        if (a >= b) {
            return b;
        } else {
            return a;
        }
    }

    static public long upperCompare(long a, long b) {
        if (a <= b) {
            return b;
        } else {
            return a;
        }
    }
}
