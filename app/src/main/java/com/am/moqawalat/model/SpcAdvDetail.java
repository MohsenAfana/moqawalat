package com.am.moqawalat.model;

public class SpcAdvDetail {
    private int id;
    private String AdvPhone;
    private String AdvName;
    private String AdvDate;
    private String AdvPlace;
    private int AdvPhoto;

    public SpcAdvDetail(String s, String mohsen, String advName, String advDate, String romania, int main_image) {

    }

    public SpcAdvDetail(int id, String advPhone, String advName, String advDate, String advPlace, int advPhoto) {
        this.id = id;
        AdvPhone = advPhone;
        AdvName = advName;
        AdvDate = advDate;
        AdvPlace = advPlace;
        AdvPhoto = advPhoto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdvPhone() {
        return AdvPhone;
    }

    public void setAdvPhone(String advPhone) {
        AdvPhone = advPhone;
    }

    public String getAdvName() {
        return AdvName;
    }

    public void setAdvName(String advName) {
        AdvName = advName;
    }

    public String getAdvDate() {
        return AdvDate;
    }

    public void setAdvDate(String advDate) {
        AdvDate = advDate;
    }

    public String getAdvPlace() {
        return AdvPlace;
    }

    public void setAdvPlace(String advPlace) {
        AdvPlace = advPlace;
    }

    public int getAdvPhoto() {
        return AdvPhoto;
    }

    public void setAdvPhoto(int advPhoto) {
        AdvPhoto = advPhoto;
    }
}
