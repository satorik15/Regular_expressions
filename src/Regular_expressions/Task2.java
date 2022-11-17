package Regular_expressions;
import java.util.Scanner;
import java.util.regex.*;
public class Task2
{
    public static void main(String[] args)
    {
        String regex= "abcdefghijklmnopqrstuv18340";
        Scanner scanner= new Scanner(System.in);
        String input= scanner.nextLine();
        boolean p1= Pattern.matches(regex,input);
        System.out.println(p1);

        System.out.println("Second variant");
        Pattern p2 = Pattern.compile(regex);
        Matcher m1 = p2.matcher(input);
        boolean b = m1.matches();
        System.out.println(b);

    }
}
