#include<iostream>
using namespace std;

int main()
{
    int iNo = 0;

    bool v1 = false;

    cout<<"Enter The Number To Check Prime or Not :- ";
    cin>>iNo;


    for(int i=2; i<=iNo/2; i++)
    {
        if((iNo%2)==0)
        {
            v1 = 1;
        }

    }

    if(v1==1)
    {
        cout<<iNo<<" => it is not prime...";
    }
    else
    {
        cout<<iNo<<" => it is Prime...";
    }

    return 0;
}
