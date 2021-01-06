

public class EmployeePartTime extends Employee {
    private int numTime;



    public EmployeePartTime(int ID, String name, String phone, String email, int numTime) {
        super(ID, name, phone, email);
        this.numTime = numTime;
    }

    public EmployeePartTime() {

    }

    public int getNumTime() {
        return numTime;
    }

    public void setNumTime(int numTime) {
        this.numTime = numTime;
    }

    @Override
    public String toString() {
        return "NhanVienPartTime{" +
                "numTime=" + numTime +
                '}';
    }
    public int getSalary() {
        return numTime*100000;
    }
}
