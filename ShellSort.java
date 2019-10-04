import java.util.*;

public class ShellSort {
    public static void sortInt(int[] arr) {
        for (int gap = arr.length/2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                for (int j = i; j >= gap; j-= gap) {
                    if (arr[j] < arr[j-gap]) {
                        int temp = arr[j];
                        arr[j] = arr[j-gap];
                        arr[j-gap] = temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void heapify(int[] arrays, int currentRootNode, int size) {

        if (currentRootNode < size) {
            //左子树和右字数的位置
            int left = 2 * currentRootNode + 1;
            int right = 2 * currentRootNode + 2;

            //把当前父节点位置看成是最大的
            int max = currentRootNode;

            if (left < size) {
                //如果比当前根元素要大，记录它的位置
                if (arrays[max] < arrays[left]) {
                    max = left;
                }
            }
            if (right < size) {
                //如果比当前根元素要大，记录它的位置
                if (arrays[max] < arrays[right]) {
                    max = right;
                }
            }
            //如果最大的不是根元素位置，那么就交换
            if (max != currentRootNode) {
                int temp = arrays[max];
                arrays[max] = arrays[currentRootNode];
                arrays[currentRootNode] = temp;

            //继续比较，直到完成一次建堆
            heapify(arrays, max, size);
            }
        }
    }

    /**
     * 完成一次建堆，最大值在堆的顶部(根节点)
     */
    public static void maxHeapify(int[] arrays, int size) {

        // 从数组的尾部开始，直到第一个元素(角标为0)
        for (int i = size - 1; i >= 0; i--) {
            heapify(arrays, i, size);
        }

    }
    public static void main(String[] args) {
        int[] arr = {34,8,64,51,32,21};
        int [] arrays = arr;
        // sortInt(arr);

        for (int i = 0; i < arrays.length; i++) {

            //每次建堆就可以排除一个元素了
            maxHeapify(arrays, arrays.length - i);

            //交换
            int temp = arrays[0];
            arrays[0] = arrays[(arrays.length - 1) - i];
            arrays[(arrays.length - 1) - i] = temp;

        }
    }
}