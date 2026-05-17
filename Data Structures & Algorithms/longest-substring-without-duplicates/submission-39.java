class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 1) {
            return 1;
        }

        HashSet<Character> charSet = new HashSet<>();
        Queue<Character> charQueue = new LinkedList<>();

        int longestSubString = 0;
        int sizeWduplicate = 0;
        int sizeNoDuplicate = 0;
        Character removed;

        for (int i = 0; i < s.length(); i++) {
            Character currentChar = s.charAt(i);

            if (charSet.contains(currentChar)) {
                if (!charQueue.isEmpty() && charQueue.peek() == currentChar) {
                    charQueue.poll();
                    charQueue.add(currentChar);
                } else {
                    while ((removed = charQueue.poll()) != null && removed != currentChar) {
                        charSet.remove(removed);
                    }
                    if(currentChar==removed){
                        charSet.add(removed);
                        charQueue.add(removed);
                    }
                }
                sizeWduplicate = charQueue.size();
                System.out.println(sizeWduplicate);

            } else {
                charSet.add(currentChar);
                charQueue.add(currentChar);
                sizeNoDuplicate = charQueue.size();
                System.out.println(sizeNoDuplicate);
            }

            longestSubString =
                Math.max(longestSubString, Math.max(sizeWduplicate, sizeNoDuplicate));
        }

        return longestSubString;
    }
}
