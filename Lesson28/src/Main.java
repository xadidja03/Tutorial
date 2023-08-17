
public class Main {
    public static void main(String[] args) throws Exception {
        if (ConnectDb.connect() != null) {
            System.out.println("Connected DB is successfully!");
        }
        ConnectDb.connect();
        System.out.println(StudentData.getAllStudentData());

    }


}

