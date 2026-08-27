class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> serieSet = new HashSet<>();

        for(int num:nums){
            serieSet.add(num);
        }

        int len=0;
        int maxLen=0;

        Iterator<Integer> iterator = serieSet.iterator();

        for(int num:serieSet){
            if(!serieSet.contains(num-1)){
                int currentNum = num;
                while(serieSet.contains(currentNum)){
                    len++;
                    currentNum++;
                }
            }
            
            maxLen=Math.max(len,maxLen);
            len=0;
        }

        return maxLen;
    }
}
