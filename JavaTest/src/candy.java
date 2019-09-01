import java.util.Scanner;
public class candy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int k = in.nextInt();//children
            int time = 1;
            n = n+1;
            for(int i=0; i<k-1; i++) {
                time *= n;
                n--;
                System.out.println(time);
            }
            int index = 0;
            for(int i=0; i<time; i++){

                int ch = k-1;
                for(int j=0; j<n; j++){
                    if(index==j )
                        System.out.print("|");
                    System.out.print("*");
                    if(index==3&& j == 2)System.out.print("|");
                }
                index++;
                System.out.println();
            }

        }


    }
}

