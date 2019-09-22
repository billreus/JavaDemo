import java.io.*;
import java.util.Arrays;

/**
 * Welcome to vivo !
 */

public class baoshu {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        int input[] = parseInts(inputStr.split(" "));
        String output = solution(input);
        System.out.println(output);
    }

    private static int[] parseInts(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return new int[0];
        }
        int[] intArr = new int[strArr.length];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        return intArr;
    }

    private static String solution(int[] input) {

        int len = input[0];
        int num = input[1];

        boolean[] state = new boolean[len+1];
        for(int i = 1; i<=len; i++){
            state[i] = true;
        }
        int index = 1;
        int count = 0;
        int n = len;

        int[] res = new int[n-1];
        int resIndex = 0;
        while (n > 0){
            if(state[index] == true){
                index++;
                count++;
            }else{
                index++;
            }
            if(count == num - 1){
                count = 0;
                state[index] = false;
                n--;
                res[resIndex] = index;
                resIndex++;
            }
            if(index == len){
                index = 1;
            }
        }

        return Arrays.toString(res);
    }

}
