import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ListPartTime listPartTime = new ListPartTime();
        ListFullTime listFullTime = new ListFullTime();
        Scanner sc = new Scanner(System.in);
        int index;
        do {
            System.out.println("1: Thêm nhân viên");
            System.out.println("2: Hiển thị nhân viên");
            System.out.println("3: Nhân viên lương thấp hơn trung bình");
            System.out.println("4: Tổng lương parttime");
            System.out.println("0: Exit");
            index = Integer.parseInt(sc.nextLine());
            switch (index){
                case 1:
                    int i;
                    do {
                        System.out.println("1: Parttime");
                        System.out.println("2: Fulltime");
                        System.out.println("0: Quay lại");
                        i=Integer.parseInt(sc.nextLine());
                        switch (i){
                            case 1:
                                listPartTime.addPartTime();
                                break;
                            case 2:
                                listFullTime.addFullTime();
                        }
                    }while (i != 0);
                    break;
                case 2:
                    int a;
                    do {
                        System.out.println("1: Parttime");
                        System.out.println("2: Fulltime");
                        System.out.println("0: Quay lại");
                        a=Integer.parseInt(sc.nextLine());
                        switch (a){
                            case 1:
                                listPartTime.showPartTime();
                                break;
                            case 2:
                                listFullTime.showFullTime();
                        }
                    }while (a != 0);
                    break;
                case 3:
                    listFullTime.displayNhanvienLuongThap(listFullTime.getAvgSalary());
                case 4:
                    listPartTime.totalSalary();
            }
        }while (index != 0);
    }
}
