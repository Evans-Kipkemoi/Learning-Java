import  java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        
        if (age > 0 && age <= 11){
            System.out.println("Child");
            
            }
            if (age >= 12 && age <= 17){
            System.out.println("Teen");
            }
            
            if (age >= 18 && age <= 64){
            System.out.println("Adult");
            }
    }
}
