#include<iostream>
using namespace std;

class MyArray
{

    int len;
    int *ptr;

    public:

    MyArray()
    {
        cout<<"\n Default Constructor is called....\n";
        len=5;

        ptr = new int[len];

        for(int i=0; i<len; i++)
        {
            ptr[i]=0;
        }
    }

    MyArray(int a)
    {
        cout<<"\n One Parameter Constructor is called....\n";

        len=a;

        ptr = new int[len];

        for(int i=0; i<len; i++)
        {
            ptr[i]=0;
        }
    }
/*
    MyArray(MyArray &a)
    {
        cout<<"\n Copy Constructor is called....\n";
        len=a.len;
        for(int i=0; i<len; i++)
        {
            ptr[i]=a.ptr[i];
        }

    }
*/

    const MyArray operator = (const MyArray &m)
    {
        delete []ptr;
        cout<<"\n Copy Constructor is called....\n";
        len = m.len;

        ptr = new int[len];

        for(int i=0; i<len; i++)
        {
            ptr[i] = m.ptr[i];
        }

        return *this;
    }

    ~MyArray()
    {
        cout<<"\n Destructor is called....\n";

        delete []ptr;
    }

    void Accept_Array()
    {

        for(int i=0; i<len; i++)
        {
            cout<<"\nEnter Array Element ["<<i<<"]  => ";
            cin>>ptr[i];
        }


    }

    void Display_Array()
    {


        for(int i=0; i<len; i++)
        {
            cout<<ptr[i]<<" ";
        }


    }

};

int main()
{
    MyArray m1;
    m1.Display_Array();

    m1.Accept_Array();
    m1.Display_Array();

    MyArray m2(7);
    m2.Accept_Array();
    m2.Display_Array();

   // MyArray m3(m2);
   // m3.Display_Array();

    MyArray m4(7);
    m4.Accept_Array();
    m4.Display_Array();

    m1 = m4;
    m1.Display_Array();

    m1=m2=m4;
    m1.Display_Array();






    return 0;

}

