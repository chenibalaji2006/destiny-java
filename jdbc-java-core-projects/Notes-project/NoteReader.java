import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
public class NoteReader {
    static Scanner sc = new Scanner(System.in);
    public void readFiles(){
        String enter = sc.nextLine();
        File file  = new File("/data/data/com.termux/files/home/storage/shared/fbi-folder/generics/notes/"+enter);
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
                String line;
                while((line = reader.readLine()) != null){
                    System.out.println(line);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not found check the file name correctly");
        }
        catch(IOException e){
            System.out.println("An Error..eRroR..erRor..");
        }
    }
}
