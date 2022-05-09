import java.util.Scanner;
class Employee
{
	int empid;
	String name;
	double salary;
	String address;
	
	Employee()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the empid :");
		empid=s.nextInt();
		System.out.println("Enter the name :");
		name=s.next();
		System.out.println("Enter the salary :");
		salary=s.nextInt();
		System.out.println("Enter the address :");
		address=s.next();
	}
}
class Teacher extends Employee
{
	String department;
	String subject;
	
	Teacher()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the department :");
		department=s.next();
		System.out.println("Enter the subject taught:");
		subject=s.next();
		System.out.println();
	}
	void display()
	{
		System.out.println("empid :"+empid);
		System.out.println("name :"+name);
		System.out.println("salary :"+salary);
		System.out.println("address :"+address);
		System.out.println("subject :"+subject);
		System.out.println();
	}
}
class Inheritance
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no. of teachers");
		int n=s.nextInt();
		Teacher[] teacher= new Teacher[n];
		for(int i=0;i<n;i++)
		teacher[i]=new Teacher();
		System.out.println("Details of teachers");
		for(int i=0;i<n;i++)
		{
			System.out.println();
			teacher[i].display();
		}
	}
}
		
		
		 
		
		
		
		
		
		
		
		
		
		
