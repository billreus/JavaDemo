import java.util.Scanner;

public class digui {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int res = sum(a);
        System.out.print(res);
    }
    public static int sum(int x){
        if(x <= 1){
            return 1;
        }
        if(x == 2){
            return 2;
        }
        return x * sum(x-1);
    }
}
