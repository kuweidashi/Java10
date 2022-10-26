package Java10;

class Caaa              // 定義Caaa類別
{  
   public int num1;
   public int num2;
   public Caaa()
   {
      num1=num2=1;
   }
   public Caaa(int a,int b)
   {
      num1=a;
      num2=b;
   }
   public void show()
   {
      System.out.println("num1="+num1);
      System.out.println("num2="+num2);
   }
}
class Cbbb extends Caaa
{
   public Cbbb(int a,int b)
   {
      super(a,b);
   }
   public void set_num(int a,int b)
   {
      num1=a;
      num2=b;
   }
   public void show()
   {
      System.out.println("num1="+num1);
      System.out.println("num2="+num2);
   }
}
public class Class03
{
   public static void main(String args[])
   {
      Cbbb bb = new Cbbb(5,10);
      bb.set_num(5,10);
      bb.show();
      Caaa aa;
      aa = new Caaa();
      aa.show();
      aa = new Caaa(5,10);
      aa.show();
   }
}


