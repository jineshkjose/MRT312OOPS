


public class VariableEg {
	
	public static void main (String[] args) {
		
		Product prod1=new Product();
		prod1.Barcode=123456;
		
		Product prod2=new Product();
		prod2.Barcode=987654;
		
		System.out.println(prod1.Barcode);
		
		System.out.println(prod2.Barcode);
	
	}
}

class Product
{
	public int Barcode;
	
 
}

