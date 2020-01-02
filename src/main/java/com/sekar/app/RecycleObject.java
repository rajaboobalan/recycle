package com.sekar.app;

public class RecycleObject {

    public RecycleObject(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    private Integer id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


}
