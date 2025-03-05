
#include <bits/stdc++.h>
using namespace std;

class Better
{

public:
    int countSubArray(vector<int> a, int k)
    {
        int count = 0;
        int n = a.size();
        map <int,int> mpp;
        mpp[0]=1;
        int preSum=0;
        
        for (int i = 0; i < n; i++)
        {
            preSum += a[i];
            int remove = preSum-k;
            count +=  mpp[remove];
            mpp[preSum] +=1;

        }

        return count;
    }
};

main()
{

    vector<int> arr = {1, 2, 3, -3, 1, 1, 1, 4, 2, -3};
    Better a;
    int ans = a.countSubArray(arr, 3);
    cout << ans << endl;
}
