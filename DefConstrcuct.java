class Student
{ int rollNo; String
name;
Student ()
{ rollNo = 101;
name = "Suresh";
}
void display ()
{ System.out.println ("Student Roll Number is: " + rollNo);
System.out.println ("Student Name is: " + name);
}
}
class DefConstrcuct
{ public static void main(String args[]) {
Student s1 = new Student ();
System.out.println ("s1 object contains:"); 
s1.display ();
Student s2 = new Student ();
System.out.println ("s2 object contains:"); 
s2.display ();
}
}
