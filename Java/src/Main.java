import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] intervals ={{1,4},{0,2},{3,5}};
            int len = intervals.length;
            if(len<2) System.out.println(intervals);

            Arrays.sort(intervals, (a1, a2)->a1[0]-a2[0]);
            ArrayList<int[]> res = new ArrayList<>();
            res.add(intervals[0]);

            for(int i=1; i<len; i++){
                int[] tmp = res.get(res.size()-1);

                if(tmp[1]>=intervals[i][0]){
                    tmp[1] = Math.max(intervals[i][1], tmp[1]);
                }
                else{
                    //if(res.isEmpty()) res.add(intervals[0]);
                    res.add(intervals[i]);
                }
            }
        System.out.print(res.toArray(new int[res.size()][2]));

    }
}
