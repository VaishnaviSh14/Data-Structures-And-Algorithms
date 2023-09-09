public class PalindromeString {
    public static void printReverse(String str, int index) {
        if (index == 0) {
            System.out.println(str.charAt(index));
            return;
        }
        System.out.println(str.charAt(index));
        printReverse(str, index - 1);
    }

    public static boolean isPalindrome(String str, int left, int right) {
        if (left >= right) {
            return true;
        }

        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }

        return isPalindrome(str, left + 1, right - 1);
    }

    public static void main(String[] args) {
        String str = "ABCD";
        printReverse(str, str.length() - 1);

        if (isPalindrome(str, 0, str.length() - 1)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}

