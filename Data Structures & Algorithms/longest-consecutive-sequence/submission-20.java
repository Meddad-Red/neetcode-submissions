class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> longestNumSet = new HashSet<>();

        for(int num:nums){
            longestNumSet.add(num);
        }

        int maxLen=0;

        for(int num:longestNumSet){
            int len=1;

            if(!longestNumSet.contains(num-1)){
                int curretNum=num;
                while(longestNumSet.contains(curretNum+1)){
                    len++;
                    curretNum++;
                }
            }

            maxLen = Math.max(maxLen,len);
        }

        return maxLen;
        
    }
}
