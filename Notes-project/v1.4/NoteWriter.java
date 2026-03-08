import java.util.Scanner;
import java.sql.*;
import java.sql.SQLException;
public class NoteWriter {
    static Scanner sc = new Scanner(System.in);
    StringBuilder sd = new StringBuilder();
    public String writeFiles(){
        System.out.println("Enter your book_name :");
        String name = sc.nextLine();
        Info info = new Info();
        while(true){
            String line = sc.nextLine();
            if(line.equalsIgnoreCase("exit")){
                System.out.println("txt saved in "+name);
                break;
            }
            sd.append(line).append("\n");
        }
        try(Connection connection = DriverManager.getConnection(info.getUrl(),info.getUser(),info.getPassword());
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE storer SET notes = ? WHERE book_name =?")){
            preparedStatement.setString(1,sd.toString());
            preparedStatement.setString(2,name);
            preparedStatement.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            System.out.println("Notes saved");
        }
        return name;
    } 
}
