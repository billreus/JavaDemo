import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @Author liu
 * @Date 2019/9/21 15:50
 */
public class tt {
    public static int count = 0;
    public static void kSum(List<Integer> numbers, int target){
        int index = 0, re = 0;
        int[] num = new int[numbers.size()];
        for(int i=0; i<numbers.size(); i++){
            num[i] = numbers.get(i);
        }
        Arrays.sort(num);
        for(int i=0; i<num.length; i++){
            target -= num[i];
            if(target>0){
                index = i;

            }
            if(target == 0){
                count ++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String source = sc.nextLine();
        String[] str = source.split(",");
        List<Integer> in = new ArrayList<Integer>();
        for(int i=0; i<str.length; i++){
            in.add(Integer.parseInt(str[i]));
        }
        int target = Integer.parseInt(sc.nextLine());
        kSum(in, target);
        System.out.println(count);
    }
}
