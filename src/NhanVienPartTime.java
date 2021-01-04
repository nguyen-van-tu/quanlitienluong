

public class NhanVienPartTime extends  NhanVien{
    private int numTime;



    public NhanVienPartTime(int ID, String name, String phone, String email, int numTime) {
        super(ID, name, phone, email);
        this.numTime = numTime;
    }

    public NhanVienPartTime() {

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
