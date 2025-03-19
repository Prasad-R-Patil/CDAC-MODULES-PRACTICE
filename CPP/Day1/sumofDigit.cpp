#include<iostream>
using namespace std;

int main()
{
    int iNo = 0;
    int sum = 0;

    cout<<"Enter The Number...  :-   ";
    cin>>iNo;

    while(iNo!=0)
    {
        int rem = iNo % 10;
        sum = sum + rem;
        iNo = iNo / 10;

    }

    cout<<"Sum of Digit is ==>>  "<<sum<<"";

    return 0;
}
