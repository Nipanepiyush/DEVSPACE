//Problem Given an integer n, determine whether it is: Positive Negative Zero

import java.util.*;
class PositiveNegative {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        System.out.println("|| CHECK WEATHER THE NO IS POSITIVE NEGATIVE OR ZERO ||");
        System.out.print("Enter the valid No: ");

        int num = sc.nextInt();

        if(num < 0) {
        System.out.print("The Number is Negative No: "+ num);
        }
        else if (num > 0){
            System.out.print("The Number is Positive: "+ num);
        }
        else{
            System.out.print("The Number is Zero: \"+ num");
        }

    }    
}
