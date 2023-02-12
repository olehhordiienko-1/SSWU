package TaskForExam;

public class taskForExam {
    public static void main(String[] args) {
        String firstText = "I originally approached Java as just another programming language. But as time " +
                "passed and I studied it more deeply. I began to see that the fundamental intent of " +
                "this language was different from other languages I had seen up to that point. " +
                "Programming is about managing complexity. The complexity of the problem you " +
                "want to solve. Laid upon the complexity of the machine in which it is solved.";
        String secondText = "Because of this complexity most of our programming projects fail. And yet of all " +
                "the programming languages of which I am aware. Almost none have gone all out " +
                "and decided that their main design goal would be to conquer the complexity of " +
                "developing and maintaining programs. Many language design decisions were made " +
                "with complexity in mind. But at some point there were always other issues that " +
                "were considered essential to be added into the mix.";

        System.out.println("[mean] average of first text: " + findAverageCountOfWordsInSpecifiedText(firstText));
        System.out.println("[mean] average of second text " + findAverageCountOfWordsInSpecifiedText(secondText));
        System.out.println("[substring] string with 4 words from two texts: "
                + createASubstringWithFirstTwoWordsAndLastTwoWordsInTexts(secondText, firstText));

    }

    public static double findAverageCountOfWordsInSpecifiedText(String text) {
        if (text.isEmpty()) {
            return 0;
        }

        String[] sentences = text.split("[.]");
        String[] words;

        double averageOfWordsInSentence = 0;
        for (String sentence : sentences) {
            words = sentence.trim().split(" ");
            averageOfWordsInSentence += words.length;
        }

        System.out.println(averageOfWordsInSentence);
        System.out.println(sentences.length);

        averageOfWordsInSentence /= sentences.length;



        return averageOfWordsInSentence;
    }

    public static String createASubstringWithFirstTwoWordsAndLastTwoWordsInTexts(String firstText, String secondText) {
        double averageOfFirstText = findAverageCountOfWordsInSpecifiedText(firstText);
        double averageOfSecondText = findAverageCountOfWordsInSpecifiedText(secondText);

        String[] tempForStart;
        String[] tempForEnd;

        if (averageOfFirstText > averageOfSecondText) {
            tempForStart = secondText.split(" ");
            tempForEnd = firstText.split(" ");
        } else {
            tempForStart = firstText.split(" ");
            tempForEnd = secondText.split(" ");
        }

        if (tempForStart.length > 1 & tempForEnd.length > 1) {
            return tempForStart[0] + " " + tempForStart[1] + " "
                    + tempForEnd[tempForEnd.length - 2] + " " + tempForEnd[tempForEnd.length - 1];
        } else {
            return "both texts must have more than two words!";
        }
    }
}
