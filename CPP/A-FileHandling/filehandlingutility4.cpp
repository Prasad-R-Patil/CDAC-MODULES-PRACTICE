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
	int uppercnt = 0;
    int lowercnt = 0;
    int digitcnt = 0;
    int vowelcnt = 0;
    int totalcnt = 0;
	
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
                        else if((ch[i]>='0') && (ch[i]<='9'))
                        {
                            digitcnt++;
                            cout<<"\n condition for digit "<<ch[i];
                        }
                        if ((ch[i]=='a')||(ch[i]=='e')||(ch[i]=='i')||(ch[i]=='o')||(ch[i]=='u')||(ch[i]=='A')||(ch[i]=='E')||(ch[i]=='I')||(ch[i]=='O')||(ch[i]=='U'))
                        {
                            vowelcnt++;
                            cout<<ch[i]<<endl;
                        }
                    
                        totalcnt++;
                        
                }
    }

    cout<<"\n------------------------------------------------------------------------------------------------------------------------------------------\n"<<endl;

    cout<<"Upper-Cnt is => [ "<<uppercnt<<" ] Lower-Cnt is => [ "<<lowercnt<< " ] Digit-Cnt is => [ "<<digitcnt<<" ]  Vowel-Cnt is => [ "<<vowelcnt<<" ]  Total-Cnt is => [ "<<totalcnt<<" ]"<<endl;

    cout<<"\n-------------------------------------------------------------------------------------------------------------------------------------------\n"<<endl;

	   
	
	
	
	return 0;
	
}