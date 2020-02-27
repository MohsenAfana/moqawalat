package com.am.moqawalat.model;

public class ModelSmoolider {

    private int id;
    private String name;
    private Integer image;
    private String AdvPhone;
    private String AdvDate;

    public ModelSmoolider(int id, String name, Integer image, String advPhone, String advDate) {
        this.id = id;
        this.name = name;
        this.image = image;
        AdvPhone = advPhone;
        AdvDate = advDate;
    }

    public ModelSmoolider() {

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

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public String getAdvPhone() {
        return AdvPhone;
    }

    public void setAdvPhone(String advPhone) {
        AdvPhone = advPhone;
    }

    public String getAdvDate() {
        return AdvDate;
    }

    public void setAdvDate(String advDate) {
        AdvDate = advDate;
    }
}
