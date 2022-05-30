class Student{
	int RollNo;
	String Name;
	
	void Display()
	{
		
		
		System.out.println(RollNo);
		System.out.println(Name);
	}
	
	Student(int rno,String Nam){
		
		RollNo=rno;
		Name=Nam;
	}
	
}


public class SimpleDisplayClass
{

public static void main(String args[]){

Student S1=new Student(2,"Ajin KJ");

S1.Display();

}

}
