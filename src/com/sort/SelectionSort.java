package sort;

/**
 * 选择排序
 * 第一次从待排序的数据元素中选出最小（或最大）的一个元素，存放在序列的起始位置，然后再从剩余的未排序元素中寻找到最小（大）元素，然后放到已排序的序列的末尾。以此类推，直到全部待排序的数据元素的个数为零。
 * @author zch
 * @date 2020/4/24 10:23
 */
public class SelectionSort {
    public static int[] selectionSort(int[] arr) {
        //设n=arr.length, 因为前 n-1 都是挑出来较小的数，所以剩下的最后一个数是最大的数，外层循环的次数为n-1。
        for(int i = 0; i < arr.length - 1; i++){
            //记录循环过程中最小数的下标。
            int minIndex = i;
            //循环待排序数组（arr[i..n]）找出最小的数。
            for(int j = i; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            //如果最小的数就在待排序数组的第一个数，不用交换。
            if(i != minIndex){
                int min = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
            //每次循环完保证了arr[0..i]中的每个数都 比 arr[i..n] 中的数小（或相等）;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] testArr = {5, 7, 8, 9, 4, 4, 13, 2, 12, 11};
        int[] resArr = selectionSort(testArr);
        for (int i : resArr) {
            System.out.println(i);
        }
    }
}
