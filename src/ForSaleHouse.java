public class ForSaleHouse extends House
{
   private int price;
   public void setPrice(int askingPrice)
   {
      price = askingPrice;
   }
   public int getPrice()
   {
      return price;
   }

   @Override
   public void houseData(){
      // calling super will bring the outputs from the parent class
      super.houseData();
      //System.out.println("The address of this house is " + address + ".");
      System.out.println("The price of this house is $" + price + ".");
      System.out.println("Call to Buy");

   }
}