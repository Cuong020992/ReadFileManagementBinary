import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Spliterator;

public class ManagementProduct {
    List<Product> productList;
    Scanner scanner = new Scanner(System.in);

    public ManagementProduct() {
        productList = new ArrayList<>();
    }

    public void writeFile(String path, List<Product> products) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
        outputStream.writeObject(products);
        outputStream.close();
        fileOutputStream.close();
    }

    Product readFile(String path) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        productList = (List<Product>) objectInputStream.readObject();
        System.out.println(productList);
        return null;
    }

    public void addProduct() {
        System.out.print("nhập mã sản phẩm: ");
        String productCode = scanner.nextLine();
        System.out.print("nhập tên sản phẩm: ");
        String nameProduct = scanner.nextLine();
        System.out.print("nhập tên thương hiệu: ");
        String brand = scanner.nextLine();
        System.out.print("nhập giá: ");
        int price = scanner.nextInt();
        scanner.nextLine();
        System.out.print("nhập chi tiết sản phẩm: ");
        String moreDetail = scanner.nextLine();
        Product product = new Product(productCode, nameProduct, brand, price, moreDetail);
        productList.add(product);
    }

    public void displayProduct() {
        for (Product products : productList) {
            System.out.println(products.toString());
        }
    }

    public void findProductCode() {
        System.out.print("nhập tìm mã sản phẩm: ");
        String inputProductCode = scanner.nextLine();
        int count = 0;
        for (Product products : productList) {
            if (products.getCodeProduct().equals(inputProductCode)) {
                System.out.println(products);
                count++;
            }
        }
    }
}
