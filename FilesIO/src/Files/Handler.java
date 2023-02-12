package Files;

import java.io.*;
import java.util.ArrayList;

public class Handler {
    public static void main(String[] args) throws IOException {
        File f1 = new File("/Users/olehhordiienko/Oleh/JavaCampSigma/SigmaSoftware/Projects/src/Sigma/Software/Files/file1");
        File f2 = new File("/Users/olehhordiienko/Oleh/JavaCampSigma/SigmaSoftware/Projects/src/Sigma/Software/Files/file2");
//        System.out.println(f1.exists());
//        System.out.println(f1.length());
        ArrayList<String> als = new ArrayList<>();
//        f2.createNewFile();
//        try {
            BufferedReader br = new BufferedReader(new FileReader(f1));
            String temp = "";
            while ((temp = br.readLine()) != null) {
                als.add(temp);
//                System.out.println(temp);
            }
            System.out.println(als);
            br.close();


            PrintWriter pw = new PrintWriter(f2);
            for (String str : als) {
                pw.println(str);
            }
            pw.flush();
            pw.close();
//        } catch (FileNotFoundException fileNotFoundException) {
//            System.out.println("FileNotFoundException");
//        } catch (IOException io) {
//            System.out.println("IOException");
//        }
    }
}
