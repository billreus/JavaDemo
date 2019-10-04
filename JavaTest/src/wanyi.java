import java.util.ArrayList;
import java.util.Scanner;

public class wanyi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x, y;
        ArrayList<int[]> sol = new ArrayList<>();
        for(int i = 0; i < n; i++){
            x = sc.nextInt();
            y = sc.nextInt();
            int yy = y;
            int[] res = new int[10];
            mark(res, x);
            mark(res, y);
            while (y > 0){
                int tmp = y % 10;
                mark(res, tmp * x);
                y /= 10;
            }
            mark(res, x * yy);
            sol.add(res);
        }
        int a = 0;
        int[] end = new int[10];
        while (a < sol.size()){
            int[] s = sol.get(a);
            for(int j = 1 ; j < 10; j++){
                System.out.print(s[j] + " ");
                end[j] += s[j];
            }
            System.out.println("");
            a++;
        }
        int max = 0;
        int index = 0;
        for(int j = 1 ; j < 10; j++){
            if(end[j] > max){
                max = end[j];
                index = j;
            }
            if(j == 9){
                System.out.println(index);
            }
        }

    }
    public static void mark(int[] res, int a){
        while (a > 0){
            int ma = a % 10;
            res[ma]++;
            a /= 10;
        }
    }
}