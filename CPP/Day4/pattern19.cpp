
/*
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
*/

#include<iostream>
using namespace std;


void Pattern(int n)
{
    

    for(int i=1; i<=n; i++)
    {
        
       for(int j=1; j<=n; j++)
       {
           if((i+j)>=n+1)
           {
            cout<<"* ";
           }
           else
           {
            cout<<"  ";
           }
       }

       for(int k=2; k<=n; k++)
       {
          if(i<k)
          {
            cout<<"  ";
          }
          else
          {
            cout<<"* ";
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