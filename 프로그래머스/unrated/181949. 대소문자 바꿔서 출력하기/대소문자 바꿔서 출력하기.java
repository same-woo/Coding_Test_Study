import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        String[] array = a.split("");
        String answer = "";
        
        for (int i = 0; i < array.length; i++) {
            if (Character.isUpperCase(array[i].charAt(0))) {
                answer += array[i].toLowerCase();
            } else {
                answer += array[i].toUpperCase();
            }
        }
        
        System.out.println(answer);
    }
}
