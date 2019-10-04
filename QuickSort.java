import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        final int MAX = 15;
        int[] nums = new int[MAX];
        System.out.println("...............使用的是选择排序算法...............");
        for (int i = 0; i < MAX; i++) {
            nums[i] = (int) (Math.random() * 10 + 5);
        }
        System.out.println("排序之前的数组为...............");
        System.out.println(Arrays.toString(nums));
        System.out.println("排序之后的数组为...............");
        //使用选择排序算法进行排序：
        QuickSort sort = new QuickSort();
        sort.quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    public void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            int middle = getMiddle(nums, low, high);
            //对左子序列进行排序
            quickSort(nums, low, middle - 1);
            //对右子序列进行排序
            quickSort(nums, middle + 1, high);
        }
    }

    private int getMiddle(int[] nums, int low, int high) {
        //当前数组的第一个元素作为中轴（基准）
        int temp = nums[low];
        while (low < high) {
            //这里temp <= nums[high]中等号的情况相当于数组中出现了两个相等的数字，循环比较依然能够继续
            while (low < high && temp <= nums[high]) {
                high--;
            }
            nums[low] = nums[high];
            while (low < high && temp >= nums[low]) {
                low++;
            }
            nums[high] = nums[low];
        }
        nums[low] = temp;
        return low;
    }
}