
/*

*/

#include<iostream>
using namespace std;


void Pattern(int n)
{

    for(int i=1; i<=n; i++)
    {
        
       for(int j=1; j<=n; j++)
       {
           if(i>=j)
           {
            cout<<i<<" ";
           }
           else
           {
            cout<<"  ";
           }
        
        }
 
        cout<<endl;
    }

    int cnt = n-1;
    for(int i=1; i<=n; i++)
    {
        
       for(int j=1; j<=n; j++)
       {
           if(( i+j)<n+1)
           {
            cout<<cnt<<" ";
           }
           else
           {
            cout<<"  ";
           }
        
        }
        cnt--;
 
        cout<<endl;
    }

}

int main()
{
    int Value = 0;

    cout<<"Enter The Number Of Row :==>>   " ;
    cin>>Value;
    
    Pattern(Value);


    return 0;
}