/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolmanagemetsystem;

/**
 *
 * @author hp pavilion
 */
import java.util.Date;

public class ClassSchedule {
    private int classNumber;
    private String className;
    private String section;
    private String subject;
    private Date date;
    private String time;

    public ClassSchedule(int classNumber, String className, String section, String subject, Date date, String time) {
        this.classNumber = classNumber;
        this.className = className;
        this.section = section;
        this.subject = subject;
        this.date = date;
        this.time = time;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}

