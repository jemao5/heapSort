import java.util.Arrays;

public class heapSort {
    public static void main(String[] args){
        int[] tenArr = new int[]{9, 4, 5, 2, 8, 1, 10, 7, 3, 6};
        heapSort(tenArr);
        System.out.print(Arrays.toString(tenArr));
    }

    public static void swap(int[] a, int indx1, int indx2){
        int temp = a[indx1];
        a[indx1] = a[indx2];
        a[indx2] = temp;
    }

    public static void heapSort(int[] a){
        int l = a.length - 1;
        for(int j = l; j > 0; j--){
            for (int i = j; i > 0; i--) {
                heapify(a, (i+1)/ 2 - 1, j);
            }
            swap(a, 0, j);
        }
    }

    public static void heapify(int[] a, int root, int length){
        int l = root*2+1;
        int r = root*2+2;

        if(r<=length) {
            if (a[l] > a[r]) {
                if (a[l] > a[root]) {
                    swap(a, l, root);
                }
            } else {
                if (a[r] > a[root]) {
                    swap(a, r, root);
                }
            }
        } else {
            if (a[l] > a[root]) {
                swap(a, l, root);
            }
        }
    }


}
