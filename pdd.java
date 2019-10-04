import java.util.Arrays;
import java.util.Scanner;

public class pdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] =in.nextInt();
        }

        long sum = 0;

        Arrays.sort(arr);;
        int j = 0;
        while (M > 0) {
            int i = 2 * M - 1 + j;
            sum += arr[j] * arr[i];
            M--;
            j++;
        }
        System.out.println(sum);
    }
}