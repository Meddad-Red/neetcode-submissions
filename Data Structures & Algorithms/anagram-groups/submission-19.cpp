class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        std::unordered_map<string, vector<string>> anaMap;

        for(string word: strs){
            array<int,26> count = {0};

            for (char c: word){
                count[c-'a']++;
            }

            string key = "";

            for(int freq:count){
                key += "#" + to_string(freq);
            }

            anaMap[key].push_back(word);
        }

        vector<vector<string>> result;

        for(const auto& pair: anaMap){
            result.push_back(pair.second);
        }

        return result;
    }
};
