import operation.*;
import java.util.*;
class slip20_2
{
  public static void main(String args[]) 
   {
      System.out.println("Enter two number");
   Scanner t=new Scanner(System.in);
    int a=t.nextInt();
    int b=t.nextInt();
   addition t1=new addition();
    t1.add(a,b);
    t1.sub(a,b);
   maximum t2=new maximum();
   t2.max(a,b);

   }

}