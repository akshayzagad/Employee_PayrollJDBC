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
            ResultSet resultSet = statement.executeQuery("select * from employee_payroll");
            int id;
            String name;
            double salary;
            Date date;
            while (resultSet.next()) {
                id = resultSet.getInt("id");
                name = resultSet.getString("name").trim();
                salary = resultSet.getDouble("salary");
                date = resultSet.getDate("start_date");
                System.out.println("id : " + id
                        + ", name : " + name + ", salary : " + salary
                        + ", start_date : " + date);
            }
            resultSet.close();
            statement = connection.createStatement();
            statement.close();
            connection.close();
        }
        catch (Exception exception) {
            System.out.println(exception);
        }
    }
}

