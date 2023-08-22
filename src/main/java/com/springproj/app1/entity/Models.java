package com.springproj.app1.entity;

import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.Setter;

//@Getter
//@Setter
@Entity
@Table(name = "models")
public class Models {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "model_id")
    private int model_id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "cid")
    private int cid;

    public Models() {
        super();
    }

    public Models(int model_id, String name, String description, int cid) {
        super();
        this.model_id = model_id;
        this.name = name;
        this.description = description;
        this.cid = cid;
    }

    public int getModel_id() {
        return model_id;
    }

    public void setModel_id(int model_id) {
        this.model_id = model_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "Model{" +
                "modelId=" + model_id +
                ", name='" + name + '\'' +
                ", description=" + description + '\'' +
                ", salary=" + cid +
                '}';
    }
    public long getModelCategory(){
        return model_id;
    }

}
