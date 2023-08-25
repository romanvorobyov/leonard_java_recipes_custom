package ch01.P16_CheckStringContainsSubstring;

import java.util.regex.Pattern;

public final class P16_CheckStringContainsSubstring {

    private P16_CheckStringContainsSubstring() {
        throw new AssertionError("Cannot be instantiated");
    }
        
    public static boolean containsV1(String text, String subtext) {

        if (text == null || subtext == null 
                || text.isBlank() || subtext.isBlank()) {
            // or throw IllegalArgumentException            
            return false;
        }

        return text.matches("(?i).*" + Pattern.quote(subtext) + ".*");
    }

    public static boolean containsV2(String text, String subtext) {

        if (text == null || subtext == null 
                || text.isBlank() || subtext.isBlank()) {
            // or throw IllegalArgumentException            
            return false;
        }

        return text.indexOf(subtext) != -1; // or lastIndexOf()
    }
}
