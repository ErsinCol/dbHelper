import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        dbHelper obj=new dbHelper();
        Connection connection=null;
        try {
            connection=obj.getConnection();
            System.out.println("Bağlantı sağlandı...");
        } catch (SQLException e) {
            obj.showErrorMessage(e);
        }finally {
            connection.close();
        }
    }
}
