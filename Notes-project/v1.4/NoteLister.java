import java.sql.*;
import java.sql.SQLException;
public class NoteLister {
    public void listFolders() {
        Info info = new Info();
        try(Connection connection = DriverManager.getConnection(info.getUrl(),info.getUser(),info.getPassword());
                PreparedStatement preparedStatement = connection.prepareStatement("SELECT id,book_name FROM storer")){
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
