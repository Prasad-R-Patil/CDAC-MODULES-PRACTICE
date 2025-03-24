
/*
        1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
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
            if((i+j)>=n+1)
            {
                cout<<a<<" ";
                a++;
            }
            else
            {
                cout<<"  ";
             
            }
        }

        for(int k=2; k<=n; k++)
        {
            if(k<=i)
            {
                cout<<(i-k)+1<<" ";
                
            }
            else
            {
                cout<<"  ";
             
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