 #include<iostream>
 #include<fstream>

 using namespace std;


 int main()
 {
    ofstream onFile; //create object for use Write file

    onFile.open("C:\\Users\\user\\Desktop\\CDAC-MODULES-PRACTICE\\CPP\\A-FileHandling\\FileFirst.txt");
    
    onFile<<" (: Thanku So Much :) ...."<<endl;

    cout<<"Data has Written in File Successfully...."<<endl;
    onFile.close();


    return 0;
 }