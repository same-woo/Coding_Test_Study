import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                int count = arr[i] * 2;
                for (int j = 0; j < count; j++) {
                    list.add(arr[i]);
                }
            } else {
                int count = Math.min(arr[i], list.size());
                for (int j = 0; j < count; j++) {
                    list.remove(list.size() - 1);
                }
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
