mport java.util.Scanner;

public class Program {
    
    public static void main(String[] args) {
        int[][] seats = {
        {0, 0, 0, 1, 1, 1, 0, 0, 1, 1},
        {1, 1, 0, 1, 0, 1, 1, 0, 0, 0},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
        {0, 1, 1, 1, 0, 0, 0, 1, 1, 1}
        };
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt(); 
        int y= sc.nextInt(); 
        int status= seats[x][y]; 
        
        if(status == 0){
             System.out.print("Free"); 
             }
             else
             { 
                 System.out.print("Sold");
                  }
        

    }

}
