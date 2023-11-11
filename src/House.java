public class House
{
   private String address;
   private int bedrooms;
   private int bathrooms;

   public void setAddress(String add)
   {
      address = add;
   }
   public String getAddress()
   {
      return address;
   }


   //create a method that will print out the address of this house
   public void houseData(){

      System.out.println("The address of this house is " + address + ".");

   }// ends houseData

}