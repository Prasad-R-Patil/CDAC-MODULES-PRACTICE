#include<iostream>
#include<string.h>
using namespace std;

class Animal
{
    protected:
    string name;
    int Age;

    public:

    Animal()
    {
        name="Bachaa";
        Age=3;
    }

    Animal(string nm , int a)
    {
        name = nm;
        Age = a;
    }
    virtual ~Animal()
    {
        //cout<<"Dectructor Animal"<<endl;
    }

   

    virtual void Talk()=0;

};

class Dog :public Animal
{
    public:
    
    Dog() :Animal()
    {
        //Default constructor Dog to access default value Animal
    }

    Dog(string nm , int a) : Animal(nm,a)
    {
        //Parameter constructor Dog to insert and set value in  Animal constructor
    }

    ~Dog()
    {
        //cout<<"Dectructor Dog"<<endl;
    }

    bool operator ==(Dog c)
    {
        if(strcmp(name.c_str() , c.name.c_str())==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    void Talk()
    {
        cout<<"Dog Name is => "<<name<<"  &  "<<"Dog Age is => "<<Age<<" Month"<<endl;
    }


};


class Cat :public Animal
{
    public:

    Cat():Animal()
    {
        //Default constructor Cat to access default value Animal
    }

    Cat(string nm , int a):Animal(nm,a)
    {
        //Parameter constructor Dog to insert and set value in  Animal constructor
    }

    ~Cat()
    {
        //cout<<"Dectructor Cat"<<endl;
    }

    bool operator ==(Cat c)
    {
        if(strcmp(name.c_str() , c.name.c_str())==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    void Talk()
    {
        cout<<"Cat Name is => "<<name<<"  &  "<<"Cat Age is => "<<Age<<" Month"<<endl;
    }

};



int main()
{	
	// Animal *animal = new Animal();  //This line should give compile time error "Cant create object of abstract class" 
	
	//My Dog name is Boss & age is 15 months
	Animal *dogPtr = new Dog("Boss", 15);
	dogPtr->Talk(); //Every animal has unique way of sound
	delete dogPtr;

	//My cat name is Puppy & she is 3 month old and it is-a Animal
	Cat c1("Puppy", 3);
	Cat c2("Sweety", 4);
	
	//Use strcmp function to to compare names of 2 Cat
	if(c1 == c2)  
		cout<<"Both are same!"<<endl;
	else
		cout<<"Both are different!"<<endl;
     c1.Talk();

        Cat c3("Sweety", 3);
        Cat c4("Sweety", 4);
        
        //Use strcmp function to to compare names of 2 Cat
        if(c3 == c4)  
            cout<<"Both are same!"<<endl;
        else
            cout<<"Both are different!"<<endl;
		
	c3.Talk();


    return 0;
}
