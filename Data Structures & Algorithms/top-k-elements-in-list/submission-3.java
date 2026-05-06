class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        int numberValue;
        for(int num: nums){
            numberValue = num;
            freqMap.put(numberValue,(freqMap.getOrDefault(numberValue,0)+1));            
        }

        // We fix the ArrayList for the bucket to only be inside the 'k' frame.
        List<Integer>[] kBucket = new ArrayList[nums.length+1];
        for(int i=0; i<kBucket.length; i++){
            //init each case
            kBucket[i] = new ArrayList<>();     
        }

        for(int num: freqMap.keySet()){
            int freqByValue = freqMap.get(num);
            kBucket[freqByValue].add(num);
        }

        int[] kFreqArray = new int[k];        
        int index=0;

        for(int i=kBucket.length-1; i>=0; i--){
            for(int num: kBucket[i]){
                kFreqArray[index] = num;
                index++;

                if(index==k){
                    return kFreqArray;
                }
            }
        }

        return kFreqArray;
    }
}
