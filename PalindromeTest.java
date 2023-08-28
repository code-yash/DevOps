import static org.junit.Assert.*;
import org.junit.Test;

public class PalindromeTest {
    @Test
    public void testValidPalindromes() {
        assertTrue(PalindromeChecker.isPalindrome("racecar"));
        assertTrue(PalindromeChecker.isPalindrome("A man, a plan, a canal, Panama"));
        assertTrue(PalindromeChecker.isPalindrome("Able was I ere I saw Elba"));
        assertTrue(PalindromeChecker.isPalindrome("Mr. Owl ate my metal worm"));
        assertTrue(PalindromeChecker.isPalindrome("A Toyota's a Toyota"));
        assertTrue(PalindromeChecker.isPalindrome("Never odd or even"));
        assertTrue(PalindromeChecker.isPalindrome("Madam, in Eden, I'm Adam"));
        assertTrue(PalindromeChecker.isPalindrome("Was it a car or a cat I saw?"));
        assertTrue(PalindromeChecker.isPalindrome("Step on no pets"));
        assertTrue(PalindromeChecker.isPalindrome("Eva, can I see bees in a cave?"));
        assertTrue(PalindromeChecker.isPalindrome("Red roses run no risk, sir, on Nurse's order"));
        assertTrue(PalindromeChecker.isPalindrome("Ma is a nun, as I am"));
        assertTrue(PalindromeChecker.isPalindrome("Are we not drawn onward, we few, drawn onward to new era?"));
        assertTrue(PalindromeChecker.isPalindrome("Sir, I demand, I am a maid named Iris"));
        assertTrue(PalindromeChecker.isPalindrome("Sir, a long-nosed man, a man no gnome nogs"));
        assertTrue(PalindromeChecker.isPalindrome("Evil is a name of a foeman, as I live"));
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
