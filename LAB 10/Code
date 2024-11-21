CODE 1:
Given an ArrayList, the task is to get the first and last element of the ArrayList in Java.

Input: ArrayList = [1, 2, 3, 4] 
Output: First = 1, Last = 4

Input: ArrayList = [12, 23, 34, 45, 57, 67, 89] 
Output: First = 12, Last = 89
Approach:

Get the ArrayList with elements.
Get the first element of ArrayList using the get(index) method by passing index = 0.
Get the last element of ArrayList using the get(index) method by passing index = size – 1.
CODE:
import java.util.ArrayList;
import java.util.Scanner;
public class Array
{
public static void main(String args[])
{
Scanner A=new Scanner(System.in);
ArrayList<Integer> a=new ArrayList<Integer>();
int n=A.nextInt();
for(int i=0;i<n;i++)
{
a.add(A.nextInt());
}
System.out.println("ArrayList: "+a);
int f=getFirstElement(a);
int l=getLastElement(a);
System.out.println("First : "+ f+", "+"Last : "+ l);
}
 public static int getFirstElement(ArrayList<Integer> list) {
        if (list != null && !list.isEmpty()) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List is empty or null");
    }

    public static int getLastElement(ArrayList<Integer> list) {
        if (list != null && !list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        throw new IllegalArgumentException("List is empty or null");
    }
}
CODE 2:
The given Java program is based on the ArrayList methods and its usage. The Java program is partially filled. Your task is to fill in the incomplete statements to get the desired output.

list.set();

list.indexOf());

list.lastIndexOf())

list.contains()

list.size());

list.add();

 list.remove();

The above methods are used for the below Java program. 
CODE:
import java.util.ArrayList;
import java.util.Scanner;

public class Prog {

public static void main(String[] args)
{
 Scanner sc= new Scanner(System.in);
 int n = sc.nextInt();

 ArrayList<Integer> list = new ArrayList<Integer>();

 for(int i = 0; i<n;i++)
 list.add(sc.nextInt());

 // printing initial value ArrayList
 System.out.println("ArrayList: " + list);

//Replacing the element at index 1 with 100
list.set(1,100);

 //Getting the index of first occurrence of 100
System.out.println("Index of 100 = "+   list.indexOf(100));

//Getting the index of last occurrence of 100
 System.out.println("LastIndex of 100 = "+  list.lastIndexOf(100)); 
// Check whether 200 is in the list or not
System.out.println(list.contains(200)); //Output : false
 // Print ArrayList size
 System.out.println("Size Of ArrayList = "+   list.size());
//Inserting 500 at index 1
             list.add(1,500);                    // code here
 //Removing an element from position 3
                 list.remove(3);              // code here
  System.out.print("ArrayList: " + list);
 }
}
CODE 3:
Write a Java program to reverse elements in an array list.
Sample input and Output:
Red
Green
Orange
White
Black
Sample output
List before reversing :                                                
[Red, Green, Orange, White, Black]                                     
List after reversing :                                                 
[Black, White, Orange, Green, Red] 
CODE:
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class Reverse
{
public static void main(String args[])
{
Scanner A=new Scanner(System.in);
int n=A.nextInt();
ArrayList<String> a=new ArrayList<String>();
for(int i=0;i<n;i++)
{
a.add(A.next());
}
System.out.println("List before reversing :");
System.out.println(a);
Collections.reverse(a);
System.out.println("List after reversing :");
System.out.println(a);

}
}
