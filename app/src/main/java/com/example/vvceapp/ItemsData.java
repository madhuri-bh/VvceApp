package com.example.vvceapp;

public class ItemsData {
    private int mImageResourceID;
private String mName;
private String mQualification;
private String mDesignation;

public ItemsData(int imageResourceID, String name, String designation, String qualification){
mImageResourceID = imageResourceID;
mName = name;
mDesignation = designation;
mQualification = qualification;
}

    public int getImageResourceID() {
        return mImageResourceID;
    }

    public void setImageResourceID(int imageResourceID) {
    mImageResourceID = imageResourceID;
    }

    public String getName() {
    return mName;
    }

    public void setName(String name) {
    mName = name;
    }

    public String getDesignation() {
    return mDesignation;
    }

    public void setDesignation(String designation) {
    mDesignation = designation;
    }

    public String getQualification() {
    return mQualification;
    }

    public void setQualification(String qualification) {
    mQualification = qualification;
    }
}
