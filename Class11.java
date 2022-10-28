package Java10;

class CShape
{
   public double area()
   {
      return 0.0;
   }
}
class CCircle extends CShape
{
   int num;
   public CCircle(int a)
   {
      num = a;
   }
   public double area()
   {
      return Math.pow(num, 2)*Math.PI;
   }
}
class CSquare extends CShape
{
   int num;
   public CSquare(int a)
   {
      num = a;
   }
   public double area()
   {
      return Math.pow(num, 2);
   }
}
class CTriangle extends CShape
{
   int num1;
   int num2;
   public CTriangle(int a,int b)
   {
      num1 = a;
      num2 = b;
   }
   public double area()
   {
      return num1*num2/2.0;
   }
}
public class Class11
{
   public static void largest(CShape css[]) {
      double max=css[0].area(); 
      for(int i=0;i<6;i++)
      {
         max = css[i].area();
      }
      System.out.println("max="+max);
   }
   public static void main(String args[])
   {
      CShape cs[] = new CShape[6];
      cs[0] = new CCircle(2);
      cs[1] = new CCircle(3);
      cs[2] = new CSquare(4);
      cs[3] = new CSquare(5);
      cs[4] = new CTriangle(6,7);
      cs[5] = new CTriangle(8,9);
      app11_1.largest(cs);
   }
}
