import java.util.Scanner;

public class EIUCUBES {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            long bricks = sc.nextLong();
            long layer = 0;
            layer = (long) Math.cbrt(6*bricks);
            long Nor_Pyra = (layer*(layer+1)*(layer+2)/6);

            if (Nor_Pyra <= bricks) {
                sb.append(layer+" ");
            } else {
                sb.append(layer-1+" ");
            }
        }
        System.out.print(sb);
    }
}