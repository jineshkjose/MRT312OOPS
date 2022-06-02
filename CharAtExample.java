    public class CharAtExample{  
    public static void main(String args[]){  
    String name="javatpoint";  
    char ch=name.charAt(4);//returns the char value at the 4th index  
    System.out.println(ch); 
    
     System.out.println(name.length()); 
     
      System.out.println(name.substring(4, 8)); 
     
     
     String s1="Jyothi";    

s1=s1.concat(" Engg College");  
  
System.out.println(s1);   


String s2="javatpoint is a very good website";  
String replaceString=s2.replace('a','e');//replaces all occurrences of 'a' to 'e'  
System.out.println(replaceString);   

String s3="this is index of example";  
//passing substring  
int index1=s3.indexOf('i');

    System.out.println(index1);    
    }}  
