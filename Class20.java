package Java10;

class CRectangle
{
   protected int length;
   protected int width;
   public CRectangle(int l, int w)
   {
      length=l;
      width=w;
   }
   public String toString()
   {
      return "length="+length+","+"width="+width+","+"area="+length*width;
   }
   public String toString(int a, int b)                        //多載
   {
      if (a>=b)
         return toString();
      else
         return "Argument Error";
   }
}

public class Class20
{
   public static void main(String args[])
   {
      CRectangle rect = new CRectangle(2, 6);
      System.out.println(rect.toString(3, 4));
   }
}
