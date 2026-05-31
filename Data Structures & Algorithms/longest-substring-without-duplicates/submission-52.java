class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        if (s.length() == 1) {
            return 1;
        }

        Set<Character> charSet = new HashSet<>();
        int count = 1;
        int left=0;

        for(int i=0; i<s.length();i++){
            if(charSet.contains(s.charAt(i))){
                while(charSet.contains(s.charAt(i))){
                    charSet.remove(s.charAt(left));
                    left++;
                }
                charSet.add(s.charAt(left-1));
            }
            Character current = s.charAt(i);
            charSet.add(current);

            count = Math.max(count, charSet.size());         


        }

        return count;
    }
}
