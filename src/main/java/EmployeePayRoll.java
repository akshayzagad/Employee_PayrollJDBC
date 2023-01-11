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
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE employee_payroll SET salary=? WHERE id=?");
            preparedStatement.setDouble(1,60000000.0);
            preparedStatement.setInt(2, 3);
        }
        catch (Exception exception) {
            System.out.println(exception);
        }
    }
//    7249624563
}

