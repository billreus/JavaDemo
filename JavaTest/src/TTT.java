import java.io.*;
import java.util.*;
public class TTT{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int num = 0;
        while(a>0){
            num *= a;
            a--;
        }
        System.out.print(num);
    }
}