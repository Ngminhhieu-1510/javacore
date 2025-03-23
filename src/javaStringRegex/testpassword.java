package javaStringRegex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class testpassword {
    public static void main(String[] args) {
        System.out.println("Run Password Checker");

        Pattern pattern = Pattern.compile("^(?!.*\\d{5})(?=.*[@!?&]).{8,}$");
        Matcher matcher = pattern.matcher("123gfdkl");
        System.out.println("Input String matches regex - " + matcher.matches());
    }
}
