#include<iostream>
#include <string.h>
using namespace std;

class Student
{
    int Age;
    char *Name;

    public:

    Student()
    {
        cout<<"\n Default Constructor called..."<<endl;
        Age = 23;
        Name = new char[strlen("Prasad") + 1];  // Allocate memory
        strcpy(Name, "Prasad"); 
    }

    Student(int a, const char*s)
    {
        cout<<"\n Parameter Constructor called..."<<endl;
        Age = a;
        Name = new char[strlen(s) + 1];  // Allocate memory
        strcpy(Name, s); 
    }

    Student(Student const &s)
    {
        cout<<"\n Copy Constructor called..."<<endl;

        Age=s.Age;
        Name= new char[strlen(s.Name)+1];
        strcpy(Name,s.Name);

    }

    bool operator ==(const Student &s)
    {
        if((Age==s.Age)&&(strcmp(Name,s.Name)==0))
        {
            return true;
        }
        else
        {
            return false;
        }

    }



    ~Student()
    {
        delete []Name;
    }

    void Display()
    {
        cout<<"\n Student Age is => "<<Age<<endl;
        cout<<"\n Student Name is => "<<Name<<endl;

    }

};

int main()
{
    Student s1;
    s1.Display();

    Student s2(25,"Sagar");
    s2.Display();

    Student s3;
    s3=s1;
    s3.Display();

    cout<<"if Student Data Are match 1 OR if Student Data Are Not match 0 ==>  [ "<<(s3==s1)<<" ]"<<endl;

    cout<<"if Student Data Are match 1 OR if Student Data Are Not match 0 ==>  [ "<<(s3==s2)<<" ]"<<endl;



    return 0;
}