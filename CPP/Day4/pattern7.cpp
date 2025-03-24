
/*
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1

*/

#include<iostream>
using namespace std;


void Pattern(int n)
{
    for(int i=1; i<=n; i++)
    {
        for(int j=n; j>=1; j--)
        {
            cout<<j <<" ";
            
        }

        cout<<endl;
    }

}

int main()
{
    int Value = 0;

    cout<<"Enter The Value :==>>   " ;
    cin>>Value;
    
    Pattern(Value);


    return 0;
}