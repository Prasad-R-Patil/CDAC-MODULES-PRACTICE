#include<iostream>
#include<fstream>

using namespace std;


int main()
{
   
   int value = remove("C:\\Users\\user\\Desktop\\CDAC-MODULES-PRACTICE\\CPP\\A-FileHandling\\FileSecond.txt");

    if(value == 0)
    {
        cout<<"File Delete Successfully..."<<endl;
    }
    else
    {
        perror("File Not Delete...");
    }
   
   

   return 0;
}