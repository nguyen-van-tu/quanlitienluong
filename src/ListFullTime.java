import java.util.ArrayList;
import java.util.Scanner;

public class ListFullTime {
    ArrayList<NhanVienFullTime> fullTimes = new ArrayList<>();
    ArrayList<NhanVien> nvs = new ArrayList<>();
    Scanner sc = new Scanner(System.in);


    public void addFullTime() {
        NhanVienFullTime ft = new NhanVienFullTime();
        NhanVien nv = new NhanVien();
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

    public void showFullTime() {
        for (NhanVien nv : nvs) {
            System.out.println(nv.toString());
        }
        for (NhanVienFullTime nvft : fullTimes) {
            System.out.println(nvft.toString());
        }

    }

    public int getAvgSalary() {
        int sumSalary = 0;
        for (NhanVienFullTime n : fullTimes
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
}