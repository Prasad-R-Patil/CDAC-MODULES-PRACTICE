#include<fstream>
#include<iostream>
#include<sstream>
using namespace std;
int main()
{
	string ch;
	ifstream f1;
	ofstream f2;
	int sum = 0; // For summing up numbers
    string characters = ""; // To store non-numeric characters
    string num = ""; // Temporary string to store digits
	int uppercnt = 0, digitcnt = 0,lowercnt=0;
	
	f1.open("king.txt");
	
	
	
	
	
	
	
    while(getline(f1,ch))
	{
		
                for(int i=0;ch[i]; i++)
                {
                        if((ch[i]>='A') && (ch[i]<='Z'))
                        {
                            uppercnt++;
                            cout<<"\n condition for upper "<<ch[i];
                        }
                        else if((ch[i]>='a') && (ch[i]<='z'))
                        {
                            lowercnt++;
                            cout<<"\n condition for upper "<<ch[i];
                        }
                    
                        
                        
                }
    }

    cout<<"\n---------------------------------------------------------------------------------------------\n"<<endl;

    cout<<"Upper-Cnt is => [ "<<uppercnt<<" ] Lower-Cnt is => [ "<<lowercnt<< " ] Digit-Cnt is => [ "<<digitcnt<<" ] "<<endl;
    
    cout<<"\n---------------------------------------------------------------------------------------------\n"<<endl;

	   
	
	
	
	return 0;
	
}