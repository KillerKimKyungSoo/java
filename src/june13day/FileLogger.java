package june13day;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class FileLogger {
    private static final String LOG_FILE="button_log.txt";
    public static void log(String message){
        try(FileWriter fw = new FileWriter(LOG_FILE,true)){
            fw.write(LocalDateTime.now() + "-" + message + System.lineSeparator());
        }catch (IOException e){
            System.out.println("로그파일 쓰기 실패 " + e.getMessage());
        }
    }
}
