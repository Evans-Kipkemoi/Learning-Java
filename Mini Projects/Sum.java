import  java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //your code goes here
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        int N = sc.nextInt();
        
        int sum = 0;
        int num = 1;
        
        while(num <= N){
            sum += num;
            num++;
        }
        System.out.println(sum);
    }

}
