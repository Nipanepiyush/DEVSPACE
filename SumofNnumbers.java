//Problem Given n, calculate: 1 + 2 + 3 + ... + n

import java.util.*;

class SumofNnumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("|| CALCULATE THE SUM OF ALL N NUMBERS ||");
        System.out.print("Enter valid Number: ");

        int num = sc.nextInt();
        int sum = num * (num + 1) / 2;

        System.out.print("The sum of N Number is: " + sum);

    }

}
