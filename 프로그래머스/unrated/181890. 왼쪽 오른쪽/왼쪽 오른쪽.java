import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < str_list.length; i++) {
            if (!str_list[i].equals("l") && !str_list[i].equals("r")) {
                list.add(str_list[i]);
            } else if (str_list[i].equals("l")) {
                return list.toArray(new String[0]);
            } else if (str_list[i].equals("r")) {
                list.clear(); // Clear the list when "r" is encountered
                for (int j = i + 1; j < str_list.length; j++) {
                    list.add(str_list[j]);  
                }
                return list.toArray(new String[0]);
            }
        }

        return new String[0];
    }
}
