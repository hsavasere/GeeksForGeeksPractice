public class Solution {
    public int Nth_term(int a, int r, int n) {
        long res = (a * moduloExp(r, n - 1)) % 1_000_000_007;
        return (int) (res % 1_000_000_007);
    }

    public static long moduloExp(int r, int n) {
        if (n == 0) {
            return 1;
        }

        long temp = moduloExp(r, n / 2) % 1_000_000_007;

        if (n % 2 == 0) {
            return (temp * temp) % 1_000_000_007;
        } else {
            long temp2 = r % 1_000_000_007;
            // Wherever we are multiplying 2 numbers, we need to do the modular operation
            return (((temp * temp) % 1_000_000_007) * temp2) % 1_000_000_007;
        }
    }
}
