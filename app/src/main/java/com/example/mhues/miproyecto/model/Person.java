package com.example.mhues.miproyecto.model;

import com.example.mhues.miproyecto.R;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Person implements Serializable {

        String mName;
        String mAge;
        int mPhotoId;

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getAge() {
        return mAge;
    }

    public void setAge(String age) {
        mAge = age;
    }

    public int getPhotoId() {
        return mPhotoId;
    }

    public void setPhotoId(int photoId) {
        mPhotoId = photoId;
    }

    public Person(String name, String age, int photoId) {
            this.mName = name;
            this.mAge = age;
            this.mPhotoId = photoId;
        }

}


