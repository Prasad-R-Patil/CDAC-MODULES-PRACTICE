#include<iostream>
using namespace std;

class person
{
    protected :

    int Age;
    string name;

    public:

        person()
        {
            Age = 24;
            name = "prasad";
        }

        person(int a , string nm)
        {
            Age = a;
            name = nm;
        }

        ~person()
        {

        }

       virtual char Display() = 0;
        


};

class Student : public person
{
    char gread;

    public :

    Student()
    {
        gread = 'C';
    }

    Student( char g): person()
    {
        gread = g;
    }


    Student(int a , string nm, char g): person(a,nm)
    {
        gread = g;
    }

    ~Student()
    {

    }



    char Display()
    {
        cout<<"Student Information =>> "<<Age<<" "<<name<<endl;
        return gread;
    }

};



int main()
{
    cout<<"\n======================[ obj-1 ]=========================\n"<<endl;
    person *p1 = new Student(25,"sagar",'A');

    cout<<"Student Pass With Gread ==>>  [ "<<p1->Display()<<" ]";
    delete p1;
    cout<<"\n=========================================================\n"<<endl;

    cout<<"\n======================[ obj-2 ]=========================\n"<<endl;
    person *p2 = new Student('A');

    cout<<"Student Pass With Gread ==>>  [ "<<p2->Display()<<" ]";
    delete p2;
    cout<<"\n=========================================================\n"<<endl;

    cout<<"\n======================[ obj-3 ]=========================\n"<<endl;
    person *p3 = new Student(23,"Tejas",'B');

    cout<<"Student Pass With Gread ==>>  [ "<<p3->Display()<<" ]";
    delete p3;
    cout<<"\n=========================================================\n"<<endl;





    return 0;
}