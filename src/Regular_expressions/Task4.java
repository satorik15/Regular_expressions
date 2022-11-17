package Regular_expressions;
import java.util.Scanner;
import java.util.regex.*;
public class Task4
{
    public static void main(String[] args) {
        String regex = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$";
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        Pattern p2 = Pattern.compile(regex);
        Matcher m1 = p2.matcher(email);
        boolean b = m1.matches();
        System.out.println(b);
    }
}
