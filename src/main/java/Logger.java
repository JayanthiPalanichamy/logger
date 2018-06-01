import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    public boolean errorLog(String message) {
        System.out.println(message);
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
        return true;
    }
}
