import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagementProduct productManagement = new ManagementProduct();
        String choice;
        do {
            menu();
            choice = scanner.nextLine();
            switch (choice) {
                case "1": {//thêm
                    productManagement.addProduct();
                }
                break;
                case "2": {//hiển thị
                    productManagement.displayProduct();
                }
                break;
                case "3": {//tìm kiếm
                    productManagement.findProductCode();
                }
                break;
                case "4": {//ghi file
                   productManagement.writeFile();
                }
                break;
                case "5": {//đọc file
                    productManagement.readFile();
                }
                break;
                default: {
                    System.out.println("Yêu cầu nhập lại");
                }
                break;
            }
        } while (!choice.equals("6"));
    }

    private static void menu() {
        System.out.println("");
        System.out.println("--Menu--");
        System.out.println("---------------------------");
        System.out.println("1. Thêm sản phẩm");
        System.out.println("2. Hiển thị danh sách sản phẩm");
        System.out.println("3. Tìm kiếm theo mã sản phẩm");
        System.out.println("4. Ghi file");
        System.out.println("5. Đọc file");
        System.out.println("6. Thoát");
        System.out.println("---------------------------");
        System.out.println("");
        System.out.print("nhập lựa chọn của bạn: ");
    }
}
