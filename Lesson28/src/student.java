import java.time.LocalDate;

public class student {

    private String name;
    private String surname;
    private int id;
    private String subject;
    private double monthly_payment;
    private LocalDate start_date;
    private LocalDate create_date;
    private LocalDate update_date;
    private LocalDate leave_date;
    private int status;

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                ", subject='" + subject + '\'' +
                ", monthly_payment=" + monthly_payment +
                ", start_date=" + start_date +
                ", create_date=" + create_date +
                ", update_date=" + update_date +
                ", leave_date=" + leave_date +
                ", status=" + status +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getMonthly_payment() {
        return monthly_payment;
    }

    public void setMonthly_payment(double monthly_payment) {
        this.monthly_payment = monthly_payment;
    }

    public LocalDate getStart_date() {
        return start_date;
    }

    public void setStart_date(LocalDate start_date) {
        this.start_date = start_date;
    }

    public LocalDate getCreate_date() {
        return create_date;
    }

    public void setCreate_date(LocalDate create_date) {
        this.create_date = create_date;
    }

    public LocalDate getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(LocalDate update_date) {
        this.update_date = update_date;
    }

    public LocalDate getLeave_date() {
        return leave_date;
    }

    public void setLeave_date(LocalDate leave_date) {
        this.leave_date = leave_date;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public student(String name, String surname, int id, String subject, double monthly_payment,LocalDate start_date, LocalDate create_date, LocalDate update_date, LocalDate leave_date, int status) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.subject = subject;
        this.monthly_payment = monthly_payment;
        this.start_date = start_date;
        this.create_date = create_date;
        this.update_date = update_date;
        this.leave_date = leave_date;
        this.status = status;
    }
}
