class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        std::unordered_map<int,int> indexSum;

        for(int i=0;i<nums.size();i++){
            int complement = target - nums[i];

            if(indexSum.count(complement)){
                return {indexSum[complement],i};
            }

            indexSum[nums[i]] = i;
        }
    }
};
