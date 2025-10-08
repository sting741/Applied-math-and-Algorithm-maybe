import java.util.Scanner;

public class EIAUCTION {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dice = { 0, 0, 0, 0, 0, 0 };
        int n = sc.nextInt();
        int[] array = new int[n];
        boolean flag = false;

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            dice[array[i]-1]++;
        }

        for (int i = (dice.length-1); i >= 0; i--) {
            if (dice[i] == 1) {
                int temp = i+1;
                for (int j = 0; j < array.length; j++) {
                    if (array[j] == temp) {
                        System.out.println(j+1);
                    }
                }
                flag = true;
                break;
            }
        }

        if (!flag) {
            System.out.println("none");
        }
    }
}
