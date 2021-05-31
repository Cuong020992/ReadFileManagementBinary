import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagementProduct {
    List<Product> productList;
    Scanner scanner = new Scanner(System.in);

    public ManagementProduct() {
        productList = new ArrayList<>();
    }

    public void writeFile(String path, Product product) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write(product.getCodeProduct() + ","
                + product.getNameProduct() + "," + product.getBrand() + ","
                + product.getPrice() + "," + product.getMoreDetail());

        bufferedWriter.close();
        fileWriter.close();
    }

    Product readFile(String path) throws IOException {
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = bufferedReader.readLine();
        String[] values = line.split(",");
        Product product = new Product(values[0],values[1],values[2],Integer.parseInt(values[3]),values[4]);
        return product;
    }

    public void addProduct(){
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
        Product product = new Product(productCode,nameProduct,brand,price,moreDetail);
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
            if (products.getCodeProduct() == inputProductCode) {
                System.out.println(products);
                count++;
            }
        }
    }
}
