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
   public void setBeds(int add){bedrooms = add;}
   public int getBedrooms(){return bedrooms;}
   public void setBaths(int add){bathrooms = add;}
   public int getBathrooms(){return bathrooms;}
}