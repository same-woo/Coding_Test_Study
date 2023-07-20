import java.util.ArrayList;
import java.util.List;

class Solution {
    public String solution(String code) {
        String[] code_array = code.split("");
        String answer = "";
        int mode = 0;
        
    for (int i = 0; i < code_array.length; i++) {
        if (mode == 0) {
            if (i % 2 == 0 && !code_array[i].equals("1"))  {
                answer += code_array[i];   
            } if (mode == 0 && code_array[i].equals("1"))  {
                mode = 1;
            } else if (mode == 1 && code_array[i].equals("1"))  {
                mode = 0;
            }
            
        } else if (mode == 1) {
            if (i % 2 != 0 && !code_array[i].equals("1"))  {
                answer += code_array[i];
            } if (mode == 0 && code_array[i].equals("1"))  {
                mode = 1;
            } else if (mode == 1 && code_array[i].equals("1"))  {
                mode = 0;
            }
        }
    }
        if (answer.equals("")) {
        answer = "EMPTY";    
        }
        return answer;
    }
}