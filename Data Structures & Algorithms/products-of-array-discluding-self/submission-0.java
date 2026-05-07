class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] output = new int[len];
        // Initial condition value for the product to occur
        Arrays.fill(output,1);

        int leftProd=1, rightProd=1;
        int leftCursor = 0;
        
        for(int i=0;i<len;i++){
            int rightCursor = (len-1) - i;
            output[i]*=leftProd;
            leftProd*=nums[i];

            output[rightCursor]*=rightProd;
            rightProd*=nums[rightCursor];
        }
        return output;        

    }
}  
