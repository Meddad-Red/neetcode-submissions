class Solution {
    public boolean isAnagram(String s, String t) {
        char[] letterS1 = s.toCharArray();
        char[] letterS2 = t.toCharArray();

        Arrays.sort(letterS1);
        Arrays.sort(letterS2);

        if(letterS1.length!=letterS2.length)
            return false;
        
        for(int i=0; i<letterS1.length; i++){
            if(letterS1[i]!=(letterS2[i]))
                return false;
        }

        return true;
    }
}
