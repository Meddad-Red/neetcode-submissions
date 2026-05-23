class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        int[] alphabet26 = new int[26];
        int count=0;

        for(int i=0; i<s.length();i++){
            alphabet26[s.charAt(i)-'a']++;
            alphabet26[t.charAt(i)-'a']--;            
        }

        for(int i=0;i<alphabet26.length;i++){
            System.out.println(Math.abs(alphabet26[i]));
            count+=Math.abs(alphabet26[i]);
        }

        if(count==0){
            return true;
        }

        return false;
    }
}
