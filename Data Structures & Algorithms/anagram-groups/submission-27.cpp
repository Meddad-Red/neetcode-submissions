class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string, vector<string>> groupAnaMap;

        for(const string& word:strs){
            array<int,26> countChar = {};

            for(char c: word){
                countChar[c-'a']++;
            }

            string key="";

            for(int freq : countChar){
                key += "#" + to_string(freq);
            }

            groupAnaMap[key].push_back(word);
        }

        vector<vector<string>> result;

        for(const auto& pair: groupAnaMap){
            result.push_back(pair.second);
        }

        return result;


    }
};
