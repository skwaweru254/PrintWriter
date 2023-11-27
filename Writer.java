import java.io.FileWriter;
import java.io.PrintWriter;

/**
 * Writer
 */
public class Writer {

    public static void main(String[] args) {
        try {
            FileWriter filename = new FileWriter("/home/mspace/Java/PrintWriter/output.txt");
            PrintWriter filewriter = new PrintWriter(filename);

            filewriter.print("Working at MSpace Solution Limited");
            filewriter.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}