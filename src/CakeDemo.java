public class CakeDemo
{
   public static void main(String[] args)
   {
      DecoratedCake cake = new DecoratedCake(8, "birthday");
      System.out.println(cake.getDiameter() +
         " inch cake decorated with " +
         cake.getTheme() + " theme");
   }
}