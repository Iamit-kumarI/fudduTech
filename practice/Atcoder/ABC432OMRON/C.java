package Atcoder.ABC432OMRON;
import java.util.*;
import java.io.*;
public class C {
    //not submitted
        public static void main(String[] args) throws Exception {
            FastScanner sc = new FastScanner(System.in);

            int N = sc.nextInt();
            long X = sc.nextLong();
            long Y = sc.nextLong();
            long[] A = new long[N];
            for (int i = 0; i < N; i++) A[i] = sc.nextLong();
            long D = Y - X;          // positive
            long g = gcd(X, D);      // gcd
            long mod = D / g;        // required modulo constraint
            // Check modular consistency of A[i]
            long first = A[0] % mod;
            for (int i = 1; i < N; i++) {
                if (A[i] % mod != first) {
                    System.out.println(-1);
                    return;
                }
            }
            // Compute intersection of W ranges
            long L = Long.MIN_VALUE;
            long R = Long.MAX_VALUE;
            for (int i = 0; i < N; i++) {
                long Li = X * A[i];
                long Ri = X * A[i] + D * A[i];
                L = Math.max(L, Li);
                R = Math.min(R, Ri);
            }
            // No common W
            if (L > R) {
                System.out.println(-1);
                return;
            }
            long W = R; // choose max possible W
            long totalLarge = 0;
            for (int i = 0; i < N; i++) {
                totalLarge += (W - X * A[i]) / D;
            }

            System.out.println(totalLarge);
        }

        static long gcd(long a, long b) {
            return b == 0 ? a : gcd(b, a % b);
        }

        // FastScanner for speed (important for 2e5 input)
        static class FastScanner {
            private final InputStream in;
            private final byte[] buffer = new byte[1 << 16];
            private int ptr = 0, len = 0;

            FastScanner(InputStream is) {
                in = is;
            }

            private int read() throws IOException {
                if (ptr >= len) {
                    len = in.read(buffer);
                    ptr = 0;
                    if (len <= 0) return -1;
                }
                return buffer[ptr++];
            }

            long nextLong() throws IOException {
                int c;
                while ((c = read()) <= ' ') {
                    if (c == -1) return -1;
                }
                long sign = 1;
                if (c == '-') {
                    sign = -1;
                    c = read();
                }
                long val = c - '0';
                while ((c = read()) > ' ') val = val * 10 + (c - '0');
                return val * sign;
            }

            int nextInt() throws IOException {
                return (int) nextLong();
            }
        }
    }
