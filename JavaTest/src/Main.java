import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x;
        int[][] seq = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                seq[i][j] = sc.nextInt();
                //ans += x;
            }
        }
        int m = sc.nextInt();
        if(n == 1)
            System.out.println(seq[0][0]);
        if(m % 4 == 0){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.print(seq[i][j]+" ");
                }
                System.out.println();
            }
        }
        if(m%4 == 1){
            f(seq, n);
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.print(seq[i][j]+" ");
                }
                System.out.println();
            }
        }
        if(m%4 == 2){
            f(seq, n);
            f(seq, n);
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.print(seq[i][j]+" ");
                }
                System.out.println();
            }
        }
        if(m%4 == 3){
            f(seq, n);
            f(seq, n);
            f(seq, n);
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.print(seq[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void f(int[][] mat, int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i; j++){
                int tmp = mat[i][j];
                mat[i][j] = mat[n - 1 - j][n-1-i];
                mat[n-1-j][n-1-i] = tmp;
            }
        }
        for(int i=0; i<n/2; i++){
            for(int j=0; j<n; j++){
                int tmp = mat[i][j];
                mat[i][j] = mat[n-1-i][j];
                mat[n-1-i][j] = tmp;
            }
        }
    }
}
