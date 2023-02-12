package Binary;

public class Convert {
    public static void main(String[] args) {
        int b1 = 0b111111010010;
        int b2 = 0b001110111011;

        int mySum = 0b10110;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1 + b2);
        System.out.println(mySum);
    }
    // 1011 1100    0110    0001    0100    1110

    public static String convertDecimalToBinary(int value) {
        StringBuilder sb = new StringBuilder();

        while (value > 0) {
            sb.append(value % 2);
            value /= 2;
        }

        return sb.reverse().toString();
    }

    public static String convertDecimalToHexadecimal(int value) {
        StringBuilder sb = new StringBuilder();
        char[] allHexCharacters = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        while(value > 0) {
            sb.append(allHexCharacters[value%16]);
            value /= 16;
        }

        return sb.reverse().toString();
    }

    public static int convertHexadecimalToDecimal(String value) {
        value = value.toUpperCase();
        int decimalValue = 0;
        String allHexadecimalValues = "0123456789ABCDEF";

        for(int i = 0; i < value.length(); i++) {
            decimalValue = 16 * decimalValue + allHexadecimalValues.indexOf(value.charAt(i));
        }
        return decimalValue;
    }

    public static int convertHexadecimalToBinary(String value) {
        int decimal = convertHexadecimalToDecimal(value);
        return Integer.parseInt(convertDecimalToBinary(decimal));
    }

    public static int convertBinaryToDecimal(int value) {
        int decimal = 0;
        int degree = 0;

        while(value != 0) {
            decimal += value % 10 * Math.pow(2, degree);
            value /= 10;
            degree++;
        }

        return decimal;
    }

    public static String convertBinaryToHexadecimal(int value) {
        int decimal = convertBinaryToDecimal(value);
        return convertDecimalToHexadecimal(decimal);
    }
}
