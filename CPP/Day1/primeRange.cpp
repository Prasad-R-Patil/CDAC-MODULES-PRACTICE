#include<iostream>
using namespace std;

int main()
{
    int iNo1 = 0;
    int iNo2 = 0;




    cout<<"Enter 1st Number :- ";
    cin>>iNo1;
    cout<<"Enter 2nd Number :- ";
    cin>>iNo2;

    for(int j=iNo1; j<=iNo2; j++)
    {
        if(j<2)
        {
            continue;
        }
         bool v1 = true;

         for(int i=2; i*i<=j; i++)
    {
            if((j%i)==0)
            {
                v1=0;
                break;
            }

    }
    if(v1)
    {

        cout<<j<<" ";
    }

    }






    return 0;
}
