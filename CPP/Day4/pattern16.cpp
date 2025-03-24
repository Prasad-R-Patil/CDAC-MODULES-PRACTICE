
/*
1 2 3 4 5
  1 2 3 4
    1 2 3
      1 2
        1

*/

#include<iostream>
using namespace std;


void Pattern(int n)
{
    

    for(int i=1; i<=n; i++)
    {
        int a=1;
        for(int j=1; j<=n; j++)
        {
            if(i>j)
            {
                cout<<"  ";
            }
            else
            {
                cout<<a<<" ";
                a++;
            }
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