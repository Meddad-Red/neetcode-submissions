class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        std::unordered_map<string, vector<string>> groups;

        for(string word : strs){
            array<int,26> count = {};

            for(char c: word){
                count[c-'a']++;
            }    

            string key = "";
            for(int freq: count){
                key += "#" + to_string(freq);
            }

            groups[key].push_back(word);
        }

        vector<vector<string>> result;

        for(auto pair: groups){
            result.push_back(pair.second);
        }

        return result;
    }
};
