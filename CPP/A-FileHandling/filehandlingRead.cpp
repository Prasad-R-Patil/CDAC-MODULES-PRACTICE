 #include<iostream>
 #include<fstream>

 using namespace std;


 int main()
 {
    string str; // use for read data in file

    ifstream inFile; //create object for use Read file

    inFile.open("C:\\Users\\user\\Desktop\\CDAC-MODULES-PRACTICE\\CPP\\A-FileHandling\\Song.txt");
    
    //inFile>>str; // only one word are show then use loop

    while(getline(inFile,str))
    {
        cout<<str;
    }

    cout<<str<<endl;
    inFile.close();


    return 0;
 }