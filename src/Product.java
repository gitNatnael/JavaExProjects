



public class Product {

    String name;
    String brand;
    int type;
    int v;

    public Product(String name, String brand, int type) {
        this.name = name;
        this.brand = brand;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
