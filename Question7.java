import java.util.*;
class Quesion7 {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }

        int start = 0; // Starting index of the longest palindrome substring
        int end = 0;   // Ending index of the longest palindrome substring

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);     // Odd-length palindrome
            int len2 = expandAroundCenter(s, i, i + 1); // Even-length palindrome
            int len = Math.max(len1, len2);
            if (len > end - start) {
                // Calculate new start and end indices based on the length of the palindrome
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Return the length of the palindrome
        return right - left - 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String input = sc.next();
        Quesion7 q7 = new Quesion7();
        String longestPalindrome = q7.longestPalindrome(input);
        System.out.println("Longest palindrome: " + longestPalindrome);
    }
}
