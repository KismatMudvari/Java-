import java.util.*;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Corrected the case of the variable
        int a = sc.nextInt();  // Using the correct variable name `sc`
        int b = sc.nextInt();  // Using the correct variable name `sc`
        int sum = a + b;
        System.out.println(sum);  // Print the value of sum, not the string "sum"
    }
}
