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

class Derived2 : public Base
{
    int dvar2;

    public:

    Derived2()
    {
        dvar2 = 50;
    }

    Derived2(int v)
    {
        dvar2 = v;
    }

    ~Derived2()
    {

    }

    void Display()
    {
        cout<<"dvar2 = "<<dvar2<<endl;
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

    Derived2 d11;
    d11.Display();

    Derived2 d22(60);
    d22.Display();

    d22.fun();



    return 0;
}