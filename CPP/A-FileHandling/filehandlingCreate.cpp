 #include<iostream>
 #include<fstream>

 using namespace std;


 int main()
 {
    ofstream onFile; //create object for use create file

    onFile.open("C:\\Users\\user\\Desktop\\CDAC-MODULES-PRACTICE\\CPP\\A-FileHandling\\FileFirst.txt");
    cout<<"File Created Successfully...."<<endl;
    onFile.close();


    return 0;
 }