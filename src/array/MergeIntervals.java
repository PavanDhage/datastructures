package array;

public class MergeIntervals {

    //Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping
    //intervals that cover all the intervals in the input.
    //
    //Example 1:
    //Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
    //Output: [[1,6],[8,10],[15,18]]
    //Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].

    //Constraints:
    //1 <= intervals.length <= 104
    //intervals[i].length == 2
    //0 <= starti <= endi <= 104

    //brute force

    static void MergeArray(){

    }

    static void main() {
        int[][] arr = {{1,3},{2,6},{8,10},{15,18}};
        for(int i=0; i<arr.length-1;i++){
            if(arr[i][1] >= arr[i+1][0]){
//                MergeArray(i,arr);
            }

        }
    }
}
