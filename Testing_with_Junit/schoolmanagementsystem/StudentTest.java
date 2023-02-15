package schoolmanagementsystem;

import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testGetName() {
        Student student = new Student("John", 1, "Class 1", "A");
        assertEquals("John", student.getName());
    }

    @Test
    public void testSetName() {
        Student student = new Student("John", 1, "Class 1", "A");
        student.setName("Mary");
        assertEquals("Mary", student.getName());
    }

    @Test
    public void testGetRollNumber() {
        Student student = new Student("John", 1, "Class 1", "A");
        assertEquals(1, student.getRollNumber());
    }

    @Test
    public void testSetRollNumber() {
        Student student = new Student("John", 1, "Class 1", "A");
        student.setRollNumber(2);
        assertEquals(2, student.getRollNumber());
    }

    @Test
    public void testGetClassName() {
        Student student = new Student("John", 1, "Class 1", "A");
        assertEquals("Class 1", student.getClassName());
    }

    @Test
    public void testSetClassName() {
        Student student = new Student("John", 1, "Class 1", "A");
        student.setClassName("Class 2");
        assertEquals("Class 2", student.getClassName());
    }

    @Test
    public void testGetSection() {
        Student student = new Student("John", 1, "Class 1", "A");
        assertEquals("A", student.getSection());
    }

    @Test
    public void testSetSection() {
        Student student = new Student("John", 1, "Class 1", "A");
        student.setSection("B");
        assertEquals("B", student.getSection());
    }
}
