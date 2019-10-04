import java.util.*;

public class insertsort {

    public static void sortInt (int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--){
                if (arr[j-1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {34,8,64,51,32,21};
        sortInt(arr);
    }
}