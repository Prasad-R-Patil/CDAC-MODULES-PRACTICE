#include<fstream>
#include<iostream>
#include<sstream>
using namespace std;
int main()
{
	string ch;
	ifstream f1;
	
	
	int uppercnt = 0;
    int lowercnt = 0;
    int digitcnt = 0;
    int vowelcnt = 0;
    int totalcnt = 0;

    string characters = "";    // To store non-numeric characters
    string num = "";  
    int sum=0;
	
	f1.open("king.txt");
	
	
	
	
	
	
	
    while(getline(f1,ch))
	{
		
                for(int i=0;ch[i]; i++)
                {
                        if((ch[i]>='A') && (ch[i]<='Z'))
                        {
                            uppercnt++;
                            cout<<"\n condition for Upper "<<ch[i];
                        }
                        else if((ch[i]>='a') && (ch[i]<='z'))
                        {
                            lowercnt++;
                            cout<<"\n condition for Lower "<<ch[i];
                        }
                        else if((ch[i]>='0') && (ch[i]<='9'))
                        {
                            digitcnt++;
                            cout<<"\n condition for Digit "<<ch[i];
                        }
                        else if ((ch[i]=='a')||(ch[i]=='e')||(ch[i]=='i')||(ch[i]=='o')||(ch[i]=='u')  ||   (ch[i]=='A')||(ch[i]=='E')||(ch[i]=='I')||(ch[i]=='O')||(ch[i]=='U'))
                        {
                            vowelcnt++;
                            cout<<ch[i]<<endl;
                        }

                        if (isdigit(ch[i])) 
                        {
                            digitcnt++;
                            num = num + ch[i]; // Collect digits
                            cout<<"\n Condition for Digit: " << ch[i];
                        } 
                        else 
                        {
                            if (!num.empty()) 
                            {
                                sum = sum + stoi(num);  // Convert collected digits to integer and add to sum
                                num = "";          // Reset for next number
                            }
                            characters = characters + ch[i];  // Store non-numeric characters
                        }
                    
                        totalcnt++;
                        
                }
    }

    cout<<"\n-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n"<<endl;

    cout<<"Upper-Cnt is => [ "<<uppercnt<<" ] Lower-Cnt is => [ "<<lowercnt<< " ] Digit-Cnt is => [ "<<digitcnt<<" ]  Vowel-Cnt is => [ "<<vowelcnt<<" ] Sum of number is => [ "<<sum<<" ] Total-Cnt is => [ "<<totalcnt<<" ]"<<endl;

    cout<<"\n--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n"<<endl;

	f1.close();



	
	
	
	return 0;
	
}