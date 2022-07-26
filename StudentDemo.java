

class Student
{ 
int rollNo; //properties -- variables
String name;

void display () //method -- action
{ 
System.out.println ("Student Roll Number is: " + rollNo);
System.out.println ("Student Name is: " + name);
}

public void Student()
{
	rollNo=10; //properties -- variables
String name="jinesh";

	
}

}


class StudentDemo
{ 
	public static void main(String args[])
{

//create an object to Student class 
Student s = new Student ();
//call display () method inside Student class usingobject s 
s.display ();
}
}
