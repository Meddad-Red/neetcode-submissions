class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string,vector<string>> anaMap;

        for(const string& word:strs){
            array<int,26> count ={};

            for(char c:word){
                count[c-'a']++;
            }

            string key = "";

            for(int freq:count){
                key += "#" + to_string(freq);
            }

            anaMap[key].push_back(word);
        }

        vector<vector<string>> result;

        for(const auto& pair:anaMap){
            result.push_back(pair.second);
        }

        return result;
    }
};
