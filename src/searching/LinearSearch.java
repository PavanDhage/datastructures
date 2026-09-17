package searching;

public class LinearSearch {
    static void main() {


        int[] arr;
        arr = new int[]{2, 34, 12, 43};
        for (int j : arr) System.out.println(j);

        int var = 3;
        boolean found = false;
        for(int j:arr) {
            if(j == var) {
                found = true;
                System.out.println(j);
            }
        }
        if(!found){
            System.out.println(-1);
        }
    }
}
