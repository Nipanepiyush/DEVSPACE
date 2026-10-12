// Problem Given an integer, reverse its digits.

import java.util.*;
class ReverseNumber {
public static void main (String []args){

    Scanner sc = new Scanner(System.in);

       System.out.println("|| REVERSE THE GIVENN NO ||");
       System.out.print("Enter a Number to Reverse: ");

       int n = sc.nextInt();
       int rev = 0;
       
       while (n != 0) { 
        int digit = n % 10; 
        rev = rev * 10 + digit; 
         n = n / 10; 
                        }        
            System.out.println("Reversed Number: " + rev);
       

            }
        }
