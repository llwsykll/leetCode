import java.util.*;

public class MergeSort {
    /**
     * 一个数组内部进行排序
     *
     * **/
    public static void mergeOne(int arr[],int startInt,int stopInt,int[] cArr){
        //如果范围是1则直接返回。
        if(stopInt==startInt){
            return;
        }
        else{
            int middle=(startInt+stopInt)/2;
            //开始把数组分开---二分法
            mergeOne(arr, startInt, middle,cArr);
            mergeOne(arr, middle+1, stopInt,cArr);
            mergeTwoSort(arr,startInt,middle,stopInt,cArr);
        }
    }
    public static void mergeTwoSort(int arr[],int start,int mid,int end,int[] cArr){
        int left=start;//左序列开始角标
        int right=mid+1;//右序列开始角标
        int cIndex=0;//临时数组
        //当两边都有值时执行
        while(left <= mid&& end>=right){
            //比较两个数组的元素大小，如：A：left=0开始到3，长度为4，B：right=4开始，长度为4，
            if(arr[left]<arr[right])
            {
                cArr[cIndex++]=arr[left++];
            }else{
                cArr[cIndex++]=arr[right++];
            }
        }
        //当右边数组无元素时执行
        while(left<=mid){
            cArr[cIndex++]=arr[left++];
        }
        //当左边数组无元素时执行
        while(right<=end){
            cArr[cIndex++]=arr[right++];
        }
        //将临时数组全部添加进原数组
        cIndex=0;//指针修改为0
        while(start<=end){
            arr[start++]=cArr[cIndex++];
        }
    }
    public static void main(String[] args) {
        int[] arr3={12,4,34,5,6,45,9};
        int[] cArr=new int[7];
        mergeOne(arr3, 0, 6, cArr);
        System.out.println("一个数组内部排序");
        System.out.println(Arrays.toString(cArr)); 
    }
}