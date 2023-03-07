import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        var hello = 3;
        System.out.println(hello);
        String temp = "ab,";
        Pattern pattern = Pattern.compile("\\p{Punct}");
        Matcher matcher;
        int length = temp.length();
        if(Pattern.matches("\\p{Punct}", temp.substring(length - 1))) {
            System.out.println("some");
            System.out.println(temp.substring(0, length - 2) + temp.substring(length - 2).toUpperCase());
        }


        /*
        if(temp.length() > 1) {
            System.out.println(temp.substring(0, 1).toUpperCase() + temp.substring(1));
        } else {
            System.out.println(temp.toUpperCase());
        }

        if(temp.length() > 1) {
            System.out.println(temp.substring(0, temp.length() - 1) + temp.substring(temp.length() - 1).toUpperCase());
        } else {
            System.out.println(temp.toUpperCase());
        }*/

    }


}
