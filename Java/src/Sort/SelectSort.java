package Sort;

/**
 * 选择排序
 * @Author liu
 * @Date 2019/9/25 19:59
 */
public class SelectSort {
    public static void main(String args[]){
        int[] nums = {7, 8, 6, 2, 3, 4, 15, 23, 1, 1, 56};
        sort(nums);
        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
    public static int[] sort(int[] nums){
        int minIndex = 0;
        for(int i = 0; i < nums.length ; i++){
            minIndex = i;
            for(int j = i + 1; j < nums.length ; j++){
                if(nums[j] < nums[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                SwapUtil.swap(nums, i, minIndex);
            }
        }
        return nums;
    }
}
