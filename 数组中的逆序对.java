class Solution {
private:
    const int kmod = 1000000007;
public:
    int InversePairs(vector<int> data) {
        int ret = 0;
        int n = data.size();
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (data[i] > data[j]) {
                    ret += 1;
                    ret %= kmod;
                }
            }
        }

        return ret;
    }
};
