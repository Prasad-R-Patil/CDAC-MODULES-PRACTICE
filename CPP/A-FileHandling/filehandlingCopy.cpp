#include<iostream>
#include<fstream>

using namespace std;


int main()
{
   char str; // use for put data in second file

   ifstream inFile; //create object for use Read file
   ofstream onFile; //create object for use Write file

   inFile.open("C:\\Users\\user\\Desktop\\CDAC-MODULES-PRACTICE\\CPP\\A-FileHandling\\FileFirst.txt"); //Read Data
   onFile.open("C:\\Users\\user\\Desktop\\CDAC-MODULES-PRACTICE\\CPP\\A-FileHandling\\FileSecond.txt"); // New file for Copy data form first file
   
   //inFile>>str; // only one word are show then use loop

   while(inFile.get(str)) //get function get data char by char so i create one char variable
   {
       onFile.put(str);
   }

   cout<<"Copied Successfully....."<<endl;
   

   inFile.close();
   onFile.close();


   return 0;
}