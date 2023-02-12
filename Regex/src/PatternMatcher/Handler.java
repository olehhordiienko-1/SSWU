package PatternMatcher;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Handler {
    public static void main(String[] args) {
//        Pattern p = Pattern.compile("Java");
//        Matcher m = p.matcher("java, Javanese, ProJava");
//        while(m.find()) {
//            System.out.println(m.start() + " " + m.end());
//        }

//        Pattern p = Pattern.compile("[a-zA-Z]*[jJ]ava[^,]*");
//        Matcher m = p.matcher("java, Javanese, ProJava");
//        Pattern p = Pattern.compile("[a-z]*+\\d+");
//        Matcher m = p.matcher("cab32424");
//        while(m.find()) {
//            System.out.println(m.group());
//        }

        String s = "123 4567 890";
        Scanner scanner = new Scanner(s);
        while(scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }


    }
}
