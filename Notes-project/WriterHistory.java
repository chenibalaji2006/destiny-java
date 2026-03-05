import java.sql.*;
import java.sql.SQLException;
public class WriterHistory {
    static private String url = "jdbc:mariadb://localhost:3306/notes_history_manager";
    static private String user = "root";
    static private String password = "";
    public void writerHistoryUpdater(String fileName){
        try(Connection connection = DriverManager.getConnection(url,user,password)){
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO writer_history (book_name,last_opened) VALUES (?,NOW())");
            preparedStatement.setString(1,fileName);
            preparedStatement.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            System.out.println("");
        }
    }
    public void writerHistoryPrinter(){
        try(Connection connection = DriverManager.getConnection(url,user,password)){
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM writer_history");
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                System.out.println(resultSet.getString("book_name")+" last_opened : "+resultSet.getTimestamp("last_opened"));
            }
        }
        catch(SQLException t){
            t.printStackTrace();
        }
        finally{
            System.out.println("");
        }
    }
}
