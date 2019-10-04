import java.util.ArrayList;
import java.util.Scanner;

public class wanyi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String x = sc.next();
            char[] w = new char[x.length()];
            w[0] = x.charAt(0);
            for(int j = 1; j < x.length(); j++){
                for(int k = 0; k < j; k++){
                    if(w[k] == x.charAt(j))
                }
            }
        }

    }
}
