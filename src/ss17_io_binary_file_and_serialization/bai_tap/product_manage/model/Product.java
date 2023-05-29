package ss17_io_binary_file_and_serialization.bai_tap.product_manage.model;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private long price;
    private String maker;
    private String description;

    public Product(int id, String name, long price, String maker, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.maker = maker;
        this.description = description;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", producerGoods='" + maker + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
