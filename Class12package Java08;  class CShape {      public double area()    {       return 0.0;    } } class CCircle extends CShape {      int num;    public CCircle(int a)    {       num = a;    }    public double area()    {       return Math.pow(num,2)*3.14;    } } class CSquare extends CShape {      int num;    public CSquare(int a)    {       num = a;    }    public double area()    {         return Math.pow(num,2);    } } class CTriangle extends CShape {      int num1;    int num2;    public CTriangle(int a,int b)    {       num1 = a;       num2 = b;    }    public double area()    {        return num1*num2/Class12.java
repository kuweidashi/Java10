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
      return Math.pow(num,2)*3.14;
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
      return Math.pow(num,2);
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
public class Class12
{
   public static void largest(CShape css[][]) {
      double max=css[0][0].area(); 
      for(int i=0;i<3;i++)
      {
         for(int j=0;j<2;j++)
         {
            if (css[i][j].area()>max)
            {
               max = css[i][j].area();
            }
         }
      }
      System.out.println("max="+max);
   }
   public static void main(String args[])
   {
      CShape cs[][] = new CShape[3][2];
      cs[0][0] = new CCircle(1);
      cs[0][1] = new CCircle(2);
      cs[1][0] = new CSquare(3);
      cs[1][1] = new CSquare(4);
      cs[2][0] = new CTriangle(5,6);
      cs[2][1] = new CTriangle(7,8);
      largest(cs);
   }
}
