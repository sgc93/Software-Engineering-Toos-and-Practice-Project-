package schoolmanagementsystem;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class SchoolTest {
    
    @Test
    public void testAddStudent() {
        Student student = new Student("John",23,"Grade 11", "A");
        School school = new School("Example School");
        school.addStudent(student);
        List<Student> students = school.getStudents();
        assertEquals(1, students.size());
        assertTrue(students.contains(student));
    }
    
    @Test
    public void testAddTeacher() {
        Teacher teacher = new Teacher("Jane", "Doe", 3);
        School school = new School("Example School");
        school.addTeacher(teacher);
        List<Teacher> teachers = school.getTeachers();
        assertEquals(1, teachers.size());
        assertTrue(teachers.contains(teacher));
    }
    
    @Test
    public void testAddSchedule() {
        ClassSchedule schedule = new ClassSchedule(1, "Mathematics", "Monday", "10:00AM", null, null);
        School school = new School("Example School");
        school.addSchedule(schedule);
        List<ClassSchedule> schedules = school.getSchedules();
        assertEquals(1, schedules.size());
        assertTrue(schedules.contains(schedule));
    }
    
    @Test
    public void testSetName() {
        School school = new School("Example School");
        school.setName("New School Name");
        assertEquals("New School Name", school.getName());
    }
    
    @Test
    public void testSetPhonenumber() {
        School school = new School("Example School");
        school.setPhonenumber("123-456-7890");
        assertEquals("123-456-7890", school.getPhonenumber());
    }
}
