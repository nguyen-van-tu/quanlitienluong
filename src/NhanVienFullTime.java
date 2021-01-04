public class NhanVienFullTime extends NhanVien {
    private int hardSalary;
    private int bonus;
    private int punish;


    public NhanVienFullTime(int ID, String name, String phone, String email, int hardSalary, int bonus, int punish) {
        super(ID, name, phone, email);
        this.hardSalary = hardSalary;
        this.bonus = bonus;
        this.punish = punish;
    }

    public NhanVienFullTime() {

    }

    public int getHardSalary() {
        return hardSalary;
    }

    public void setHardSalary(int hardSalary) {
        this.hardSalary = hardSalary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getPunish() {
        return punish;
    }

    public void setPunish(int punish) {
        this.punish = punish;
    }

    @Override
    public String toString() {
        return "NhanVienFullTime{" +
                "hardSalary=" + hardSalary +
                ", bonus=" + bonus +
                ", punish=" + punish +
                '}';
    }

    public String display() {
        return super.toString();
    }

    public int getSalary(){
        return hardSalary + bonus - punish;
    }
}