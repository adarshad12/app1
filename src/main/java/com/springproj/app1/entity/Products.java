package com.springproj.app1.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "category")
public class Products {

//    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "category_id")
    private int categoryId;

    @Column(name = "name")
    private String name;

    public Products() {
        super();
    }
    public Products(int categoryId, String name) {
        super();
        this.categoryId = categoryId;
        this.name = name;
    }
//    public int getCategory
//    public void setCategoryId(int categoryId) {
//        this.categoryId = categoryId;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", name='" + name + '\'' +
                '}';
    }
}
