import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Created by natna on 5/3/2019.
 */
public class FileR {

    public static void main(String[] args) {
        try{

            String filename = "D:\\Programming Ex\\sample.txt";
            Path path = Paths.get(filename);
            Stream<String> stream= Files.lines(path);
            stream.forEach(x-> System.out.println(x));

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
