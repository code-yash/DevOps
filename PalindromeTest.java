import static org.junit.Assert.*;
import org.junit.Test;

public class PalindromeTest {
    @Test
    public void testValidPalindromes() {
        assertTrue(PalindromeChecker.isPalindrome("racecar"));
        assertTrue(PalindromeChecker.isPalindrome("rotor"));
        assertTrue(PalindromeChecker.isPalindrome("madam"));
    }

    @Test
    public void testInvalidPalindromes() {
       assertFalse(PalindromeChecker.isPalindrome("hello"));
        assertFalse(PalindromeChecker.isPalindrome("world"));
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
