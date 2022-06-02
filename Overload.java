class Sample
{
 void add(int a, int b)
{
System.out.println("Sum of two= "+(a+b));
}

 void add(int a, int b,int c)
{
System.out.println("Sum of three= "+(a+b+c));
}

}

class Overload
{
	
	public static void main(String args[])
	{
		Sample obj=new Sample();
		obj.add(20,30);
		obj.add(20,30,40);
	}
}
