import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //System.out.println(args[0]);


        Scanner scanner = new Scanner(System.in);

        workCycle(scanner, args);

    }

    public static void workCycle(Scanner scanner, String[] args) {
        String userMessage;

        while (true) {
            userMessage = scanner.next().toLowerCase();

            for (String tmp : args) {
                if (checkMessage(userMessage, tmp)) {
                    System.out.println(userMessage);
                }
            }

        }
    }

    public static boolean checkMessage(String userMessage, String tmp) {
        if (tmp.contains("\\")) {
            return userMessage.matches(tmp);
        } else {
            return userMessage.contains(tmp.toLowerCase());
        }
    }
}


