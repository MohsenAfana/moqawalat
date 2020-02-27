package com.am.moqawalat.model;

public class MaterialsAds {
    private String AdvName;
    private String AdvPhone;
    private String AdvDate;
    private int AdvPhoto;
    private int AdvSalary;


    public MaterialsAds(String advName, String advPhone, String advDate, int advPhoto) {
        AdvName = advName;
        AdvPhone = advPhone;
        AdvDate = advDate;
        AdvPhoto = advPhoto;
    }


    public MaterialsAds() {

    }

    public String getAdvName() {
        return AdvName;
    }

    public String getAdvPhone() {
        return AdvPhone;
    }

    public String getAdvDate() {
        return AdvDate;
    }

    public int getAdvPhoto() {
        return AdvPhoto;
    }

    public int getAdvSalary() {
        return AdvSalary;
    }

    public void setAdvName(String advName) {
        AdvName = advName;
    }

    public void setAdvPhone(String advPhone) {
        AdvPhone = advPhone;
    }

    public void setAdvDate(String advDate) {
        AdvDate = advDate;
    }

    public void setAdvPhoto(int advPhoto) {
        AdvPhoto = advPhoto;
    }

    public void setAdvSalary(int advSalary) {
        AdvSalary = advSalary;
    }
}
