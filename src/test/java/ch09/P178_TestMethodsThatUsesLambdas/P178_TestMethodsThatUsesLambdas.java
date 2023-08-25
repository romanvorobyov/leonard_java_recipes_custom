package ch09.P178_TestMethodsThatUsesLambdas;

import static ch09.P178_TestMethodsThatUsesLambdas.StringOperations.extractCharacter;
import static ch09.P178_TestMethodsThatUsesLambdas.StringOperations.firstAndLastChar;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class P178_TestMethodsThatUsesLambdas {

    @Test
    public void testFirstAndLastChar() throws Exception {

        String text = "Lambda";
        String result = firstAndLastChar.apply(text);

        assertEquals("La", result);
    }

    @Test
    public void testRndStringFromStrings() throws Exception {

        String str1 = "Some";
        String str2 = "random";
        String str3 = "text";
        
        String result1 = extractCharacter(str1);
        String result2 = extractCharacter(str2);
        String result3 = extractCharacter(str3);

        assertEquals(result1.length(), 1);
        assertEquals(result2.length(), 1);
        assertEquals(result3.length(), 1);
        
        assertTrue(str1.contains(result1));
        assertTrue(str2.contains(result2));
        assertTrue(str3.contains(result3));
    }
}
