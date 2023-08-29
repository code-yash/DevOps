public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
         // Remove spaces and punctuation, and convert to lowercase
        // String cleanedStr = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        
        int left = 0;
        int right = cleanedStr.length() - 1;
        
        while (left < right) {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
