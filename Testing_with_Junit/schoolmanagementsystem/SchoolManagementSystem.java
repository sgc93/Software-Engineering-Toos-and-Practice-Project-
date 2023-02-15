
package schoolmanagementsystem;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SchoolManagementSystem {
    private static final School school = new School("Example School");
    private static final List<ClassSchedule> classSchedules = new ArrayList<>();
    private static final List<Grade_Result> gradeResults = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== School Management System =====");
            System.out.println("1. Manage Students");
            System.out.println("2. Manage Teachers");
            System.out.println("3. Manage Class Schedules");
            System.out.println("4. Manage Grade Results");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> manageStudents(scanner);
                case 2 -> manageTeachers(scanner);
                case 3 -> manageClassSchedule(scanner);
                case 4 -> manageGradeResult(scanner);
                case 5 -> {
                    System.out.println("Exiting School Management System...");
                    return;
                }
                default -> System.out.println("Invalid choice, please try again.");
            }
        }
    }

    private static void manageStudents(Scanner scanner) {
        while (true) {
            System.out.println("\n===== Manage Students =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Back");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addStudent(scanner);
                case 2 -> viewStudents();
                case 3 -> updateStudent(scanner);
                case 4 -> {
                    return;
                }
                default -> System.out.println("Invalid choice, please try again.");
            }
            // deleteStudent(scanner);
                    }
    }

    private static void addStudent(Scanner scanner) {
        System.out.print("Enter student name: ");
        String name = scanner.next();
        System.out.print("Enter student roll number: ");
        int rollNumber = scanner.nextInt();
        System.out.print("Enter student class name: ");
        String className = scanner.next();
        System.out.print("Enter student section: ");
        String section = scanner.next();

        Student student = new Student(name, rollNumber, className, section);
        school.addStudent(student);

        System.out.println("Student added successfully.");
    }

    private static void viewStudents() {
        System.out.println("\n===== Student List =====");
        for (Student student : school.getStudents()) {
            System.out.println("Name: " + student.getName() + ", Roll Number: " + student.getRollNumber()
                    + ", Class: " + student.getClassName() + ", Section: " + student.getSection());
        }
    }

    private static void updateStudent(Scanner scanner) {
        System.out.print("Enter student roll number to update: ");
        int rollNumber = scanner.nextInt();

        for (Student student : school.getStudents()) {
            if (student.getRollNumber() == rollNumber) {
                System.out.print("Enter updated name (current name is " + student.getName() + "): ");
                String name = scanner.next();
                System.out.print("Enter updated class name (current class is " + student.getClassName() + "):");
                String className = scanner.next();
                System.out.print("Enter updated section (current section is " + student.getSection() + "): ");
                String section = scanner.next();
                            student.setName(name);
            student.setClassName(className);
            student.setSection(section);

            System.out.println("Student details updated successfully.");
            return;
            }
        }

        System.out.println("Student with roll number " + rollNumber + " not found.");
    }


    private static void manageTeachers(Scanner scanner) {
        while (true) {
            System.out.println("\n===== Manage Teachers =====");
            System.out.println("1. Add Teacher");
            System.out.println("2. View Teachers");
            System.out.println("3. Update Teacher");
            System.out.println("4. Delete Teacher");
            System.out.println("5. Back");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> addTeacher(scanner);
            case 2 -> viewTeachers();
            case 3 -> updateTeacher(scanner);
            // case 4 -> deleteTeacher(scanner);
            case 5 -> {
                return;
                }
            default -> System.out.println("Invalid choice, please try again.");
        }
        }
    }

    private static void addTeacher(Scanner scanner) {
        System.out.print("Enter teacher name: ");
        String name = scanner.next();
        System.out.print("Enter teacher ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter teacher subject: ");
        String subject = scanner.next();

        Teacher teacher = new Teacher(name, id, subject);
        school.addTeacher(teacher);

        System.out.println("Teacher added successfully.");
    }

    private static void viewTeachers() {
        System.out.println("\n===== Teacher List =====");
        for (Teacher teacher : school.getTeachers()) {
            System.out.println("Name: " + teacher.getName() + ", ID: " + teacher.getId()
                + ", Subject: " + teacher.getSubject());
        }
    }

    private static void updateTeacher(Scanner scanner) {
        System.out.print("Enter teacher ID to update: ");
        int id = scanner.nextInt();

        for (Teacher teacher : school.getTeachers()) {
            if (teacher.getId() == id) {
                System.out.print("Enter updated name (current name is " + teacher.getName() + "): ");
                String name = scanner.next();
                System.out.print("Enter updated subject (current subject is " + teacher.getSubject() + "): ");
                String subject = scanner.next();

                teacher.setName(name);
                teacher.setSubject(subject);

                System.out.println("Teacher details updated successfully.");
                return;
            }
        }
        System.out.println("Teacher with ID " + id + " not found.");
    }
    
    private static void manageClassSchedule(Scanner scanner){

        try (scanner) {
            int choice;
            
            do {
                System.out.println("Choose an option:");
                System.out.println("1. Add class schedule");
                System.out.println("2. Update class schedule");
                System.out.println("3. Delete class schedule");
                System.out.println("4. View all class schedules");
                System.out.println("5. Exit");
                
                choice = scanner.nextInt();
                
                switch (choice) {
                    case 1 -> addClassSchedule(scanner);
                    case 2 -> updateClassSchedule(scanner);
                    case 3 -> deleteClassSchedule(scanner);
                    case 4 -> viewAllClassSchedules();
                    case 5 -> {
                        System.out.println("Exiting...");
                        return;
                    }
                    default -> System.out.println("Invalid choice. Please try again.");
                }
                
            } while (choice != 5);
        }
    }

    private static void addClassSchedule(Scanner scanner) {

        try (scanner) {
            System.out.println("Enter class number:");
            int classNumber = scanner.nextInt();
            
            System.out.println("Enter class name:");
            String className = scanner.next();
            
            System.out.println("Enter section:");
            String section = scanner.next();
            
            System.out.println("Enter subject:");
            String subject = scanner.next();
            
            System.out.println("Enter date (yyyy-mm-dd):");
                    String dateString = "2023-02-14"; // example date string
                    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); // create a date format
                    Date date = null;
                    try {
                        date = format.parse(dateString);
                    } catch (ParseException ex) {
                        Logger.getLogger(SchoolManagementSystem.class.getName()).log(Level.SEVERE, null, ex);
                    }
            
            System.out.println("Enter time:");
            String time = scanner.next();
            
            ClassSchedule classSchedule = new ClassSchedule(classNumber, className, section, subject, date, time);
            classSchedules.add(classSchedule);
            System.out.println("Class schedule added successfully.");
        }
    }

    private static void updateClassSchedule(Scanner scanner) {

        try (scanner) {
            System.out.println("Enter class number:");
            int classNumber = scanner.nextInt();
            
            boolean found = false;
            
            for (ClassSchedule classSchedule : classSchedules) {
                if (classSchedule.getClassNumber() == classNumber) {
                    System.out.println("Enter class name:");
                    String className = scanner.next();
                    
                    System.out.println("Enter section:");
                    String section = scanner.next();
                    
                    System.out.println("Enter subject:");
                    String subject = scanner.next();
                    
                    System.out.println("Enter date (yyyy-mm-dd):");
                    String dateString = "2023-02-14"; // example date string
                    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); // create a date format
                    Date date = null;
                    try {
                        date = format.parse(dateString);
                    } catch (ParseException ex) {
                        Logger.getLogger(SchoolManagementSystem.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    
                    System.out.println("Enter time:");
                    String time = scanner.next();
                    
                    classSchedule.setClassName(className);
                    classSchedule.setSection(section);
                    classSchedule.setSubject(subject);
                    classSchedule.setDate(date);
                    classSchedule.setTime(time);
                    
                    found = true;
                    System.out.println("Class schedule updated successfully.");
                    break;
                }
            }
            
            if (!found) {
                System.out.println("Class schedule not found.");
            }
        }
    }
    
    private  static void viewAllClassSchedules() {
        if (classSchedules.isEmpty()) {
            System.out.println("No class schedules found.\n");
            return;
        } else {
        }

        System.out.println("All class schedules:\n");

        for (ClassSchedule classSchedule : classSchedules) {
            System.out.println(classSchedule.getClassNumber() + " - " + classSchedule.getClassName() + " - "
                    + classSchedule.getSection() + " - " + classSchedule.getSubject() + " - " + classSchedule.getDate()
                    + " - " + classSchedule.getTime());
        }

        System.out.println();
    }
    
    public static void deleteClassSchedule(Scanner scanner) {
        System.out.println("Enter class number to delete: ");
        int classNumber = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Find the index of the class schedule with the given class number
        int index = -1;
        for (int i = 0; i < classSchedules.size(); i++) {
            if (classSchedules.get(i).getClassNumber() == classNumber) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("No class schedule with class number " + classNumber + " found.");
        } else {
            classSchedules.remove(index);
            System.out.println("Class schedule with class number " + classNumber + " has been deleted.");
        }
    }

    public static void manageGradeResult(Scanner scanner){
            int choice;
        do {
            System.out.println("Select an option:");
            System.out.println("1. Add student's marks");
            System.out.println("2. Calculate total and average marks for a student");
            System.out.println("3. Exit");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline character
            switch (choice) {
                case 1 -> {
                    // accept input from user for each subject's marks and add to list
                    System.out.print("Enter student roll number: ");
                    int rollNumber = scanner.nextInt();
                    scanner.nextLine(); // consume newline character
                    System.out.print("Enter subject: ");
                    String subject = scanner.nextLine();
                    System.out.print("Enter marks: ");
                    int marks = scanner.nextInt();
                    scanner.nextLine(); // consume newline character
                    Grade_Result gradeResult = new Grade_Result(rollNumber, subject, marks);
                    gradeResults.add(gradeResult);
                    }
                case 2 -> {
                    // calculate total and average marks for a given student
                    System.out.print("Enter student roll number: ");
                        int rollNumber = scanner.nextInt();
                        scanner.nextLine(); // consume newline character
                        int totalMarks = 0;
                        int numSubjects = 0;
                        for (Grade_Result result : gradeResults) {
                            if (result.getStudentRollNumber() == rollNumber) {
                                totalMarks += result.getMarks();
                                numSubjects++;
                            }
                        }   
                        double averageMarks = (double) totalMarks / numSubjects;
                        System.out.println("Total marks: " + totalMarks);
                        System.out.println("Average marks: " + averageMarks);
                    }
                case 3 -> {
                        System.out.println("Exiting...");
                        return;
                    }
                }
            } while( choice != 3);
    }
}
