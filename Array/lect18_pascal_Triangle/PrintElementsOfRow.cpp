#include<iostream>
#include<stdio.h>
using namespace std;
class PrintElementsOfRow
{
private:
    /* data */
public:
    void PrintNRow(int n){

        int ans =1;
        printf("%d ",ans);
        for(int i=1;i<n;i++)
        {
            ans = ans * (n-i);
            ans = ans / (i);
            printf("%d ",ans);
        }
    }
};



int main()
{
    int n=6;

    PrintElementsOfRow p;

    p.PrintNRow(n);
}
