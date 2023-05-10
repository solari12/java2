/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author vantu
 */
public class Student {
   private String id;
   private String name;
   private int age;
   private String Address;

    public Student(String id, String name, int age, String Address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.Address = Address;
    }

    public Student() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return Address;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    @Override
    public String toString() {
        return "Model{" + "id=" + id + ", name=" + name + ", age=" + age + ", Address=" + Address + '}';
    }
   
   
}
