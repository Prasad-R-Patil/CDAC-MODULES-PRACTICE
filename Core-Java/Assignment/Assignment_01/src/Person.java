
public class Person 
{
	
	private String name;
	private int age;
	
	public Person()
	{
		age=18;
	}
	
	public Person(String n)
	{
		name=n;
		age=18;
	}
	
	public Person(String n, int a)
	{
		name=n;
		age=a;
	}
	
	public void Display()
	{
		System.out.println("Name is "+name+"  & Age is "+age);
	}
	
	public static void main(String[] args) 
	{
		Person p1 = new Person();
		p1.Display();
		
		Person p2 = new Person("Prasad");
		p2.Display();
		
		Person p3 = new Person("Sagar" , 24);
		p3.Display();
	}
	
}
