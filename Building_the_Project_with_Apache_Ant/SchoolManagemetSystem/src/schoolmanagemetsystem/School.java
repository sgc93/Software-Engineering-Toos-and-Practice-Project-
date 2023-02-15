/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolmanagemetsystem;

/**
 *
 * @author hp pavilion
 */
import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private String phoneNumber;
    private final List<Student> students;
    private final List<Teacher> teachers;
    private final List<ClassSchedule> schedules;
    
    public School(String name) {
        this.name = name;
        students = new ArrayList<>();
        teachers = new ArrayList<>();
        schedules = new ArrayList<>();
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getPhonenumber(){
        return this.phoneNumber;
    }
    
    public void setPhonenumber(String Phonenumber){
        this.phoneNumber = Phonenumber;
    }
    public void addStudent(Student student) {
        students.add(student);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addSchedule(ClassSchedule schedule) {
        schedules.add(schedule);
    }


    public List<Student> getStudents() {
        return students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<ClassSchedule> getSchedules() {
        return schedules;
    }
}

