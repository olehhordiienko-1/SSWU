package Tester;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cash {
    public static void main(String[] args) {
        String str = "[{\"ccy\":\"EUR\",\"base_ccy\":\"UAH\",\"buy\":\"40.00000\",\"sale\":\"41.00000\"},{\"ccy\":\"USD\",\"base_ccy\":\"UAH\",\"buy\":\"39.40000\",\"sale\":\"39.90000\"}]";

        Pattern pattern = Pattern.compile("\\d+\\.\\d+");
        Matcher matcher = pattern.matcher(str);

        String EUR_UAH_BUY = "";
        String EUR_UAH_SALE = "";
        String USD_UAH_BUY = "";
        String USD_UAH_SALE = "";

        int counter = 0;
        while (matcher.find()) {
            if(counter == 0) {
                EUR_UAH_BUY = matcher.group();
                counter++;
            } else if(counter == 1) {
                EUR_UAH_SALE = matcher.group();
                counter++;
            } else if(counter == 2) {
                USD_UAH_BUY = matcher.group();
                counter++;
            } else {
                USD_UAH_SALE = matcher.group();
                counter++;
            }
        }
        String WEB_OUTPUT = "EUR: Buy = " + EUR_UAH_BUY + " Sale = " + EUR_UAH_SALE
                + "\nUSD: But = " + USD_UAH_BUY + " Sale = " + EUR_UAH_SALE;
        System.out.println(WEB_OUTPUT);
    }
}
