class Solution {
    public boolean isPalindrome(String s) {        
        String cleanStr = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        int strSize = cleanStr.length();
        int right=strSize-1;
        int left=0;

        while(left<right){
            char leftChar = cleanStr.charAt(left);
            char rightChar = cleanStr.charAt(right);

            if(leftChar!=rightChar){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
