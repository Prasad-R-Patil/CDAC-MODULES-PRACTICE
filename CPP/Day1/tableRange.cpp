#include<iostream>
using namespace std;

int main()
{

    int iNo1 = 0;
    int iNo2 = 0;

    cout<<"Enter 1st Number :-  ";
    cin>>iNo1;
    cout<<"Enter 1st Number :-  ";
    cin>>iNo2;


    for(int i=iNo1; i<=iNo2; i++)
    {
        cout<<"\a\n\n================================\n";
        for(int j=1; j<=10; j++)
        {
            cout<<"\n"<<i*j<<"";
        }
    }

    return 0;
}

