import java.sql.*;
import java.sql.SQLException;
public class NoteLister {
    public void listFolders() {
        String url = "jdbc:mariadb://localhost:3306/notes_history_manager";
        String user = "root";
        String password = "";
        try(Connection connection = DriverManager.getConnection(url,user,password)){
                PreparedStatement preparedStatement = connection.prepareStatement("SELECT id,book_name FROM storer");
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt("id")+". "+resultSet.getString("book_name"));
                }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            System.out.println("your list");
        }
    }
}
