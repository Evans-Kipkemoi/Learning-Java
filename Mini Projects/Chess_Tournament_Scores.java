public class Program {
    public static void main(String[] args) {
        int wins = 54;
        int ties = 31;

        double points = (wins + (ties * 0.5));
        System.out.println(points);
    }
}
