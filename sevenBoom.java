import java.util.Scanner;
public class sevenBoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInputArray = scanner.nextLine();
        String output = "";
        for (int i = 0; i < userInputArray.length(); i++) {
            if (userInputArray.toCharArray()[i] == '7') {
                output = "Boom!";
                break;
            }
        }
        if (output.equals("")) {
            System.out.println("There is no seven in this string.");
        } else {
            System.out.println(output);
        }
    }
}