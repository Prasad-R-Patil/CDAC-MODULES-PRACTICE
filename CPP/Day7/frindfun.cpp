#include<iostream>
using namespace std;

class B;
 class A 
 {
  int Adata;
  public:
    void getdata()
    {
       cout<<"Enter value";
       cin>>Adata;
    }
    void display()
    {
       cout<<"Value of Adata "<<Adata<<endl;
    }
    void friend swap(A &, B &);
 };

 class B
 {
    int Bdata;
    public:
     void getdata()
     {
      cout<<"Enter value of B class";
      cin>>Bdata;
     }
     void display()
     {
      cout<<"Value of Bdata "<<Bdata<<endl;
     }
     void friend swap(A &obj1, B &obj2);
    };


    void swap(A &obj1, B &obj2)
 {   int t;
     t=obj1.Adata;   obj1.Adata=obj2.Bdata;  obj2.Bdata=t;
     obj1.display();
 }
