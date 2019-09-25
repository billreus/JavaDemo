package Sort;

public class QuickSort {

    public static void main(String args[]){
        int[] nums = {7, 8, 6, 2, 3, 4, 15, 23, 1, 1, 56};
        sort(nums, 0, nums.length - 1);
        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
    public static void sort(int[] nums, int l, int r){
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
        //此时strat和end是一个值
        SwapUtil.swap(nums, index, start - 1);
        //TODO 为什么用0和len不行，得l，r
        sort(nums, l, start - 1);
        sort(nums, end + 1, r);

    }

}
