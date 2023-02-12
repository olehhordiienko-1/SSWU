package TaskForFiles;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {
    public static class ComparatorByVolume implements Comparator<String[]> {
        @Override
        public int compare(String[] firstBottle, String[] secondBottle) {
            int result = Double.compare(Double.parseDouble(firstBottle[2]), Double.parseDouble(secondBottle[2]));
            if (result != 0) {
                return result;
            } else {
                result = firstBottle[3].compareTo(secondBottle[3]);
                if (result != 0) {
                    return result;
                } else {
                    return firstBottle[1].compareTo(secondBottle[1]);
                }
            }
        }
    }

    public static class ComparatorByBottle implements Comparator<String[]> {
        @Override
        public int compare(String[] firstBottle, String[] secondBottle) {
            int result = firstBottle[1].compareTo(secondBottle[1]);
            if (result != 0) {
                return result;
            } else {
                result = Double.compare(Double.parseDouble(firstBottle[2]), Double.parseDouble(secondBottle[2]));
                if (result != 0) {
                    return result;
                } else {
                    return firstBottle[3].compareTo(secondBottle[3]);
                }
            }
        }
    }

    public static class ComparatorByMaterial implements Comparator<String[]> {
        @Override
        public int compare(String[] firstBottle, String[] secondBottle) {
            int result = firstBottle[3].compareTo(secondBottle[3]);
            if (result != 0) {
                return result;
            } else {
                result = Double.compare(Double.parseDouble(firstBottle[2]), Double.parseDouble(secondBottle[2]));
                if (result != 0) {
                    return result;
                } else {
                    return firstBottle[1].compareTo(secondBottle[1]);
                }
            }
        }
    }

    public static Predicate<Double> isLessThanZeroDotFive = volume -> volume > 0 & volume < 0.51;

    public static Predicate<Double> isMoreThanZeroDotFive = volume -> volume > 0.5 && volume < 0.99;

    public static Function<String, Double> getVolume = line -> {
        double volume = 0.0;
        Matcher matcher = Pattern.compile("[0-9](\\.[0-9]*)?").matcher(line);
        while (matcher.find()) {
            volume = Double.parseDouble(matcher.group());
        }
        return volume;
    };

    public static void separateListBottlesForVolume() {
        try {
            File bottles = new File("/Users/olehhordiienko/Oleh/JavaCampSigma/SigmaSoftware" +
                    "/Projects/src/Sigma/Software/taskForFiles/InputFiles/Bottles");
            BufferedReader bottlesBufferedReader = new BufferedReader(new FileReader(bottles));
            bottlesBufferedReader.readLine(); // scip first line with abstract data

            // 0.5 <=
            File firstCategory = new File("/Users/olehhordiienko/Oleh/JavaCampSigma/SigmaSoftware" +
                    "/Projects/src/Sigma/Software/taskForFiles/OutputFiles/FirstCategory");
            PrintWriter firstWriter = new PrintWriter(firstCategory);

            // >= 0.51 && 0.99 <=
            File secondCategory = new File("/Users/olehhordiienko/Oleh/JavaCampSigma/SigmaSoftware" +
                    "/Projects/src/Sigma/Software/taskForFiles/OutputFiles/SecondCategory");
            PrintWriter secondWriter = new PrintWriter(secondCategory);

            // 1.0 >=
            File thirdCategory = new File("/Users/olehhordiienko/Oleh/JavaCampSigma/SigmaSoftware" +
                    "/Projects/src/Sigma/Software/taskForFiles/OutputFiles/ThirdCategory");
            PrintWriter thirdWriter = new PrintWriter(thirdCategory);

            String temp = "";
            double volume;
            while ((temp = bottlesBufferedReader.readLine()) != null) {
                volume = getVolume.apply(temp);
                if (isLessThanZeroDotFive.test(volume)) {
                    firstWriter.println(temp);
                } else if (isMoreThanZeroDotFive.test(volume)) {
                    secondWriter.println(temp);
                } else {
                    thirdWriter.println(temp);
                }
            }
            bottlesBufferedReader.close();

            firstWriter.flush();
            firstWriter.close();

            secondWriter.flush();
            secondWriter.close();

            thirdWriter.flush();
            thirdWriter.close();
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("FileNotFoundException, some files cannot exist, create them. Check API.");
        } catch (IOException ioException) {
            System.out.println("IOException, it may be in bf.readLine() etc. Check API.");
        } catch (Exception exception) {
            System.out.println("Another exception, may be invalid data entered or something else");
        } finally {
            System.out.println("Reading from bottles and writing to " +
                    "other files with specified categories successfully.");
        }
    }

    public static void sortDataInFilesByParameter(String choice) {
        switch (choice) {
            case "bottle" -> {
                refreshDataInFile("/Users/olehhordiienko/Oleh/JavaCampSigma/SigmaSoftware" +
                        "/Projects/src/Sigma/Software/taskForFiles/OutputFiles/FirstCategory", new ComparatorByBottle());
                refreshDataInFile("/Users/olehhordiienko/Oleh/JavaCampSigma/SigmaSoftware" +
                        "/Projects/src/Sigma/Software/taskForFiles/OutputFiles/SecondCategory", new ComparatorByBottle());
                refreshDataInFile("/Users/olehhordiienko/Oleh/JavaCampSigma/SigmaSoftware" +
                        "/Projects/src/Sigma/Software/taskForFiles/OutputFiles/ThirdCategory", new ComparatorByBottle());
            }
            case "material" -> {
                refreshDataInFile("/Users/olehhordiienko/Oleh/JavaCampSigma/SigmaSoftware" +
                        "/Projects/src/Sigma/Software/taskForFiles/OutputFiles/FirstCategory", new ComparatorByMaterial());
                refreshDataInFile("/Users/olehhordiienko/Oleh/JavaCampSigma/SigmaSoftware" +
                        "/Projects/src/Sigma/Software/taskForFiles/OutputFiles/SecondCategory", new ComparatorByMaterial());
                refreshDataInFile("/Users/olehhordiienko/Oleh/JavaCampSigma/SigmaSoftware" +
                        "/Projects/src/Sigma/Software/taskForFiles/OutputFiles/ThirdCategory", new ComparatorByMaterial());
            }
            default -> {
                refreshDataInFile("/Users/olehhordiienko/Oleh/JavaCampSigma/SigmaSoftware" +
                        "/Projects/src/Sigma/Software/taskForFiles/OutputFiles/FirstCategory", new ComparatorByVolume());
                refreshDataInFile("/Users/olehhordiienko/Oleh/JavaCampSigma/SigmaSoftware" +
                        "/Projects/src/Sigma/Software/taskForFiles/OutputFiles/SecondCategory", new ComparatorByVolume());
                refreshDataInFile("/Users/olehhordiienko/Oleh/JavaCampSigma/SigmaSoftware" +
                        "/Projects/src/Sigma/Software/taskForFiles/OutputFiles/ThirdCategory", new ComparatorByVolume());
            }
        }
    }

    public static void refreshDataInFile(String path, Comparator<String[]> comparator) {
        ArrayList<String[]> dataFromSpecifiedCategory = new ArrayList<>();
        try {
            File file = new File(path);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String temp = "";
            while((temp = reader.readLine()) != null) {
                dataFromSpecifiedCategory.add(temp.split(" "));
            }
            reader.close();

            dataFromSpecifiedCategory.sort(comparator);

            PrintWriter writer = new PrintWriter(file);
            for(String[] line : dataFromSpecifiedCategory) {
                writer.println(line[0] + " " + line[1] + " " + line[2] + " " + line[3]);
            }
            writer.flush();
            writer.close();
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("FileNotFoundException, some files cannot exist, create them. Check API.");
        } catch (IOException ioException) {
            System.out.println("IOException, it may be in bf.readLine() etc. Check API.");
        } catch (Exception exception) {
            System.out.println("Another exception, may be invalid data entered or something else");
        } finally {
            System.out.println("Data in the file with specified category was refreshed and sorted.");
        }
    }
}
