class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        int[] sAlphabet26 = new int[26];
        int[] tAlphabet26 = new int[26];

        for(int i=0; i<s.length(); i++){
            sAlphabet26[s.charAt(i)-'a']++;
            sAlphabet26[t.charAt(i)-'a']--;
        }

        return Arrays.stream(sAlphabet26).allMatch(x -> x ==0);
    }
}
