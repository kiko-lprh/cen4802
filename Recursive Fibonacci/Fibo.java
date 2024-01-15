import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        
        int n;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        n = sc.nextInt();

        System.out.println("The " + n + "th term in the fibonacci sequence is: " + nthTerm(n));

    }

    public static int nthTerm(int n){
    
        if (n <= 1)
        return n;

        return nthTerm(n - 1) + nthTerm(n - 2);
    }

}

