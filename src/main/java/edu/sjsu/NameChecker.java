package edu.sjsu;

public class NameChecker {
    /**
     * Checks if a given string is a valid name following these rules:
     * - Between 2 to 40 characters
     * - Contains only alphabetic characters, non-consecutive hyphens, or a single quote
     * - Cannot start with a hyphen or single quote
     * 
     * @param input Name to check
     * @return True if input is a valid name, else false
     */
    public static boolean check(String input) {
        // TODO: implement

        // Check if the input is between 2 to 40 characters
        if (input.length() < 2 || input.length() > 40) {
            return false;
        }

        // Check if the input contains only alphabetic characters, non-consecutive hyphens, or a single quote
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (!Character.isLetter(c) && c != '-' && c != '\'') {
                return false;
            }

            if (c == '-' || c == '\'') {
                if (i == 0 || i == input.length() - 1) {
                    return false;
                }

                if (input.charAt(i - 1) == '-' || input.charAt(i - 1) == '\'') {
                    return false;
                }
            }
        }

        return true;
    }
}
