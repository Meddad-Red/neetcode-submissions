class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;

        while(left<right){
            int result = numbers[left]+numbers[right];

            if(result==target){
                return new int[]{left+1,right+1};
            }

            if(result<target){
                left++;
            }
            if(result>target){
                right--;
            }            
        }

        return new int[]{};
    }
}
