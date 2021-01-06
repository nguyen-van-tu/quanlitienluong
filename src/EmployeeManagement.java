import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagement {
    ArrayList<EmployeeFullTime> fullTimes = new ArrayList<>();
    ArrayList<EmployeePartTime> partTimes = new ArrayList<>();
    ArrayList<Employee> nvs = new ArrayList<>();
    Scanner sc = new Scanner(System.in);


    public void addEmployeeFullTime() {
        EmployeeFullTime ft = new EmployeeFullTime();
        Employee nv = new Employee();
        System.out.println("Nhập tên");
        String name = sc.nextLine();
        nv.setName(name);
        System.out.println("Nhập mã nhân viên");
        int id = Integer.parseInt(sc.nextLine());
        nv.setID(id);
        System.out.println("Nhập sđt");
        String sdt = (sc.nextLine());
        nv.setPhone(sdt);
        System.out.println("Nhập email");
        String email = sc.nextLine();
        nv.setEmail(email);
        nvs.add(nv);
        System.out.println("Nhập lương cứng");
        int lc = Integer.parseInt(sc.nextLine());
        ft.setHardSalary(lc);
        System.out.println("Nhập tiền thưởng");
        int tt = Integer.parseInt(sc.nextLine());
        ft.setBonus(tt);
        System.out.println("Nhập tiền phạt");
        int tp = Integer.parseInt(sc.nextLine());
        ft.setPunish(tp);

        ft.setName(name);
        ft.setID(id);
        ft.setPhone(sdt);
        ft.setEmail(email);
        fullTimes.add(ft);

    }

    public void addEmployeePartTime(){
        Employee nv = new Employee();
        EmployeePartTime pt = new EmployeePartTime();
        System.out.println("Nhập tên");
        String name = sc.nextLine();
        nv.setName(name);
        System.out.println("Nhập mã nhân viên");
        int id = Integer.parseInt(sc.nextLine());
        nv.setID(id);
        System.out.println("Nhập sđt");
        String sdt = (sc.nextLine());
        nv.setPhone(sdt);
        System.out.println("Nhập email");
        String email = sc.nextLine();
        nv.setEmail(email);
        nvs.add(nv);
        System.out.println("Nhập số giờ làm thêm");
        int sg = Integer.parseInt(sc.nextLine());
        pt.setNumTime(sg);
        partTimes.add(pt);
    }

    public void showFullTime() {
        for (Employee nv : nvs) {
            System.out.println(nv.toString());
        }
        for (EmployeeFullTime nvft : fullTimes) {
            System.out.println(nvft.toString());
        }

    }
    public void showPartTime() {
        for (Employee nv : nvs) {
            System.out.println(nv.toString());

        }
        for (EmployeePartTime nvpt : partTimes) {
            System.out.println(nvpt.toString());
        }
    }

    public int getAvgSalary() {
        int sumSalary = 0;
        for (EmployeeFullTime n : fullTimes
        ) {
            sumSalary += n.getSalary();
        }
        int avgSalary = sumSalary / fullTimes.size();
        return avgSalary;

    }

    public void displayNhanvienLuongThap(int avgSalary) {
        for (int i = 0; i < fullTimes.size(); i++) {
            if (fullTimes.get(i).getSalary() < avgSalary) {
                System.out.println(fullTimes.get(i).display());
            }
        }
    }

    public void totalSalaryPartTime() {
        int sum = 0;
        for (EmployeePartTime nv : partTimes) {
            if (nv instanceof EmployeePartTime) sum += nv.getSalary();
        }
        System.out.println(sum + " VNĐ");
    }
}