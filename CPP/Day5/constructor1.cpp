#include<iostream>
using namespace std;

class MyComplex
{
    int real;
    int imag;

    public:

    MyComplex()
    {
        cout<<"Default Constructor called..."<<endl;
        real=0;
        imag=0;
    }

    MyComplex(int a)
    {
        cout<<"one Parameter Constructor called..."<<endl;
       
        real = imag = a;

    }

    MyComplex(int a,int b)
    {
        cout<<"Two Parameter Constructor called..."<<endl;
        real=a;
        imag=b;

    }

    ~MyComplex()
    {
        cout<<"Destructor called..."<<endl;
    }

    void Display()
    {
        cout<<real<<" + "<<imag<<"i"<<endl;
    }

};

int main()
{
    MyComplex obj1;
    obj1.Display();

    MyComplex obj2(4);
    obj2.Display();

    MyComplex obj3(4,5);
    obj3.Display();


    return 0;

}
