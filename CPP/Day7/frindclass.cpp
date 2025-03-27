#include<iostream>
using namespace std;

class A
{
    int data;
    public:
        void setdata() 
        {
            cout<<"Enter a number";
            cin>>data;
        }
  void display() 
  {
   cout<<"Value of A class Data from class A function "<<data<<endl;
  }
        friend class B;
};

class B 
{

    public:
     void display(A obj)
     {
      cout<<"Value of A Class data from class B function "<<obj.data<<endl;
     }
};

int main() 
{
    A obj;
    B obj1;
    obj.setdata();
    obj.display();
    obj1.display(obj);
}
   