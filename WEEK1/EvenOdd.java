// Problem Given an integer n, determine whether the number is Even or Odd.

import java.util.*;

class EvenOdd {
    public static void main(String []args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("|| CHECK WHETHER THE GIVEN NO IS EVEN OR ODD || \n ");
        System.out.print("Enter the valid Number:");

        int n = sc.nextInt();

        if (n % 2 == 0)
            System.out.println("The Number is Even No:" + n);
        else
            System.out.print("The Number is Odd No:" + n);

    }
}