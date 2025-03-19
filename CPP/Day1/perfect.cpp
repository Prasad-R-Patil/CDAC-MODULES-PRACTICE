#include<iostream>
using namespace std;

int main()
{
    int iNo = 0;
    int sum = 0;


    cout<<"Enter The Number For Check Perfect or Not :-  ";
    cin>>iNo;
    int temp = iNo;

    for(int i=1; i<=iNo/2; i++)
    {
        if((iNo%i)==0)
        {
            sum = sum+i;
        }
    }

    if(temp==sum)
    {
        cout<<"It is a Perfect Number "<<temp<<"";
    }
    else
    {
        cout<<"It is Not Perfect Number "<<temp<<"";
    }


    return 0;
}
