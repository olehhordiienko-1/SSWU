package APis;

import java.util.ArrayList;
import java.util.Arrays;

public class taskForAPI {
    public static void main(String[] args) {
        taskForAPI taskForApi = new taskForAPI();
        String text = "Best-selling author Herbert Schildt has written extensively about programming for over three decades and is a leading authority on the Java language. " +
                "His books have sold millions of copies worldwide and have been translated into all major foreign languages. " +
                "He is the author of numerous books on Java, including Java: A Beginner’s Guide, Herb Schildt’s Java Programming Cookbook, Introducing JavaFX 8 Programming, and Swing: A Beginner’s Guide.";

//        taskForApi.doAllFirstLettersToUpperCase(text);
//        taskForApi.replaceAllWordsForSpecifiedLengthToNewWords(text, 7, "REPLACED");
//        taskForApi.pasteSpecifiedWordAfterSpecifiedSubstring(text, "ing", "JAVA");
//        taskForApi.pasteSpecifiedSubstringAfterWordsWithSpecifiedLength(text, 7, "JAVA");
//        taskForApi.createCollectionForWordsWithEqualsFirstAndEndLetters("Helloh Javaj Worldw I am Johnny, oh, I am so busy.");
//        taskForApi.createTwoCollectionForMaxAndMinWordsForLength(text);
//        taskForApi.swapAllFirstAndLastWordsInSentences(text);
//        taskForApi.classifyArrayToTwoCollectionForNegativeAndPositive(new int[]{-4, -3, -2, -1, 0, 1, 2, 3, 4});
//        taskForApi.defineAveragesTwoArraysAndCreateNewCollectionWithinAverages(new int[]{20, 20, 20, 20}, new int[]{3, 6, 9, 12, 15});
//        taskForApi.deleteDuplicatesMaxAndMinFromArray(new int[]{11, 5, 14, 4, 14, 4, 3, 1, 2, 1, 1, 1});
    }

    // 1.1. Зробити великими перші букви у кожному слові тексту
    public void doAllFirstLettersToUpperCase(String text) {
        String[] words = text.split(" ");
        String resultText = "";
        for (String word : words) {
            resultText = resultText.concat(word.substring(0, 1).toUpperCase() +
                    word.substring(1) + " ");
        }
        System.out.println(resultText);
    }

    // 1.2. В тексті слова заданої довжини заміниті вказаним підрядком довільної довжини
    public void replaceAllWordsForSpecifiedLengthToNewWords(String text, int length, String replacer) {
        String[] words = text.split(" ");
        String resultText = "";
        for (String word : words) {
            if (word.length() == length) {
                resultText = resultText.concat(replacer + " ");
            } else {
                resultText = resultText.concat(word + " ");
            }
        }
        System.out.println(resultText);
    }

    // 1.3. Після кожного слова тексту, що закінчується заданим підрядком, вставити
    // вказане слово
    public void pasteSpecifiedWordAfterSpecifiedSubstring(String text, String suffix, String specifiedWord) {
        String[] words = text.split(" ");
        String resultText = "";
        for (String word : words) {
            if (word.endsWith(suffix)) {
                resultText = resultText.concat(word + " " + specifiedWord + " ");
            } else {
                resultText = resultText.concat(word + " ");
            }
        }
        System.out.println(resultText);
    }

    // 1.4. В тексті до кожного слова з довжиною, більшою за k символів, вставити заданий
    // підрядок після k-го символу
    public void pasteSpecifiedSubstringAfterWordsWithSpecifiedLength(String text, int length, String substring) {
        String[] words = text.split(" ");
        String resultText = "";
        for (String word : words) {
            if (word.length() > length) {
                resultText = resultText.concat(word + substring + " ");
            } else {
                resultText = resultText.concat(word + " ");
            }
        }
        System.out.println(resultText);
    }

    // 1.5. Утворити колекцію зі слів тексту, в яких перша і остання букви співпадають
    public void createCollectionForWordsWithEqualsFirstAndEndLetters(String text) {
        ArrayList<String> specifiedWords = new ArrayList<>();
        String[] words = text.toLowerCase().split(" ");
        for (String word : words) {
            if (word.charAt(0) == word.charAt(word.length() - 1)) {
                specifiedWords.add(word);
            }
        }
        System.out.println(specifiedWords);
    }

    // 1.6. Утворити дві колекції зі слів тексту максимальної та слів мінімальної довжини,
    public void createTwoCollectionForMaxAndMinWordsForLength(String text) {
        int maxLength = Integer.MIN_VALUE;
        int minLength = Integer.MAX_VALUE;
        String[] words = text.toLowerCase().split(" ");

        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
            }
            if (word.length() < minLength) {
                minLength = word.length();
            }
        }

        ArrayList<String> wordsMaxLength = new ArrayList<>();
        ArrayList<String> wordsMinLength = new ArrayList<>();
        for (String word : words) {
            if (word.length() == maxLength) {
                wordsMaxLength.add(word);
            }
            if (word.length() == minLength) {
                wordsMinLength.add(word);
            }
        }

        System.out.println("words with max length " + wordsMaxLength);
        System.out.println("words with min length" + wordsMinLength);
    }


    // 1.7. В кожному реченні тексту поміняти місцями перше слово з останнім
    // (припускаємо, що всі речення закінчуються тільки крапкою).
    public void swapAllFirstAndLastWordsInSentences(String text) {
        String[] sentences = text.split("[.]");
        String resultStr = "";
        String[] words;

        for (String sentence : sentences) {
            words = sentence.trim().split(" ");
            for (int index = 0; index < words.length; index++) {
                if (index == 0) {
                    resultStr = resultStr.concat(words[words.length - 1] + " ");
                } else if (index == words.length - 1) {
                    resultStr = resultStr.concat(words[0] + ". ");
                } else {
                    resultStr = resultStr.concat(words[index] + " ");
                }
            }
        }
        System.out.println("Before swap: " + text);
        System.out.println("After swap: " + resultStr);
    }

    // 2.1. Масив розділити на дві колекції з від’ємних та додатніх чисел
    public void classifyArrayToTwoCollectionForNegativeAndPositive(int[] array) {
        ArrayList<Integer> positiveNumbers = new ArrayList<>();
        ArrayList<Integer> negativeNumbers = new ArrayList<>();

        for (int number : array) {
            if (number < 0) {
                negativeNumbers.add(number);
            } else {
                positiveNumbers.add(number);
            }
        }
        System.out.println("positive numbers: " + positiveNumbers);
        System.out.println("negative numbers: " + negativeNumbers);
    }

    // 2.2. Визначити середні арифметичні двох масивів, утворити колекцію з елементів
    // обидвох масивів, що знаходяться в межах між значеннями середніх арифметичних
    public void defineAveragesTwoArraysAndCreateNewCollectionWithinAverages(int[] firstArray, int[] secondArray) {
        double averageFirstArray = 0;
        double averageSecondArray = 0;

        for (int value : firstArray) {
            averageFirstArray += value;
        }
        averageFirstArray /= firstArray.length;
        System.out.println(averageFirstArray);

        for (int value : secondArray) {
            averageSecondArray += value;
        }
        averageSecondArray /= secondArray.length;
        System.out.println(averageSecondArray);

        ArrayList<Integer> numbersBetweenAverages = new ArrayList<>();
        double firstBound = Math.min(averageFirstArray, averageSecondArray);
        double secondBound = Math.max(averageFirstArray, averageSecondArray);

        for (int value : firstArray) {
            if (value > firstBound && value < secondBound) {
                numbersBetweenAverages.add(value);
            }
        }

        for (int value : secondArray) {
            if (value > firstBound && value < secondBound) {
                numbersBetweenAverages.add(value);
            }
        }
        System.out.println("first array: " + Arrays.toString(firstArray) + " has average " + averageFirstArray);
        System.out.println("second array: " + Arrays.toString(secondArray) + " has average " + averageSecondArray);
        System.out.println("arrays with numbers between this averages: " + numbersBetweenAverages);
    }

    // 2.3. З масиву видалити дублікати максимума та мінімума (уточнення: видалити саме
    // дублікати, тобто перші значення максимума та мінімума необхідно залишити, інший
    // варіант – залишити останні значення максимума та мінімума).
    public void deleteDuplicatesMaxAndMinFromArray(int[] array) {
        int maxNumber = Integer.MIN_VALUE;
        int indexOfMax = 0;
        int minNumber = Integer.MAX_VALUE;
        int indexOfMin = 0;

        for (int i = 0; i < array.length; i++) {
            if (maxNumber < array[i]) {
                maxNumber = array[i];
                indexOfMax = i;
            }
            if (minNumber > array[i]) {
                minNumber = array[i];
                indexOfMin = i;
            }
        }

        ArrayList<Integer> arrayWithoutDuplicates = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != maxNumber & array[i] != minNumber) {
                arrayWithoutDuplicates.add(array[i]);
            } else {
                if (i == indexOfMax | i == indexOfMin) {
                    arrayWithoutDuplicates.add(array[i]);
                }
            }
        }
        System.out.println("array before deleting duplicates: " + Arrays.toString(array));
        System.out.println("array after deleting duplicates: " + arrayWithoutDuplicates);
    }
}