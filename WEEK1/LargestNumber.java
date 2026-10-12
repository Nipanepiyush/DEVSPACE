//Problem Given two integers a and b, find the larger number.

import java.util.*;
class LargestNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("|| CHECK THE GRATEST NUMBERAMONG A & B ||");
        System.out.print("Please Enter the value for A & B: ");

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b)
            System.out.print("A is the largest No: " + a);
        else
            System.out.print("B is the largest No: " + b);

    }

}
