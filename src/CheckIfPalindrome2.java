public class CheckIfPalindrome2 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean actualOutput = isPalindrome(s);
        System.out.println(actualOutput);
    }

    private static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-z]", "").toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
