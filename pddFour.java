import java.util.Scanner;
import java.util.*;
import java.math.*;

public class pddFour {
    static long mod = 1000000007;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 0; i < N; i++) {
            func(in);
        }
    }

    public static void func(Scanner in) {
        long n = in.nextInt();
        int m = in.nextInt();
        long[] W = new long[m];

        for (int i = 0; i < m; i++) {
            W[i] = in.nextLong();
        }
        int[] C = new int[m];
        for (int i = 0 ; i < m; i ++) {
            C[i] = in.nextInt();
        }
        if (m == 0) {
            System.out.println((4L * pow(3L, n-1L)) % mod);
            return;
        }

        long begin = 0;
        long end = W[0];
        long    res = 1L;
        if (end >= 2L) {
            res = (pow(3L, end - 1L)) % mod;
        }
        int pre = 0;
        int succ = C[0];
        for (int i = 1; i <m; i++) {
            begin = end;
            end = W[i];
            pre = succ;
            succ = C[i];
            res =  res * cal(begin, end, pre, succ)) % mod;
        }

        begin = end;
        end = n + 1L;
        long del = end - begin;
        if (del >= 2L) {
            res = (pow(3L, del - 1)) %mod;
        }
        System.out.println(res);
    }

    public static long cal(long begin, long end, int pre, int succ) {
        long del = end - begin;
        if (del == 1L) {
            if(pre == succ) {
                return 0L;
            }else {
                return 1L;
            }
        } else if (del == 2L) {
            if(pre == succ) {
                return 3L;
            }else {
                return 2L;
            }
        } else {
            long p = del - 3L;
            if (p == 0L) {
                if (pre == succ) {
                return 6L;
                } else {
                    return 7L;
                } 
            } else if (pre == 1L) {
            if (pre == succ) {
                return 21L;
            } else {
                return 20L;
            }
        } else {
            return (81L * pow(4L, p-2L)) %mod;
        }
    }