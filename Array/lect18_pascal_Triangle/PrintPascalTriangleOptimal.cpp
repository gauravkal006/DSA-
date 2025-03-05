#include <bits/stdc++.h>
using namespace std;

vector<int> generateRows(int row)
{

    long ans = 1;
    vector<int> ansRow;
    ansRow.push_back(1);
    for (int col = 1; col < row; col++)
    {
        ans = ans * (row - col);
        ans = ans / (col);
        ansRow.push_back(ans);
    }

    return ansRow;
}
class PrintPascalTriangleOptimal
{
public:
    void printPascalTriangle(int N)
    {

        vector<vector<int>> ans;

        for (int i = 1; i <= N; i++)
        {
            ans.push_back(generateRows(i));
        }

        for (auto it : ans)
        {

            for (auto ele : it)
            {
                cout << ele << " ";
            }
            cout << endl;
        }
    }
};
main()
{
    int n = 5;
    PrintPascalTriangleOptimal p;
    p.printPascalTriangle(n);
}
