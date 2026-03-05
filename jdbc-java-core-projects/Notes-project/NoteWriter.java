import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;
public class NoteWriter {
    static Scanner sc = new Scanner(System.in);
    public void writeFiles(){
        String name = sc.nextLine();
        File file = new File("/data/data/com.termux/files/home/storage/shared/fbi-folder/generics/notes/"+name);
        try(FileWriter writer = new FileWriter(file,true)){
            String addWrite = sc.nextLine();
            writer.write(addWrite);
        }
        catch(IOException e){
            System.out.println("Something went Wrong");
        }
    }
}
