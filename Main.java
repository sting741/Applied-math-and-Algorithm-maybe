import java.util.Scanner;

public class Main {

    static final long MOD = 12345678987654321L;
    static long multiplyMod(long a, long b, long m) {
        long result = 0;
        a %= m;

        while (b > 0) {
            if ((b & 1) == 1) {
                result = (result + a);
                if (result >= m) {
                    result -= m;
                }
            }
            a = (a * 2);
            if (a >= m) {
                a -= m;
            }
            b >>= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();

        long termN = n;
        long termNPlus1 = n + 1;
        long term2NPlus1 = 2 * n + 1;

        if (termN % 2 == 0) {
            termN /= 2;
        } else {
            termNPlus1 /= 2;
        }

        if (termN % 3 == 0) {
            termN /= 3;
        } else if (termNPlus1 % 3 == 0) {
            termNPlus1 /= 3;
        } else {
            term2NPlus1 /= 3;
        }
        long res;
        long t1_mod = termN % MOD;
        long t2_mod = termNPlus1 % MOD;
        long t3_mod = term2NPlus1 % MOD;
        
        res = multiplyMod(t1_mod, t2_mod, MOD);
        res = multiplyMod(res, t3_mod, MOD);

        System.out.println(res);
    }
}
