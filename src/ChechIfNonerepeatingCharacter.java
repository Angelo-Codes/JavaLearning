import java.util.HashMap;

public class ChechIfNonerepeatingCharacter {
    public static void main(String[] args) {
        String s = "leetcode";
        int expectedOutput = 0;
        int output = findFirstNoneRepeatingChar(s);
        System.out.println(expectedOutput + "==" + output);

    }

    private static int findFirstNoneRepeatingChar(String s) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charCount.get(c) == 1) {
                return i;
            }
        }
        return -1;
    }
}
