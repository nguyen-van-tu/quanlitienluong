import java.util.ArrayList;
import java.util.Scanner;

public class ListPartTime {
    ArrayList<NhanVienPartTime> partTimes = new ArrayList<>();
    ArrayList<NhanVien> nvs = new ArrayList<>();
    Scanner sc = new Scanner(System.in);


    public void addPartTime() {
        NhanVienPartTime pt = new NhanVienPartTime();
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
        nv.setEmail(sdt);
        nvs.add(nv);
        System.out.println("Nhập số giờ làm thêm");
        int sg = Integer.parseInt(sc.nextLine());
        pt.setNumTime(sg);
        partTimes.add(pt);
    }

    public void showPartTime() {
        for (NhanVien nv : nvs) {
            System.out.println(nv.toString());
            for (NhanVienPartTime nvpt : partTimes) {
                System.out.println(nvpt.toString());
            }
        }
    }
    public void totalSalary(){
        int sum = 0;
        for (NhanVienPartTime nv : partTimes){
            if (nv instanceof NhanVienPartTime) sum += nv.getSalary();
        }
        System.out.println(sum + " VNĐ");
    }
}
