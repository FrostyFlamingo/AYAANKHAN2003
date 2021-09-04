/*
day3 assingment-
program for calculating cab fare:
*/
import java.util.Scanner;
class cabs {
    int fare;
    int dis;
    //default constructor
    public cabs()
    {
        fare = 20;
    }
    //parameterised constructor
    public cabs(int extra)
    {
        fare = 20 + extra*10;
    }
}

class cabfare
{
  
  public static void main(String []args)
  {
    int cd;
      Scanner ob = new Scanner(System.in);
      System.out.println("enter the total distance between you and cab:");
      cd=ob.nextInt();

      if(cd>5)
      {
          cabs obj = new cabs(cd-5);
          System.out.println("enter the distance traveled:");
          obj.dis=ob.nextInt();
          obj.fare=obj.fare + 10 * obj.dis;

          System.out.println("the total fare amount is:"+obj.fare);

      }

      else
      {
          cabs abs = new cabs();
          System.out.println("enter the distance traveled:");
          abs.dis=ob.nextInt();
          abs.fare= abs.fare + 10 * abs.dis;

          System.out.println("the total fare amount is:" + abs.fare);

      }
      ob.close();

  }

}