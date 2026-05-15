class Solution {
    public boolean isPalindrome(String s) {
        int cursorR = s.length() - 1;

        for (int cursorL = 0; cursorL < cursorR; cursorL++) {

            if (!Character.isLetterOrDigit(s.charAt(cursorL))) {
                // Do nothing to cursorR, but don't advance cursorL next turn
                continue; 
            }
            else if (!Character.isLetterOrDigit(s.charAt(cursorR))) {
                cursorR--;
                cursorL--; // Cancel out the upcoming cursorL++ from the loop
            }
            else {
                char leftChar = Character.toLowerCase(s.charAt(cursorL));
                char rightChar = Character.toLowerCase(s.charAt(cursorR));

                if (leftChar != rightChar) {
                    return false;
                }
                cursorR--; // Move right pointer inward
            }
        }

        return true;
    }
}
