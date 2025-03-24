
/*
A
B B
C C C
D D D D
E E E E E
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
            cout<<char('A' + i - 1)<<" ";
            
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

    cout<<"Enter The Number Of Row :==>>   " ;
    cin>>Value;
    
    Pattern(Value);


    return 0;
}