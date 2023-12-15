import java.util.Scanner;
public class swiDemo {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        System.out.println("What time is it?");
        int time = scanner.nextInt();

        switch (time) {
            case 10:
                System.out.println("The time is " + time + "\nTime to take some coffee!");

                break;
            case 12:
                System.out.println("The time is " + time + "\nTime for a run!");
                break;

            case 5:
                System.out.println("The time is "+ time + "\nTime to go to the gym");
                break;

            default:
                System.out.println("Time to relax!");
        }
    }
}
