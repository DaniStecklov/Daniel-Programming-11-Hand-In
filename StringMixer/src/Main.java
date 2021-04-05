import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please Enter a word.");
        Scanner Scan = new Scanner(System.in); // makes a scanner
        String WordChoice = (Scan.next());

        int WordLength = WordChoice.length();
        String Mixer = WordChoice.substring(WordLength - 2) + "x" + WordChoice.substring(0, WordLength - 2);
        System.out.println(Mixer);

        String UnMix = Mixer.substring(Mixer.length() - (Mixer.length() - 3), Mixer.length()) + Mixer.substring(0, 2);
        System.out.println(UnMix);
    }
}
