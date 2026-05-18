class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int flagCount = s1.length();

        int[] alphabet26 = new int[26];

        for (int c = 0; c < flagCount; c++) {
            alphabet26[s1.charAt(c) - 'a']++;
        }

        int index = 0;

        for (int c = 0; c < s2.length(); c++) {            
            int[] tempAlphabet = alphabet26.clone();
            int count = 0;
            index = c;
           
            while (index < s2.length() && tempAlphabet[s2.charAt(index) - 'a'] > 0) {
                tempAlphabet[s2.charAt(index) - 'a']--;
                count++;

                if (count == flagCount) {
                    return true;
                }

                index++;
            }
        }

        return false;
    }
}
