public class DemoHouse
{
   public static void main(String[] args)
   {
//      ForSaleHouse aListedHouse = new ForSaleHouse();
//      aListedHouse.setAddress("56 Oak");
//      aListedHouse.setPrice(186000);
//      System.out.println("The house at " +
//         aListedHouse.getAddress() +
//         " is for sale for $" +
//         aListedHouse.getPrice());

      //create a regular house
      House myHouse = new House();
      myHouse.setAddress("123 Main Street");

      //for sale house
      ForSaleHouse ryansHouse = new ForSaleHouse();
      ryansHouse.setAddress("123 Mansion Lane");
      ryansHouse.setPrice(500_000_000);

      System.out.println("The house at " + ryansHouse.getAddress() + " is for sale for $" + ryansHouse.getPrice());


   }
}