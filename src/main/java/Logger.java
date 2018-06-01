import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    public boolean errorLog(String message, boolean logOnConsole, boolean logOnFile, boolean logOnDatabase) {
        if (logOnConsole) {
            System.out.println(message);
        }
        if (logOnFile) {
            File file = new File("ErrorMessage.txt");
            FileWriter fr = null;
            try {
                fr = new FileWriter(file);
                fr.write(message);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        if(logOnDatabase){
            //logging in database
        }
        return true;
    }
}
