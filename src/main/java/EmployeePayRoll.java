import java.sql.*;
import java.util.Enumeration;

public class EmployeePayRoll {
    public static void main(String[] args) throws SQLException {
        try {
            // below two lines are used for connectivity.
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/payroll_service",
                    "root", "Akshay@1997");
            Statement statement = connection.createStatement();

            int count = statement.executeUpdate("update employee_payroll set salary = \"300000000\" where id = 5");
            System.out.println(count);
            statement = connection.createStatement();
            statement.close();
            connection.close();
        }
        catch (Exception exception) {
            System.out.println(exception);
        }
    }
}

