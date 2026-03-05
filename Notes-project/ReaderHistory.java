import java.sql.*;
import java.sql.SQLException;
public class ReaderHistory {
    static String url = "jdbc:mariadb://localhost:3306/notes_history_manager";
    static String user = "root";
    static String password = "";
    public void readerHistoryUpdater(String fileReaderName){
        try(Connection connection = DriverManager.getConnection(url,user,password)){
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO reader_history (book_name,last_opened) VALUES(?,NOW())");
            preparedStatement.setString(1,fileReaderName);
            preparedStatement.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            System.out.println(" ");
        }
    }
    public void readerHistoryPrinter(){
        try(Connection connection = DriverManager.getConnection(url,user,password)){
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM reader_history");
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                System.out.println(resultSet.getString("book_name")+" last_opened : "+resultSet.getTimestamp("last_opened"));
            }
        }
        catch(SQLException w){
            w.printStackTrace();
        }
        finally{
            System.out.println(" ");
        }
    }
}
