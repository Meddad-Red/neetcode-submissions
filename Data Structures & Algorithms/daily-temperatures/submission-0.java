class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int tempSize = temperatures.length;
        int[] tempResult = new int[tempSize];

        Deque<Integer> tempStack = new ArrayDeque<>();     
               
        for(int i=tempSize-1;i>=0;i--){
            while(!tempStack.isEmpty() && temperatures[tempStack.peek()]<=temperatures[i]){
                tempStack.pop();
            }

            if(!tempStack.isEmpty()){
                tempResult[i] = tempStack.peek()-i;
            }

            tempStack.push(i);

        }

        return tempResult;
    }
}
