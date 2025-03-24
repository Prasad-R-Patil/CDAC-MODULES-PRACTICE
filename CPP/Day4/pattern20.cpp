
/*
1
2 3
4 5 6
7 8 9 10
*/

#include<iostream>
using namespace std;


void Pattern(int n)
{
    int cnt =1;
    

    for(int i=1; i<=n; i++)
    {
        
       for(int j=1; j<=n; j++)
       {
           if(i>=j)
           {
            cout<<cnt<<" ";
            cnt++;
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