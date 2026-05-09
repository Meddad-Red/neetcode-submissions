class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        std::unordered_map<string,vector<string>> anaGroup;

        for(const string& word:strs){
            std::array<int,26> countChar = {};

            for(char c:word){
                countChar[c-'a']++;
            }

            string key = "";

            for(int freq:countChar){
                key += '#' + to_string(freq);
            }

            anaGroup[key].push_back(word);
        }

        vector<vector<string>> result;

        for(const auto& pair: anaGroup){
            result.push_back(pair.second);
        }

        return result;
    }
};
