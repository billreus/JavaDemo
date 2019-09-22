import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author liu
 * @Date 2019/9/21 14:51
 */
public class ttt1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String source = in.next();
        String[] strings = source.split(",");
        int[] nums = new int[strings.length];
        boolean res = false;
        for(int i=0; i<strings.length; i++){
            nums[i] = Integer.parseInt(strings[i]);
        }
        Arrays.sort(nums);
        for(int i=1; i<strings.length; i++){
            if(nums[i-1] == nums[i]){
                res = true;
            }
        }
        if(res){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }

}
