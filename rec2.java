/*WAP to calculate GCD of two numbers by using a recursive function
findGCD. */
import java.util.*;
public class rec2 {
    public static int findGCD(int n1,int n2){
        if (n2==0) {
            return n1;
        }
        return findGCD(n2, n1%n2);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter numbers(n1):");
        int n1 = sc.nextInt();
        System.err.println("Enter numbers(n2):");
        int n2 = sc.nextInt();

        int result = findGCD(n1, n2);
        System.out.println("GCD of "+ n1 + " & " + n2 + " is "+ result);
    }
}
