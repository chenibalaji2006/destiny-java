import java.sql.*;
import java.sql.SQLException;
import java.util.Scanner;
public class NoteReader {
   static Scanner sc = new Scanner(System.in);
    Info info = new Info();
    public String readFiles(){
        String name = sc.nextLine();
        try(Connection connection = DriverManager.getConnection(info.getUrl(),info.getUser(),info.getPassword());
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT notes FROM storer WHERE book_name=?")){
            preparedStatement.setString(1, name);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                System.out.println(resultSet.getString("notes"));
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            System.out.println("");
        }
        return name;
    }
}
