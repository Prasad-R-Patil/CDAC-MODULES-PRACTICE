
/*
        A
      A B A
    A B C B A
  A B C D C B A
A B C D E D C B A
*/

#include<iostream>
using namespace std;


void Pattern(int n)
{

    

    for(int i=1; i<=n; i++)
    {
        char ch ='A';
       for(int j=1; j<=n; j++)
       {
           if((i+j)>=n+1)
           {
            cout<<ch<<" ";
            ch++;
            
           }
           else
           {
            cout<<"  ";
           }
        
       }
       
       ch = ch - 2;
       for(int k=1; k<=i-1; k++)
       {
           if(i>=k)
           {
            cout<<ch<<" ";
            ch--;
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