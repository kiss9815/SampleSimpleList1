package com.example.tacademy.samplesimplelist1;

import android.graphics.drawable.Drawable;

/**
 * Created by Tacademy on 2016-01-14.
 */
public class Person {

    private String name;
    private int age;
    private Drawable icon;
    private String description;


    public Person(String name, int age, Drawable icon, String description) {
        this.name = name;
        this.age = age;
        this.icon = icon;
        this.description = description;
    }

    private String nameAndAge;
    public String getNameAndAge(){
        if(nameAndAge==null){
            nameAndAge = name + "(" + age +")";
        } //한번 nameAndAge 가 만들어지면 불필요하게 메모리를 다시 만들지 않고 리턴을 한다.
        return nameAndAge;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        nameAndAge = null;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        nameAndAge = null;
    }

    public Drawable getIcon() {
        return icon;
    }

    public void setIcon(Drawable icon) {
        this.icon = icon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
