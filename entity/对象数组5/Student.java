package entity.对象数组5;

import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private int sge;

    public Student() {
    }

    public Student(int id, String name, int sge) {
        this.id = id;
        this.name = name;
        this.sge = sge;
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

    public int getSge() {
        return sge;
    }

    public void setSge(int sge) {
        this.sge = sge;
    }
}
