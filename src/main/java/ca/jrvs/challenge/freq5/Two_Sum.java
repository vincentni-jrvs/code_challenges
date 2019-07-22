package ca.jrvs.challenge.freq5;

public class Two_Sum {
    /**
     * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
     *
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * Problem solved in C++
     */
    /*
    public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> umap;
        vector<int> result;
        for(int i = 0; i < nums.size(); i++)
        {
            if(umap.count(target - nums[i]) != 0)
            {
                result.push_back(umap.find(target - nums[i])->second);
                result.push_back(i);
                break;
            }
            umap[nums[i]] = i;
        }
        return result;
    }
    */
}
