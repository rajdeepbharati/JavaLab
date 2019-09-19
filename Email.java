import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Email {
    public static boolean isValid(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
                + "A-Z]{2,7}$";

        Pattern pattern = Pattern.compile(emailRegex);
        if (email == null) {
            return false;
        }
        return pattern.matcher(email).matches();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter email address: ");
        String email = sc.next();
        if (isValid(email)) {
            System.out.println("You entered: " + email);
            System.out.println("Email id: " + email.split("@")[0]);
            System.out.println("Email server address: " + email.split("@")[1]);
        } else {
            System.out.println("Please enter a valid email!!!");
        }
        sc.close();
    }
}