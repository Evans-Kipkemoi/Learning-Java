import java.util.Scanner;

public class Program {
    //your code goes here

    static double fahr(double temp) { 
        double result = (temp * 1.8) + 32; 
        return result; 
        } 
       
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble(); 

        System.out.println(fahr(c));
    }
}
