class Solution {
public:
    vector<int> topKFrequent(const vector<int>& nums, int k) {
        unordered_map<int,int> freqMap;

        for(int num:nums){
            freqMap[num]++;
        }

        vector<vector<int>> buckets(nums.size()+1);

        for(const auto& pair: freqMap){
            int num = pair.first;
            int freq=pair.second;

            buckets[freq].push_back(num);
        }

        vector<int> result;

        for (int freq=buckets.size()-1; freq>=0;freq--){
            for(int num:buckets[freq]){
                result.push_back(num);

                if(result.size()==k){
                    return result;
                }
            }
        }
        return result;
    }    
};
