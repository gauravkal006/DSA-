
#include <bits/stdc++.h>
using namespace std;

class BruteForce
{

public:
    int countSubArray(vector<int> a, int k)
    {
        int count = 0;
        int n = a.size();

        for (int i = 0; i < n; i++)
        {
            for (int j = i; j < n; j++)
            {
                int sum = 0;
                for (int K = i; K <= j; K++)
                    sum = sum + a[K];

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
    BruteForce a;
    int ans = a.countSubArray(arr, 3);
    cout << ans << endl;
}
