#include<iostream>
#include<fstream>

using namespace std;


int main()
{
    const char * oldName= ("C:\\Users\\user\\Desktop\\CDAC-MODULES-PRACTICE\\CPP\\A-FileHandling\\FileSecond.txt");

    const char * newName= ("C:\\Users\\user\\Desktop\\CDAC-MODULES-PRACTICE\\CPP\\A-FileHandling\\FileDemo.txt");


    if(rename(oldName,newName)==0)
    {
        cout << "File renamed successfully..."<<endl;
    }
    else 
    {
        perror("Error renaming file");
    }

   


   return 0;
}