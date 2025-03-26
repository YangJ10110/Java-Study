
import java.util.Scanner;

// goal input three numbers in a list 
// append each with input
// get each number and add together with sum function


public class Calculator {
    public static void main(String[] args) {
        Summ_3 new_calc = new Summ_3();// <-- To create a new object and to be used on the main class
        Scanner int_calc = new Scanner(System.in);
        System.out.println("Add three numbers!!!");
        int i = 0;
        int count = 1;
        // ArrayList<Int> numbers = new ArrayList<Int>();
        int[] numbers = new int[3];
        
        System.out.println("Enter Three Numbers ");

        while (i < 3) {
            

            int number = int_calc.nextInt();
            numbers[i] = number;
            count = count + 1;
            i = i+1;
        }

        int result = new_calc.sum_3(numbers);
        System.out.println("Result: ");
        System.out.println(result);
        
    }
}

class Summ_3 {
    public int sum_3(int[] array){
        int sum = 0;

        for (int i: array){
            sum = sum + i;
        }

        // for (int i=0; i< to_add.length; i++){
        //     sum + to_add[i];
        // }
        
        return sum;
    }
}

