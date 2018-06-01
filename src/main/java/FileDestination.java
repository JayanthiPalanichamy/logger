import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDestination implements Loggable {
    @Override
    public void logMessage(String message) {
        File file = new File("ErrorMessage.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file);
            fr.write(message);
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            //close resources
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
