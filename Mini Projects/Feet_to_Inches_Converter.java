import java.util.Scanner;

public class Program {
    //your code goes here
    static void convert (double foot) { 
        double inches = foot * 12; 
        
        System.out.println(inches); 
        } 
        
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        double num = sc.nextDouble(); 
        convert(num); 
        }
}
