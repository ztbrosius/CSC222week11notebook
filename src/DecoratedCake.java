public class DecoratedCake extends Cake
{
   private String theme;
   public DecoratedCake(int size, String cakeTheme)
   {
      super(size);
      theme = cakeTheme;
   }
   public String getTheme()
   {
      return theme;
   }
}