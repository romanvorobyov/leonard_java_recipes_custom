package ch01.P08_RemoveWhitespacesFromString;

public final class P08_RemoveWhitespacesFromString {

    private P08_RemoveWhitespacesFromString() {
        throw new AssertionError("Cannot be instantiated");
    }

    public static String removeWhitespaces(String str) {

        if (str == null || str.isEmpty()) {
            // or throw IllegalArgumentException
            return "";
        }

        return str.replaceAll("\\s", "");
    }

}
