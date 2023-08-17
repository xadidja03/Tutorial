import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentData {
    public static List<student> getAllStudentData() throws Exception{
        List<student> result = new ArrayList<>();
        try (Connection connection = ConnectDb.connect()) {
            Statement statement = connection.createStatement();
            statement.execute("SELECT *FROM student");
            ResultSet resultSet = statement.getResultSet();
            System.out.println("|id| |name| |surname| |subject| |monthly_payment||start_date||create_date||update_date||leave_date||status|");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                String subject = resultSet.getString("subject");
                Double monthly_payment = resultSet.getDouble("monthly_payment");
                LocalDate start_date= resultSet.getDate("start_date").toLocalDate();
                LocalDate create_date= resultSet.getDate("create_date").toLocalDate();
                LocalDate update_date= resultSet.getDate("update_date").toLocalDate();
                LocalDate leave_date= resultSet.getDate("leave_date").toLocalDate();
                int status= resultSet.getInt("status");
                System.out.println(id+name+surname+subject+monthly_payment+start_date+create_date+update_date+leave_date+status);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }return result;
    }
}
