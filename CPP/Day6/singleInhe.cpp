#include<iostream>
using namespace std;

class Base
{
    protected:
    int bvar;

    public:

    Base()
    {
        bvar = 10;
    }

    Base(int v)
    {
        bvar = v;

    }

    ~Base()
    {

    }

    void fun()
    {
        cout<<"Base Fun"<<endl;
    }

    void Display()
    {
        cout<<"bvar = "<<bvar<<endl;
    }

};

class Derived : public Base
{
    int dvar;

    public:

    Derived()
    {
        dvar = 30;
    }

    Derived(int v)
    {
        dvar = v;
    }

    ~Derived()
    {

    }

    void Display()
    {
        cout<<"dvar = "<<dvar<<endl;
    }

};


int main()
{
    Base b1;
    b1.Display();

    Base b2(20);
    b2.Display();

    b2.fun();

    Derived d1;
    d1.Display();

    Derived d2(40);
    d2.Display();

    d2.fun();



    return 0;
}