import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Created by natna on 4/26/2019.
 */
public class FileReader {


    public static void main(String[] args) {


        String filename = "D:\\Programming Ex\\sample.txt";
        Path path = Paths.get(filename);
        Stream<String> stream;
        List words=new ArrayList<String>();
        try {

            System.out.println("using scanner");

            Scanner scanner=new Scanner(path);
            while (scanner.hasNext()){

                String line=scanner.nextLine();
                System.out.println(line);
            }
            System.out.println("using stream");
            // read the contents of the file to a Stream
            stream = Files.lines(path);
            stream.forEach(l-> System.out.println(l));

            // System.out::println is the action to be done on each element, i.e., line in the file
          //  stream.forEach(System.out::println);
          //  stream.close();
            /*stream.forEach(line->

                    {
                        if (line.contains("dear"))
                            System.out.println(line);
                        else
                            System.out.println("Not polite");
                    }

            );*/

          /*  stream.forEach(line->
                    {
                        String [] wordSplit=line.split(" ");

                        for (String s: wordSplit)
                        {
                            StringBuffer sb=new StringBuffer(s);
                            words.add(sb.reverse());

                        }

                    }
            );
            Collections.reverse(words);
            words.forEach(i-> System.out.println(i));
            System.out.println("----folder check--------------");*/
          //  folderChecker();
        } catch (IOException e) {
            System.out.println("There is an exception because of the file. Please check.");
            e.printStackTrace();
        }
    }


    private static void folderChecker(){


        List<String> files = new ArrayList<>();
        List<String> directories = new ArrayList<>();

        File folder = new File("D:\\Programming Ex");
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                files.add(listOfFiles[i].getName());
            } else if (listOfFiles[i].isDirectory()) {
                directories.add(listOfFiles[i].getName());
            }
        }

        System.out.println("List of files :\n---------------");
        for(String fName: files) System.out.println(fName);

        System.out.println("\nList of directories :\n---------------------");
        for(String dName: directories) System.out.println(dName);
    }
}

