mport java.util.Scanner;

class Demo{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("");
    int num = sc.nextInt();
    long fact = 1;
    
    for(int i = 1; i <= num; i++)
    {
        fact = fact * i;
    }
    System.out.println(fact);
   }
}
