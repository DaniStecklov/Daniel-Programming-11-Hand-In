import java.util.Scanner;

public class RandomGen {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            double rand = Math.random() * 3;
            int Random = (int) rand + 1;
            int choice = Integer.parseInt(scan.next());
            System.out.println(choice);
            if (Random == 1) {
                System.out.println("Rock");
            } else if (Random == 2) {
                System.out.println("Paper");
            } else {
                System.out.println("Scissors");
            }
    }
}
