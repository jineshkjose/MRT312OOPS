
public class Student{  
int id;  
String name;  
//method to display the value of id and name  
public void display()
{
	System.out.println(id+" "+name);
	} 

public void Student()
{
	
	id=20;
	name="Jinesh";
	
	System.out.println("hi");
} 

}

public class Construct
{

  
public static void main(String args[]){  
//creating objects  
Student s1=new Student();  
Student s2=new Student();  
//displaying values of the object  
s1.display();  
s2.display();  
}  
}  
