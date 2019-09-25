package Sort;

public class QiuckSort {

    public static void main(String args[]){
        int n[] = {10,2,7,5,3,9,6,21,12};
        quickSort(n, 0, n.length-1);
        for(int i=0; i<n.length; i++) {
            System.out.print(n[i]+" ");
        }
    }

    public static void quickSort(int[] a, int l, int r){
        if(l>=r) return ;
        int mid = a[l];
        int start = l+1, end = r;
        while(start<end){
            while(a[end]>=mid && start<end)
                end--;
            while(a[start]<=mid && start<end)
                start++;
            if(start<end){
                int t = a[start];
                a[start] = a[end];
                a[end] = t;
            }
        }
        a[l] = a[start];
        a[start] = mid;
        quickSort(a, l, end-1);
        quickSort(a, end+1, r);
    }

}
