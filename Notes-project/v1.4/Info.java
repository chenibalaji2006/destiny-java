public class Info {

    private final String url;
    private final String user;
    private final String password;
    public Info(){
        url = "jdbc:mariadb://localhost:3306/notes_history_manager";
        user = "root";
        password = "";
    }
    public String getUrl(){
        return url;
    }
    public String getUser(){
        return user;
    }
    public String getPassword(){
        return password;
    }
}
