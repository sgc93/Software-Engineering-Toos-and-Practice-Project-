package schoolmanagementsystem;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TeacherTest {

    private Teacher teacher;

    @Before
    public void setUp() throws Exception {
        teacher = new Teacher("John Doe", "Math", 10);
    }

    @Test
    public void testGetName() {
        assertEquals("John Doe", teacher.getName());
    }

    @Test
    public void testSetName() {
        teacher.setName("Jane Doe");
        assertEquals("Jane Doe", teacher.getName());
    }

    @Test
    public void testGetSubject() {
        assertEquals("Math", teacher.getSubject());
    }

    @Test
    public void testSetSubject() {
        teacher.setSubject("Science");
        assertEquals("Science", teacher.getSubject());
    }

    @Test
    public void testGetExperience() {
        assertEquals(10, teacher.getExperience());
    }

    @Test
    public void testSetExperience() {
        teacher.setExperience(5);
        assertEquals(5, teacher.getExperience());
    }

    @Test
    public void testGetId() {
        teacher.setId(1);
        assertEquals(1, teacher.getId());
    }

}
