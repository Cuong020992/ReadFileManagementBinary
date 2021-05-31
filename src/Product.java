public class Product {
    String codeProduct;
    String nameProduct;
    String brand;
    int price;
    String moreDetail;

    public Product() {
    }

    public Product(String codeProduct, String nameProduct, String brand, int price, String moreDetail) {
        this.codeProduct = codeProduct;
        this.nameProduct = nameProduct;
        this.brand = brand;
        this.price = price;
        this.moreDetail = moreDetail;
    }

    public String getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(String codeProduct) {
        this.codeProduct = codeProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMoreDetail() {
        return moreDetail;
    }

    public void setMoreDetail(String moreDetail) {
        this.moreDetail = moreDetail;
    }

    @Override
    public String toString() {
        return "Product{" +
                "codeProduct='" + codeProduct + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", moreDetail='" + moreDetail + '\'' +
                '}';
    }
}
