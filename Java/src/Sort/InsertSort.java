package Sort;

/**
 * 直接排序
 * @Author liu
 * @Date 2019/9/25 19:59
 */
public class InsertSort {
    public static void main(String args[]){
        int[] nums = {7, 8, 6, 2, 3, 4, 15, 23, 1, 1, 56};
        sort(nums);
        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
    public static int[] sort(int[] nums){
        for(int i = 1; i < nums.length; i++){
            for(int j = i; j > 0 && nums[j] < nums[j - 1]; j--){
                SwapUtil.swap(nums, j, j-1);
            }
        }
        return nums;
    }
}
