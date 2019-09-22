import java.util.Scanner;

public class Main1 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int num = 1;
        while(a>0){
            num *= a;
            a--;
        }
        while(true){
            int tmp = num % 10;
            if(tmp != 0){

                System.out.print(tmp);
                break;
            }
            num /= 10;
        }
    }
}
