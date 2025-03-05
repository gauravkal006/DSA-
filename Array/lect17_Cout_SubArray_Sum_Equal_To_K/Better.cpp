
#include <bits/stdc++.h>
using namespace std;

class Better
{

public:
    int countSubArray(vector<int> a, int k)
    {
        int count = 0;
        int n = a.size();

        for (int i = 0; i < n; i++)
        {
            int sum = 0;
            for (int j = i; j < n; j++)
            {
                sum = sum + a[j];

                if (sum == k)
                    count++;
            }
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
