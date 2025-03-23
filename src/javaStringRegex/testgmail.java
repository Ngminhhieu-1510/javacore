package javaStringRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class testgmail {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$");
        Matcher matcher = pattern.matcher("hieugmail.com");
        System.out.println("Input String matches regex - " + matcher.matches());
    }
}
