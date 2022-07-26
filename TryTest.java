public class TryTest {
    public static void main(String[ ] args) {
      int[] myNumbers = {1, 2, 3};

      try{
      System.out.println(myNumbers[10]); // error!

      }

     

     

      catch (Exception e) {
        System.out.println("Something went wrong.");

        System.out.println(e);
      }

      System.out.println("hi");

    }
}