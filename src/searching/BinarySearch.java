package searching;

import java.util.Arrays;

public class BinarySearch {
    static void main() {
        int[] arr = new int[10];
        int var =(int)(10 * Math.random());
        for(int j: arr){
            j = (int) (Math.random()*10/ Math.random());
            System.out.println(j);
        }
        Arrays.sort(arr);

        int start = 0;
        int end = arr.length -1;

        while(start<=end){
            int mid =(start+end)/2;
            if(arr[mid] == var){
                System.out.println(mid + "at index:  "+ mid+1);
                System.exit(0);
            }
            if(arr[mid]>var){
                end = mid -1;
            }
            else if (arr[mid]<var){
                start = mid +1;
            }
        }
        System.out.println(-1);

    }
}
