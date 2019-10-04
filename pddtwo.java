import java.util.Arrays;
import java.util.Scanner;

public class pddtwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] trees = new int[n];
        int [][] arr= new int[m][2];
        for (int i = 0; i < m; i++) {
            int[] line = new int[2];
            line[0] = in.nextInt();
            line[1] = in.nextInt();
            arr[i] = line;
        }

        int res = 0;
        for (int[] li: arr) {
            int left = li[0];
            int right = li[1];
            int rNumber = right - left + 1;
            int sums = 0;
            for (int i = left -1  ; i < right; i++) {
                sums += trees[i];
                trees[i] = 1;
            }
            int added = rNumber - sums;
            res += added;
        }
        System.out.println(res);
    }
}