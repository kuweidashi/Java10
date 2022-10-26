package Java10;

class CTriangle
{  
   protected int base;
   protected int height;

   protected void show()
   {
      System.out.println("base="+base+", height="+height);
   }
}
class CData extends CTriangle
{
   CData(int a,int b)
   {
      base=a;
      height=b;
   }
   public void area()
   {
      super.show();
      System.out.println("area="+base*height/2.0);
   }
}
public class Class06
{
   public static void main(String args[])
   {
      CData obj = new CData(3,8);
      obj.area();
   }
}
