
/*
    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1
*/

#include<iostream>
using namespace std;


void Pattern(int n)
{
    
    for (int i = 0; i < n; i++) 
    {
        // Print spaces
        for (int space = 0; space < n - i - 1; space++) 
        {
            cout << " ";
        }

        int coeff = 1; // First element is always 1
        for (int j = 0; j <= i; j++) 
        {
            cout << coeff << " ";
            coeff = coeff * (i - j) / (j + 1); // Compute next coefficient efficiently
        }
        cout << endl;
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