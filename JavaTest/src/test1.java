import java.util.Scanner;

public class test1 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] res = new int[a];
        res[0] = 1;
        for(int i=1; i<a; i++){
            res[i] = res[i-1] * (i+1);
        }
        System.out.print(res[a-1]%1000006);
    }
}
