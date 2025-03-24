
/*
1 2 3 4 5 4 3 2 1
  1 2 3 4 3 2 1
    1 2 3 2 1
      1 2 1
        1
*/

#include<iostream>
using namespace std;


void Pattern(int n)
{
    

    for(int i=1; i<=n; i++)
    {
        
        for(int j=1; j<=n; j++)
        {
            if(i<=j)
            {
                cout<<(j-i)+1<<" ";
                
            }
            else
            {
                cout<<"  ";
             
            }
        }

            int a = n-i;

        for(int k=2; k<=n; k++)
        {
            if((i+k)>n+1)
            {
                cout<<"  ";
            }
            else
            {
                cout<<a<<" ";
                a--;
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