import java.util.Scanner;

public class CheckIfPalindrome {
    public static void main(String[] args) {
        String reverse = "";
        System.out.println("Enter the input String");
        Scanner cs = new Scanner(System.in);
        String original = cs.nextLine();

        for (int i = original.length() - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }

        if (original.equals(reverse)) {
            System.out.println("Given String is palindrome");
        } else {
            System.out.println("Given String is not palindrome");
        }
    }
}
