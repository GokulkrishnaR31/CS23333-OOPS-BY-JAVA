CODE 1:
In the following program, an array of integer data is to be initialized.
During the initialization, if a user enters a value other than an integer, it will throw an InputMismatchException exception.
On the occurrence of such an exception, your program should print “You entered bad data.”
If there is no such exception it will print the total sum of the array.

/* Define try-catch block to save user input in the array "name"
   If there is an exception then catch the exception otherwise print the total sum of the array. */

Sample Input:

3
5 2 1

Sample Output:
8

Sample Input:
2 
1  g

Sample Output:
You entered bad data.
CODE:
import java.util.Scanner;
import java.util.InputMismatchException;
 class prog {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    int length = sc.nextInt(); 
    // create an array to save user input 
    int[] name = new int[length];
    int sum=0;//save the total sum of the array.
     
    /* Define try-catch block to save user input in the array "name"
   If there is an exception then catch the exception otherwise print 
   the total sum of the array. */ 
     try
      {
  for (int i = 0; i < length; i++) {
                name[i] = sc.nextInt();
            }
            for (int num : name) {
                sum += num;
            }

            System.out.println(sum);
         }
      catch(InputMismatchException e )
     {
 System.out.println("You entered bad data.");

    }
  }
 }

CODE 2:
Write a Java program to create a method that takes an integer as a parameter

and throws an exception if the number is odd.

Sample input and Output:

82 is even.
Error: 37 is odd.
Code:
class prog {
  public static void main(String[] args) {
    int n = 82;
    trynumber(n);
    n = 37;
    // call the trynumber(n);
    trynumber(n);

    
  }

  public static void trynumber(int n) {
    try {
        //call the checkEvenNumber()
          checkEvenNumber(n);
      System.out.println(n + " is even.");
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public static void checkEvenNumber(int number)throws Exception {
    if (number % 2 != 0) {
      throw new Exception("Error: "+ number + " is odd.");
    }
  }
}
CODE 3:
Write a Java program to handle ArithmeticException and ArrayIndexOutOfBoundsException.

Create an array, read the input from the user, and store it in the array.

Divide the 0th index element by the 1st index element and store it.

if the 1st element is zero, it will throw an exception.

if you try to access an element beyond the array limit throws an exception.

Input:

5

10  0 20 30 40 

Output:

java.lang.ArithmeticException: / by zero
I am always executed
  Code:
import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        try {
            int result = array[0] / array[1];
        } catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: " + e.getMessage());
        }

        try {
            int outOfBoundsAccess = array[3];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("java.lang.ArrayIndexOutOfBoundsException: " + e.getMessage());
        } finally {
            System.out.println("I am always executed");
        }

        scanner.close();
    }
}
