package JavaQuestions.palindrome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeVerifierTest {

    @Test
    void isPalindrome_Palindrome_True(){

        //give
        final var str ="1Red rum, sir, is murder1";
        //when
        final var result = PalindromeVerifier.isPalindrome(str);
        //then
        assertTrue(result);


    }


    @Test
    void isPalindrome_NotPalindrome_False(){

        //give
        final var str = "apple";
        //when
        final var result = PalindromeVerifier.isPalindrome(str);
        //then
        assertFalse(result);


    }


    @Test
    void simplifyString() {
        //given
        final var str ="1Red rum, sir, is murder1";
        //when
        final var result = PalindromeVerifier.simplifyString(str);
        //then
        Assertions.assertEquals("1redrumsirismurder1",result);


    }
}