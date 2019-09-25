package Sort;

/**
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
        for(int i = 0; i < nums.length - 1 ; i++){
            for(int j = 0; j <  nums.length - 1 - i; j++){
                if(nums[j] > nums[j+1]){
                    SwapUtil.swap(nums, j, j+1);
                }
            }
        }
        return nums;
    }
}
