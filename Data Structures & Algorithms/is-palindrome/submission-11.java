class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0){
            return true;
        }

        String trimmedS = s.replaceAll("[^a-zA-Z0-9]","");
        String lowerOnly = trimmedS.toLowerCase();

        int left=0;
        int right=trimmedS.length()-1;

        while(left<right){
            if(lowerOnly.charAt(left)!=lowerOnly.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
