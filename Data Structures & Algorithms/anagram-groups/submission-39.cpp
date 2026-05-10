class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string, vector<string>> anaMap;

        for(const string& word: strs){
            array<int,26> countChar={};

            for(char c:word){
                countChar[c-'a']++;
            }

            string key = "";

            for(int freq:countChar){
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
