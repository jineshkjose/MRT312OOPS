class Animal
{
 void move()
 
{
System.out.println("Animals Can Move");
}

 
}

class Dog extends Animal
{
 void move()
 
{
System.out.println("Dog Can Walk nad Run");
}

 
}


class Override
{
	
	public static void main(String args[])
	{
	Animal A =new Animal() ;  //reference - base class,base class object
	
	Animal B = new Dog(); //  base class reference child class object
	
	A.move();
	
	B.move();
	
	
	
	
		
	}
}
