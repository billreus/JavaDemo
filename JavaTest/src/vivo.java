import java.io.*;

/**
 * Welcome to vivo !
 */
public class vivo {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        int input[] = parseInts(inputStr.split(" "));
        int output = solution(input);
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

    private static int solution(int[] input) {
        int[] result = new int[1000];
        for(int i = 0; i< input.length; i++){
            for(int j = 1; j <= input[i]; j++){
                if(result[i+j] == 0){
                    result[i+j] = result[i] + 1;
                } else{
                    result[i+j] = Math.min(result[i+j], result[i]+1);
                }
            }
        }
        return result[input.length-1];
    }
}
