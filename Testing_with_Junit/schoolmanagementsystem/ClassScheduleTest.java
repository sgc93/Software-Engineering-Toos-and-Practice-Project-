package schoolmanagementsystem;

import static org.junit.Assert.*;
import java.util.Date;
import org.junit.Test;

public class ClassScheduleTest {

    @Test
    public void testClassSchedule() {
        int classNumber = 1;
        String className = "Physics";
        String section = "A";
        String subject = "Physics";
        Date date = new Date();
        String time = "10:00 AM";
        ClassSchedule schedule = new ClassSchedule(classNumber, className, section, subject, date, time);
        assertEquals(classNumber, schedule.getClassNumber());
        assertEquals(className, schedule.getClassName());
        assertEquals(section, schedule.getSection());
        assertEquals(subject, schedule.getSubject());
        assertEquals(date, schedule.getDate());
        assertEquals(time, schedule.getTime());
    }

    @Test
    public void testSettersAndGetters() {
        ClassSchedule schedule = new ClassSchedule(1, "Maths", "B", "Mathematics", new Date(), "9:00 AM");
        int classNumber = 2;
        String className = "English";
        String section = "C";
        String subject = "English Language";
        Date date = new Date();
        String time = "11:00 AM";
        schedule.setClassNumber(classNumber);
        schedule.setClassName(className);
        schedule.setSection(section);
        schedule.setSubject(subject);
        schedule.setDate(date);
        schedule.setTime(time);
        assertEquals(classNumber, schedule.getClassNumber());
        assertEquals(className, schedule.getClassName());
        assertEquals(section, schedule.getSection());
        assertEquals(subject, schedule.getSubject());
        assertEquals(date, schedule.getDate());
        assertEquals(time, schedule.getTime());
    }

}
