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

    MyComplex operator+(MyComplex &a)
    {
        MyComplex temp;

        temp.real = real + a.real;
        temp.imag = imag + a.imag;

        return temp;

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

    MyComplex obj4(2,3);
    obj4.Display();

    obj4 = obj4 + obj3;

    obj4.Display();


    return 0;

}
