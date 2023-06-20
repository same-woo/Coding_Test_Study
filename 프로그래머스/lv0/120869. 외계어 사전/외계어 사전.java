import java.util.HashSet;

class Solution {
    public int solution(String[] spell, String[] dic) {
        HashSet<Character> spellSet = new HashSet<>();
        
        // spell 배열에 있는 알파벳을 HashSet에 추가
        for (String s : spell) {
            for (char c : s.toCharArray()) {
                spellSet.add(c);
            }
        }
        
        // dic 배열에서 단어를 하나씩 확인하여 spellSet에 있는 알파벳을 모두 포함하는지 검사
        for (String word : dic) {
            HashSet<Character> wordSet = new HashSet<>();
            for (char c : word.toCharArray()) {
                wordSet.add(c);
            }
            
            if (wordSet.containsAll(spellSet)) {
                return 1;
            }
        }
        
        return 2;
    }
}
