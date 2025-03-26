
import java.util.Scanner;
import java.util.ArrayList; 

// goal input three numbers in a list 
// append each with input
// get each number and add together with sum function

class Calculator {
    public int sum_3(ArrayList<Int> to_add){
        int sum = 0

        for (int i: to_add){
            sum + i
        }

        
        return sum;
    }
}

public class Main {
    public static void (String[] args) {
        Calculator new_calc = new Calculator();// <-- To create a new object and to be used on the main class
        Scanner int_calc = new Scanner(System.in);
        System.out.println("Add three numbers!!!")
        int i = 0
        ArrayList<Int> numbers = new ArrayList<Int>();
        

        if (i < 3) {
            System.out.println("Enter Number" + i);
            int number = int_calc.nextInt();
            numbers.add(number)
        }

        int_calc.sum_3(numbers)
        
    }
}