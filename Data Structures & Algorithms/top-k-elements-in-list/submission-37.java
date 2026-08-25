class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numFreqMap = new HashMap<>();

        for (int num : nums) {
            numFreqMap.put(num, numFreqMap.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] freqBucket = (ArrayList<Integer>[]) new ArrayList[nums.length + 1];

        for (Map.Entry<Integer, Integer> entry : numFreqMap.entrySet()) {
            int number = entry.getKey();
            int frequency = entry.getValue();

            if (freqBucket[frequency] == null) {
                freqBucket[frequency] = new ArrayList<>();
            }

            freqBucket[frequency].add(number);
        }

        int[] resultTopFreqNumberArr = new int[k];
        int resultIndex = 0;

        for (int i = freqBucket.length - 1; i >= 0 && resultIndex < k; i--) {
            if (freqBucket[i] != null) {
                for (int num : freqBucket[i]) {
                    resultTopFreqNumberArr[resultIndex] = num;
                    resultIndex++;

                    if (resultIndex == k) {
                        break;
                    }
                }
            }
        }

        return resultTopFreqNumberArr;
    }
}