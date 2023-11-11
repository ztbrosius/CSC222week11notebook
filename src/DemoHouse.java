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
      House myHouse = new House(); // parent object
      myHouse.setAddress("123 Main Street");

      //for sale house
      ForSaleHouse ryansHouse = new ForSaleHouse(); // this is our child class
      ryansHouse.setAddress("123 Mansion Lane");
      ryansHouse.setPrice(500_000_000);

      System.out.println("The house at " + ryansHouse.getAddress() + " is for sale for $" + ryansHouse.getPrice());


      // show how to call the method for a parent object (House.java)
      myHouse.houseData();

      // show how the child class (ForSaleHouse) will only use the houseData method in it.
      ryansHouse.houseData();

   }
}