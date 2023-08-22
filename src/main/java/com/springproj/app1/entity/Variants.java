package com.springproj.app1.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

//@Getter
@Entity
@Table(name="model_variant")
public class Variants {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sku")
    private int sku;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private int price;

    @Column(name = "product_id")
    private int product_id;

    @Column(name = "image_url1")
    private String image_url1;

    @Column(name = "image_url2")
    private String image_url2;

    @Column(name = "image_url3")
    private String image_url3;

    @Column(name = "quantity")
    private int quantity;

    public Variants() {
        super();
    }

    public Variants(int sku, String name, int price, int productId, String imageUrl1, String imageUrl2, String imageUrl3, int quantity) {
        this.sku = sku;
        this.name = name;
        this.price = price;
        this.product_id = productId;
        this.image_url1 = imageUrl1;
        this.image_url2 = imageUrl2;
        this.image_url3 = imageUrl3;
        this.quantity = quantity;
    }

    public int getSku() {
        return sku;
    }

    public void setSku(int sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getImage_url1() {
        return image_url1;
    }

    public void setImage_url1(String image_url1) {
        this.image_url1 = image_url1;
    }

    public String getImage_url2() {
        return image_url2;
    }

    public void setImage_url2(String image_url2) {
        this.image_url2 = image_url2;
    }

    public String getImage_url3() {
        return image_url3;
    }

    public void setImage_url3(String image_url3) {
        this.image_url3 = image_url3;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Variants{" +
                "sku=" + sku +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", product_id=" + product_id +
                ", image_url1='" + image_url1 + '\'' +
                ", image_url2='" + image_url2 + '\'' +
                ", image_url3='" + image_url3 + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
