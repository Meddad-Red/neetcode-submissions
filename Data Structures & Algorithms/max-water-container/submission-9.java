class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right = heights.length-1;    

        int maxArea=0;
        int limitHeight=0;    

        while(left<right){
            limitHeight = Math.min(heights[left],heights[right]);
            
            int area = limitHeight * (right-left);
            maxArea = Math.max(maxArea,area);

            if(heights[left]<heights[right]){
                left++;
            } else if(heights[left]>heights[right]){
                right--;
            } else{
                left++;
            }
        }

        return maxArea;
    }
}
