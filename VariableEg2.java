


public class VariableEg2 {
	
	public static void main (String[] args) {
		
		Product prod1=new Product();
		prod1.setbarcode(123456);
		
		Product prod2=new Product();
		prod1.setbarcode(987654);
		
		System.out.println(prod1.getbarcode());
		
		System.out.println(prod2.getbarcode());
	
	}
}

class Product
{
	public static int Barcode;
	public int getbarcode()
	{
		return Barcode;
	}
	public void setbarcode(int value)
	{
		Barcode=value;
	}
	
 
}

