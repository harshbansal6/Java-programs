// Exp_1 : Create a person class, it should have instance variables record name, age and salary. Create a person object. Set and display its instance variables.

import java.util.Scanner;

class person 
{
	int sal,age;
	String name;
	public void set()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the name :");
		name=s.nextLine();
		System.out.println("Enter the age  :");
		age=s.nextInt();
		System.out.println("Enter the salary : ");
		sal=s.nextInt();
	}
	public void display()
	{
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Salary : "+sal);
	}
	public static void main(String args[])
	{
		person p = new person();
		p.set();
		System.out.println("========  Output ========");
		p.display();				
	}
}
