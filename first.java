/*
DAY 1 ASSIGNMENET FOR JAVA ZERO TO HERO:

part 1:

The difference betweeen compiler and interpreter:

        compiler                  |                    interpreter
                                  |  
1)a compiler takes an entire      | 1)a interpreter takes a single line
program in one go.                |  program in one go.
2)It is faster.                   | 2)it is slower.
3)consumes less time.             | 3)consumes more time.
4)they take more memory.          | 4)they take less memory.
5)programming languages such as   | 5)programming languages such as 
  c, c++, c#, java, etc use       |  pyhton, ruby, BASIC, etc use 
  compiler.                       |  interpreter.
*/


/*
part 2: 

the problem:
*/

import java.util.Scanner;

class student
{
    public static void main(String[] args) {
      int roll;
      String name;
      Float marks;
      Scanner obj= new Scanner(System.in);
     
      System.out.println("Enter roll number:");
      roll= obj.nextInt();
      obj.nextLine();
      System.out.println("Enter name:");
      name = obj.nextLine();    
      System.out.println("Enter marks:");
      marks = obj.nextFloat(); 

      obj.close();

      System.out.println("students roll number:\t"+roll);

      System.out.println("students name:\t"+name);

      System.out.println("students marks:\t"+marks);

    }
}    