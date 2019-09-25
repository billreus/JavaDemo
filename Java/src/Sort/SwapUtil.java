package Sort;

/**
 * @Author liu
 * @Date 2019/9/25 14:44
 */
public class SwapUtil {
    public static int[] swap(int[] arrays, int a, int b){
        int tmp = arrays[a];
        arrays[a] = arrays[b];
        arrays[b] = tmp;
        return arrays;
    }
}
