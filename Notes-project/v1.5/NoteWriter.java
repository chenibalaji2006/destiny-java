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
        try(Connection connection1 = DriverManager.getConnection(info.getUrl(),info.getUser(),info.getPassword());
            PreparedStatement preparedStatement1 = connection1.prepareStatement("SELECT notes FROM storer WHERE book_name =?")){
            preparedStatement1.setString(1, name);
            ResultSet resultSet = preparedStatement1.executeQuery();
            if(!resultSet.next()){
                try(Connection connection = DriverManager.getConnection(info.getUrl(),info.getUser(),info.getPassword());
                    PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO storer (book_name) VALUES(?)")){
                    preparedStatement.setString(1, name);
                    preparedStatement.executeUpdate();
                    }
                catch(SQLException e){
                    System.out.println("error :"+e.getMessage());
                    e.printStackTrace();
                }
            }
            }
            catch(SQLException e){
                System.out.println("error:"+e.getMessage());
                e.printStackTrace();
            }
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
            System.out.println("erroe"+e.getMessage());
            e.printStackTrace();
        }
        finally{
            System.out.println("Notes saved");
        }
        return name;
    } 
}
