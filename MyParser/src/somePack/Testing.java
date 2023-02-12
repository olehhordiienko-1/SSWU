package somePack;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Testing {
    public static void main(String[] args) {
        String s = "Hello World, I am Oleh, I am learning Java language at now.";
        Pattern pattern = Pattern.compile("[^aeiouyAEIOUY].{3}");
        Matcher matcher = pattern.matcher(s);
        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
