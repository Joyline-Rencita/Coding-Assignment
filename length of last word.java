import java.util.Scanner;

public class Main {
    public int lengthOfLastWord(String a) {
        int len = 0;
        String x = a.trim();

        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == ' ')
                len = 0;
            else
                len++;
        }

        return len;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        Main mainObj = new Main();
        System.out.println("The length of the last word is: " + mainObj.lengthOfLastWord(input));

        scanner.close();
    }
}
