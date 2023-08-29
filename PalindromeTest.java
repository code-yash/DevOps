import static org.junit.Assert.*;
import org.junit.Test;

public class PalindromeTest {
    @Test
    public void testValidPalindromes() {
        assertTrue(PalindromeChecker.isPalindrome("racecar"));
        assertTrue(PalindromeChecker.isPalindrome("rotor"));
        assertTrue(PalindromeChecker.isPalindrome("deified"));
        assertTrue(PalindromeChecker.isPalindrome("madam"));
        assertTrue(PalindromeChecker.isPalindrome("level"));
        assertTrue(PalindromeChecker.isPalindrome("civic"));
        assertTrue(PalindromeChecker.isPalindrome("noon"));
    }

    @Test
    public void testInvalidPalindromes() {
       assertFalse(PalindromeChecker.isPalindrome("hello"));
        assertFalse(PalindromeChecker.isPalindrome("world"));
        assertFalse(PalindromeChecker.isPalindrome("apple"));
        assertFalse(PalindromeChecker.isPalindrome("banana"));
        assertFalse(PalindromeChecker.isPalindrome("java"));
        assertFalse(PalindromeChecker.isPalindrome("programming"));
        assertFalse(PalindromeChecker.isPalindrome("computer"));
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
