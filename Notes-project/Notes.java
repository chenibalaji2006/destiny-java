import java.util.Scanner;
public class Notes {
    static Scanner sc = new Scanner(System.in);
    public void open(){
        System.out.println("Welcome to NOTES");
        System.out.println("LOBBY : [A]List_Files [B]Read_Files [C]Write_Files [D]History");
        System.out.print("Enter your choice : ");
        String enter = sc.nextLine().toUpperCase().trim();
        NoteLister nl = new NoteLister();     
        NoteReader nr = new NoteReader();
        NoteWriter nw = new NoteWriter();
        WriterHistory wh = new WriterHistory();
        ReaderHistory rh = new ReaderHistory();
        if(enter.equals("A")){
            nl.listFolders();
        }
        else if(enter.equals("B")){
            String filesReaderName = nr.readFiles();
            rh.readerHistoryUpdater(filesReaderName);
        }
        else if(enter.equals("C")){
            String fileName = nw.writeFiles();
            wh.writerHistoryUpdater(fileName);
        }
        else if(enter.equals("D")){
            wh.writerHistoryPrinter();
            rh.readerHistoryPrinter();
        }
        else{
            System.out.println("invalid input....ErrOr..ErRor.erRor...!");
        }
    }
}
