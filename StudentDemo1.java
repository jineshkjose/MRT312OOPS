//Program to display the details of a student using class andobject 
class Student
{ int rollNo;
String name;
void display ()
{
System.out.println ("Student Roll Number is: " + rollNo);
System.out.print ("Student Name is: " + name);
}
}


class StudentDemo1
{ 
	public static void main(String args[]) {
Student s1 = new Student ();

System.out.println ("First Student Details :" ); 
s1.rollNo = 101;
s1.name = "Suresh";
s1.display ();
Student s2 = new Student ();
System.out.println ("Second Student Details :" ); 

s2.rollNo = 102;
s2.name = "Ramesh";
s2.display ();
}
}
