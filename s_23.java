import java.io.*;
class Person
 {
	
	String name,Aadharno;
	String Panno;
Person(String Aadharno, String name, String Panno)
 {
	this.Aadharno = Aadharno;
	this.name = name;
	this.Panno = Panno;
}

void display() 
{
	System.out.println("Aadharno is :"+Aadharno);
	System.out.println("Name is: "+name);
	System.out.println("Panno is :"+Panno);
}
public static void main(String ar[]) 
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Person p, p1, p2, p3, p4;
	String a;
	String n, pno;
	try 
	{
		System.out.println("Enter Aadhar no");
		a = br.readLine();
		System.out.println("Enter name");
		n = br.readLine();
		System.out.println("Enter panno");	
		pno = br.readLine();
		p = new Person(a,n,pno);
		System.out.println("Enter Aadhar no");
		a = br.readLine();
		System.out.println("Enter name");
		n = br.readLine();
		System.out.println("Enter panno");
		pno = br.readLine();
		p1 = new Person(a,n,pno);
		System.out.println("Enter Aadhar no");
		a = br.readLine();
		System.out.println("Enter name");
		n = br.readLine();
		p2 = new Person(a,n,pno);
		System.out.println("Enter Aadhar no");
		a = br.readLine();
		System.out.println("Enter name");
		n = br.readLine();
		p3 = new Person(a,n,pno);
		System.out.println("Enter Aadhar no");
		a = br.readLine();
		System.out.println("Enter name");
		n = br.readLine();
		p4 = new Person(a,n,pno);
		p.display();
		p1.display();
		p2.display();
		p3.display();
		p4.display();
	} 
	catch(Exception e) 
	{
		System.out.println("Exception caught"+e);
	}
}
}

