/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import connect.Connect;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author vantu
 */
public class StudentList {
    connect.Connect con = new Connect();
    public void addStudent(String id, String name, int age, String address){
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        student.setAddress(address);
        studentList.add(student);
    }
    public void readDb(){
        String cmdSQL = "SELECT * FROM thongtinsv";
        try {
            ResultSet rs = con.GetSelect(cmdSQL);
        while(rs.next()){
            addStudent(rs.getString(1), rs.getString("Name"), rs.getInt("Age"),rs.getString(4));
        }
        } catch (Exception e) {
        }
        
    }
//    public void addDb() throws SQLException{
//            int size = getStudentList().size();
//            String cmdSQL = "INSERT INTO thongtinsv (Id,Name,Age,Address) values (?,?,?,?)";
//            PreparedStatement prestmt = con.Fix(cmdSQL);
//            prestmt.setString(1,getStudentList().get(size-1).getId());
//            prestmt.setString(2,getStudentList().get(size-1).getName());
//            prestmt.setInt(3,getStudentList().get(size-1).getAge());
//            prestmt.setString(4,getStudentList().get(size-1).getAddress());
//            prestmt.executeUpdate();
//            prestmt.close();    
//    }
//    public void fixDb(String id){
//            
//    }
    ArrayList<Student> studentList = new ArrayList<Student>();

    public ArrayList<Student> getStudentList() {
        return studentList;
    }
    
    public static void main(String[] args) throws SQLException {
        StudentList list = new StudentList();
        list.readDb();
//        list.addStudent("tuan", "1", 3, "3");
//        list.addDb();
        int size = list.studentList.size();
        System.out.println(size);
        for (int  i = 0; i<size; i++){
            System.out.println(list.studentList.get(i));
        }
    }
}
