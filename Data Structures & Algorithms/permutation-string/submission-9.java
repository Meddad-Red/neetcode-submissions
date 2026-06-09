class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int s1Size = s1.length();
        int s2Size = s2.length();

        if(s1Size>s2Size){
            return false;
        }
        if(s1.equals(s2)){
            return true;
        }

        int[] alphabetS1 = new int[26];
        int[] alphabetS2 = new int[26];

        for(int i=0; i<s1Size; i++){
            alphabetS1[s1.charAt(i)-'a']++;
        }
        for(int i=0; i<s1Size; i++){
            alphabetS2[s2.charAt(i)-'a']++;
        }

        if(Arrays.equals(alphabetS1,alphabetS2)){
            return true;
        }              

        for(int right=s1Size; right<s2Size;right++){
            alphabetS2[s2.charAt(right)-'a']++;

            int left = right-s1Size;
            alphabetS2[s2.charAt(left)-'a']--;

            if(Arrays.equals(alphabetS1,alphabetS2)){
                return true;
            }
            
        }

        return false;
    }
}
