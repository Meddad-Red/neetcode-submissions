class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freqMap = new HashMap<>();

        for(int num:nums){
            freqMap.put(num, freqMap.getOrDefault(num,0)+1);
        }

        List<List<Integer>> freqBucket = new ArrayList<>();

        for(Map.Entry<Integer,Integer> entry : freqMap.entrySet()){
            int numKey = entry.getKey();
            int freqValue = entry.getValue();
            while(freqBucket.size()<= freqValue){
                freqBucket.add(new ArrayList<>());
            }
            freqBucket.get(freqValue).add(numKey);
        }
        int kIndex = 0;
        int[] resultArr = new int[k];

        for(int i=freqBucket.size()-1; i>=0 && kIndex < k;i--){
            if(i<freqBucket.size() && !freqBucket.get(i).isEmpty()){
                for(int num : freqBucket.get(i)){
                    resultArr[kIndex] = num;

                    if(kIndex==k){
                        break;
                    }
                    kIndex++;
                }
            }
        }

        return resultArr;


    }
}
