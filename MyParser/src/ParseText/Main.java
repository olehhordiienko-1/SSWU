package ParseText;

public class Main {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua." +
                " Consectetur purus ut faucibus pulvinar elementum integer enim.";

        StringBuilder sb = new StringBuilder();
        int numberSent = 0;
        int counterVowels = 0;
        int counterConsonants = 0;

        char[] checking = text.toCharArray();
        for (char c : checking) {
            if (c == '.') {
                sb.append(numberSent).append(" sentence ").append(counterConsonants - counterVowels).append(" ");
                numberSent++;
                counterVowels = 0;
                counterConsonants = 0;
            }

            if(Character.isLetter(c)) {
                if (c == 'e' || c == 'i' || c == 'o'
                        || c == 'a' || c == 'u' || c == 'y') {
                    counterVowels++;
                } else {
                    counterConsonants++;
                }
            }
        }
        System.out.println(sb);
    }
}
