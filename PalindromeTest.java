import static org.junit.Assert.*;
import org.junit.Test;

public class PalindromeTest {
    @Test
    public void testValidPalindromes() {
        assertTrue(PalindromeChecker.isPalindrome("racecar"));
    }

    @Test
    public void testInvalidPalindromes() {
        assertFalse(PalindromeChecker.isPalindrome("hello"));
        assertFalse(PalindromeChecker.isPalindrome("world"));
        assertFalse(PalindromeChecker.isPalindrome("12345"));
        assertFalse(PalindromeChecker.isPalindrome("PalindromeChecker"));
        assertFalse(PalindromeChecker.isPalindrome("Jenkins pipeline"));
    }

    @Test
    public void testEmptyString() {
        assertTrue(PalindromeChecker.isPalindrome(""));
    }

    @Test
    public void testSingleCharacter() {
        assertTrue(PalindromeChecker.isPalindrome("a"));
    }
}
