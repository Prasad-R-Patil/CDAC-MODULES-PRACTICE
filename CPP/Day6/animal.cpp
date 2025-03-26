#include<iostream>
using namespace std;

class Animal
{
    public :
    virtual void make_Sound() = 0; //pure virtual function;
};

class Cat : public Animal
{
    public:

    void make_Sound()
    {
        cout<<"meows meows"<<endl;
    }

};

class Dog : public Animal
{
    public:

    void make_Sound()
    {
        cout<<"bark bark "<<endl;
    }
};

int main()
{

    //Animal a;      // Do not create Abstract class becuase there is no any decliare function or methode

    Cat c;
    c.make_Sound();

    Dog d;
    d.make_Sound();



    return 0;

}