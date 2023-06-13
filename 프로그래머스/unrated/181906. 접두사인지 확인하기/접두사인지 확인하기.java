class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        String[] array1 = my_string.split("");
        String[] array2 = is_prefix.split("");
        
        if (array1.length < array2.length) {
            return 0;
        }
        
        for (int i = 0; i < array2.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return 0;
            }
        }
        
        return 1;
    }
}
