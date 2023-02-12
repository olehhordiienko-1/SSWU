package TaskForExam;

public class refactoredBySerhiy {
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

        refactoredBySerhiy rf = new refactoredBySerhiy();
        System.out.println(rf.findAverageCountOfWordsInSpecifiedText(firstText));
        System.out.println(rf.findAverageCountOfWordsInSpecifiedText(secondText));
    }

    public double findAverageCountOfWordsInSpecifiedText(String text) {
        char[] convertedText = text.toCharArray();
        double countOfWord = 1;
        double countOfSentences = 0;

        for(char character : convertedText) {
            if(character == ' ') {
                countOfWord++;
            }

            if(character == '.') {
                countOfSentences++;
            }
        }

        System.out.println(countOfWord);
        System.out.println(countOfSentences);

        return countOfWord / countOfSentences;
    }
}
