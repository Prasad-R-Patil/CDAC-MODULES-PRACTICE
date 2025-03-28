#include<string.h>
#include<iostream>
using namespace std;

#define  PI  3.14f

class Shape
{
    protected:
   
    float height;
    float width;
    float radius;

    public:
    Shape()
    {
        height = 3;
        width = 10;
        radius = 5;
    }

    Shape(float r)
    {
        radius = r;
    }

    Shape(float h , float w)
    {
        height=h;
        width=w;
    }

    virtual ~Shape()
    {

    }

    virtual void getArea() = 0;

};

class Triangle : public Shape
{
    public:
    Triangle():Shape()
    {

    }

    Triangle(float h , float w):Shape(h,w)
    {

    }

    ~Triangle()
    {

    }

    bool operator ==(Triangle t)
    {
        if((height == t.height) && (width == t.width) )
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    void getArea()
    {
        cout<<"Area of Trangle is => "<< ((height*width)/2)<<endl;
    } 

};

class Circle : public Shape
{
    int x;
    int y;
    public:

    Circle():Shape()
    {

    }

    Circle(int x , int y ,float r):Shape(r)
    {
        x=x;
        y=y;
    }
    
    ~Circle()
    {

    }

    bool operator ==(Circle c)
    {
        if((radius == c.radius) )
        {
            return true;
        }
        else
        {
            return false;
        }
    }


    void getArea()
    {
        cout<<"Area of Circle is => "<< (PI *( radius * radius))<<endl;
    } 

};

int main()
{
	//This line should give compile time error like "Cant create object of abstract class" as we can't draw Shape. 
	
    //Shape *shape = new Shape();
	
    cout<<"\n----------------------------------------------------------------------------"<<endl;
	//My Triangle's width is 10 & height is 3 
	Shape *triangleShape = new Triangle(10, 3.5);
	
	//Triangle's area formula is (width * height)/2 
	triangleShape->getArea();
	
	delete triangleShape;

    cout<<"\n----------------------------------------------------------------------------"<<endl;

    //My Circle radius is 6
    
    Shape *CircleShape = new Circle(2,5,6);

    //Triangle's area formula is (PI * radius * radius) 
	CircleShape->getArea();
	
    cout<<"\n----------------------------------------------------------------------------"<<endl;
    
	//My Circle's centre is at 2,2 (x,y) and radius of 3 and it is-a Shape
	Circle c1(2,2,3);
	Circle c2(3,3,8);
	
	//Please check both circles areas to verify whether they are equal or not
	//Circle's area formula is (3.14 * radius * radius)
	if(c1 == c2)
		cout<<"Both circle are of same area c1 & c2"<<endl;
	else
		cout<<"Both circle are of different area c1 & c2"<<endl;	
    c1.getArea();
    c2.getArea();

    cout<<"\n----------------------------------------------------------------------------"<<endl;

    //My Circle's centre is at 2,2 (x,y) and radius of 3 and it is-a Shape
	Circle c3(2,2,3);
	Circle c4(3,3,3);
	
	//Please check both circles areas to verify whether they are equal or not
	//Circle's area formula is (3.14 * radius * radius)
	if(c3 == c4)
		cout<<"Both circle are of same area c3 & c4"<<endl;
	else
		cout<<"Both circle are of different area c3 & c4"<<endl;
    c3.getArea();
    c4.getArea();
	
    cout<<"\n----------------------------------------------------------------------------"<<endl;


    return 0;
}
