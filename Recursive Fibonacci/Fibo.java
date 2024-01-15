import java.util.Scanner;


/**
 * Fibo.java
 * This program calculates and displays the nth term of the Fibonacci sequence.
 * 
 * @author Diego Cordero
 * @version 1
 * @date January 15, 2024
 * @course CEN 4802C - SOFTWARE INTEGRATION, CONFIGURATION, AND TESTING
 */
public class Fibo {
    
    /**
     * Main method to take user input and display the nth term of the Fibonacci sequence.
     * 
     * @param args  command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        
        int n;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        n = sc.nextInt();

        System.out.println("The " + n + "th term in the fibonacci sequence is: " + nthTerm(n));

        sc.close();
    }

    /**
     * Finds and returns the nth term of the Fibonacci sequence.
     * 
     * @param n  the position of the desired Fibonacci term
     * @return   the nth term of the Fibonacci sequence
     */
    public static int nthTerm(int n){
    
        if (n <= 1)
        return n;

        return nthTerm(n - 1) + nthTerm(n - 2);
    }

}

