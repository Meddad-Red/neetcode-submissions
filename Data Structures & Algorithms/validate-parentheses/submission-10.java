class Solution {
    public boolean isValid(String s) {
        Stack<Character> stackChar = new Stack<>();

        HashMap<Character, Character> charMap = new HashMap<>();
        charMap.put('{', '}');
        charMap.put('[', ']');
        charMap.put('(', ')');

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If c is an opening bracket
            if (charMap.containsKey(c)) {
                stackChar.push(c);
            } 
            // Else, c is a closing bracket
            else {
                if (stackChar.isEmpty()) {
                    return false;
                }

                char lastOpening = stackChar.pop();
                char expectedClosing = charMap.get(lastOpening);

                if (expectedClosing != c) {
                    return false;
                }
            }
        }

        return stackChar.isEmpty();
    }
}