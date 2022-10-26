package Java10;

class Car
{  
   protected String owner;
   protected String id;

   public Car(String own, String s)
   {  
      owner = own;
      id = s;
   }
   final void show()
   {
      System.out.println("車主姓名"+owner);
      System.out.println("車牌號碼"+id);
   }
}
class CColor extends Car
{  
   protected String color;

   public CColor(String own, String s, String c)
   {
      super(own, s);
   }
   
   public void show2()
   {
      System.out.println("車主姓名"+owner);
      System.out.println("車牌號碼"+id);
      System.out.println("車深顏色"+color);
   }
}

public class Class17
{
   public static void main(String args[])
   {
      CColor mycar = new CColor("Riaan","A1-2345","Black");
      mycar.show2();
   }
}
