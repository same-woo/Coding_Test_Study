import java.util.Arrays;

public class Solution {
    public static int[] solution(int[] arr, int[][] intervals) {
        int[] firstInterval = Arrays.copyOfRange(arr, intervals[0][0], intervals[0][1] + 1);
        int[] secondInterval = Arrays.copyOfRange(arr, intervals[1][0], intervals[1][1] + 1);

        int[] newArray = new int[firstInterval.length + secondInterval.length];
        System.arraycopy(firstInterval, 0, newArray, 0, firstInterval.length);
        System.arraycopy(secondInterval, 0, newArray, firstInterval.length, secondInterval.length);

        return newArray;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[][] intervals = {{2, 5}, {7, 9}};

        int[] result = solution(arr, intervals);
        System.out.println(Arrays.toString(result));
    }
}
