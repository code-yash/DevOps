import static org.junit.Assert.*;
import org.junit.Test;

public class PalindromeTest {
    @Test
    public void testValidPalindrome() {
        assertTrue(PalindromeChecker.isPalindrome("madam"));
        assertTrue(PalindromeChecker.isPalindrome("A man, a plan, a canal, Panama!"));
        assertTrue(PalindromeChecker.isPalindrome("12321"));
        assertTrue(PalindromeChecker.isPalindrome("racecar"));
    }

    @Test
    public void testNonPalindrome() {
        assertFalse(PalindromeChecker.isPalindrome("hello"));
        assertFalse(PalindromeChecker.isPalindrome("world"));
        assertFalse(PalindromeChecker.isPalindrome("12345"));
    }
}
