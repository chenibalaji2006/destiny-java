import java.io.File;
public class NoteLister {
    public void listFolders() {
        File folder = new File("/data/data/com.termux/files/home/storage/shared/fbi-folder/generics/notes");
        File[] files = folder.listFiles();
        if(files != null){
            for(File file : files){
                System.out.println(file.getName());
            }
        }
        else{
            System.out.println("File not found or the Folder is Empty");
        }
    }
}
