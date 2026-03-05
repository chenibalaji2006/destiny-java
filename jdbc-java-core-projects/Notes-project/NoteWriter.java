import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;
public class NoteWriter {
    static Scanner sc = new Scanner(System.in);
    StringBuilder stringStore = new StringBuilder();
    public String writeFiles(){
        System.out.println("Enter Your File Name : ");
        String name = sc.nextLine();
        File file = new File("/data/data/com.termux/files/home/storage/shared/fbi-folder/generics/notes/"+name);
        while(true){
            String line = sc.nextLine();
            if(line.equalsIgnoreCase("exit")){
                System.out.println("txt saved in "+name);
                break;
            }
            stringStore.append(line).append(" ");
        }
        String[] addWrite = stringStore.toString().split("\\s+");
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file,true))){
            for(int i = 0;i<addWrite.length;i++){
            writer.write(addWrite[i]+" ");
            if((i+1)%10==0){
                writer.newLine();
            }
            }
        writer.close();
        System.out.println("thank you for using me");
        }
        catch(IOException e){
            System.out.println("Something went Wrong");
        }
        return name;
    }
}
