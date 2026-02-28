import java.util.Scanner;
public class Notes {
    static Scanner sc = new Scanner(System.in);
    public void open(){
        System.out.println("Welcome to NOTES");
        System.out.println("LOBBY : [A]List_Files [B]Read_Files [C]Write_Files");
        System.out.print("Enter your choice : ");
        String enter = sc.nextLine().toUpperCase().trim();
        NoteLister nl = new NoteLister();     
        NoteReader nr = new NoteReader();
        NoteWriter nw = new NoteWriter();
        if(enter.equals("A")){
            nl.listFolders();
        }
        else if(enter.equals("B")){
            nr.readFiles();
        }
        else if(enter.equals("C")){
            nw.writeFiles();
        }
        else{
            System.out.println("invalid inpot....ErrOr..ErRor.erRor...!");
        }
    }
}
