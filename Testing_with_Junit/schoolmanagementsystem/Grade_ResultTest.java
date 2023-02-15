package schoolmanagementsystem;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Grade_ResultTest {
    private Grade_Result gradeResult;
    
    @Before
    public void setUp() throws Exception {
        gradeResult = new Grade_Result(123, "Math", 85);
    }

    @Test
    public void testGetStudentRollNumber() {
        assertEquals(123, gradeResult.getStudentRollNumber());
    }

    @Test
    public void testSetStudentRollNumber() {
        gradeResult.setStudentRollNumber(456);
        assertEquals(456, gradeResult.getStudentRollNumber());
    }

    @Test
    public void testGetSubject() {
        assertEquals("Math", gradeResult.getSubject());
    }

    @Test
    public void testSetSubject() {
        gradeResult.setSubject("Science");
        assertEquals("Science", gradeResult.getSubject());
    }

    @Test
    public void testGetMarks() {
        assertEquals(85, gradeResult.getMarks());
    }

    @Test
    public void testSetMarks() {
        gradeResult.setMarks(90);
        assertEquals(90, gradeResult.getMarks());
    }
}
