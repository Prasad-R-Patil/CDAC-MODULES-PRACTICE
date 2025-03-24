
/*
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1

*/

#include<iostream>
using namespace std;


void Pattern(int n)
{
    

    for(int i=n; i>=1; i--)
    {
        
        for(int j=i; j>=1; j--)
        {
            cout<<j<<" ";
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