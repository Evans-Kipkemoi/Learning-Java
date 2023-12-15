import  java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        String[] menu = {"Tea", "Espresso", "Americano", "Water", "Hot Chocolate"};
        Scanner sc = new Scanner(System.in);
        int drinks = sc.nextInt();

        if (drinks > menu.length){
            System.out.println("Invalid");
        } else {
            System.out.println(menu[drinks]);
        }
        
    }

}
