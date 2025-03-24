
/*
A B C D E D C B A
  B C D E D C B
    C D E D C
      D E D
        E
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
           if(i<=j)
           {
            cout<<char(ch+j-1)<<" ";
            
            
           }
           else
           {
            cout<<"  ";
           }
        
       }
       
       

       for(int k=1; k<=n; k++)
       {
           if((i+k)<n+1)
           {
            cout<<char(ch+(n-2))<<" ";
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