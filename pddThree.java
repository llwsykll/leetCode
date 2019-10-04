import java.util.Scanner;
import java.util.*;

public class pddThree {
    List<String> set = new ArrayList<String>();
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        pddThree m = new pddThree();
        int N = 2;
        int M = 1;
        int K = 4;
        int[][] dp = m.createDp(N, M);
        m.findK(N, M, K, dp);
        m.printRes();
    }

    public void printRes() {
        System.out.println(set.remove(0));
    }
    public int[][] createDp(int N, int M) {
        int[][] dp = new int[N+1][M+1];
        for (int i = 1; i <= N; i++) {
            dp[i][0] = 1;
        } 
        for (int j = 1; j <= M; j++) {
            dp[0][j] = 1;
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp;
    } 

    public void findK(int N, int M, int K, int dp[][]) {
        StringBuilder sb = new StringBuilder();
        while (K > 0 && N > 0 && M > 0) {
            if (dp[N-1][M] >= K) {
                sb.append("a");
                N--;
            } else {
                sb.append("b");
                K = K-dp[N-1][M];
                M--;
            }
        }
        while (M > 0) {
            sb.append("b");
            M--;
        }
        set.add(sb.toString());
    }
}