package Sort;

public class QuickSort {

    public static void main(String args[]){
        int[] nums = {7, 8, 6, 2, 3, 4, 15, 23, 1, 1, 56};
        sort(nums, 0, nums.length - 1);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    private static void sort(int[] nums, int l, int r){
        if(l >= r){
            return ;
        }
        int index = l;
        int start = l+1, end = r;
        while (start < end){
            while (nums[index] >= nums[start] && start < end){
                start++;
            }
            while (nums[index] <= nums[end] && start < end){
                end--;
            }
            if(start < end){
                SwapUtil.swap(nums, start, end);
            }
        }
        //此时start和end是一个值
        SwapUtil.swap(nums, index, start - 1);
        sort(nums, l, start - 1);
        sort(nums, end + 1, r);

    }

}
