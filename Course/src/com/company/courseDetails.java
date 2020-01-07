package com.company;
import java.util.*;

public class courseDetails
{
    private String course;
    private int students;
    private String lecturer;

    public courseDetails(String courseName, int numberOfStudents, String courseLecturer)
    {
            course = courseName;
            students = numberOfStudents;
            lecturer = courseLecturer;
    }

    //Returns the GetCourse to be used for compiling Strings
    public String getCourse()
    {
        return course;
    }

    public int getStudents()
    {
        return students;
    }

    public String getLecturer()
    {
        return lecturer;
    }

    public String toString()
    {
        return String.format("(%s, %d, %s)", course, students, lecturer);
    }
}
//A comprator to compare keys using a student number
class StudentNumberComparator implements Comparator<courseDetails> {
    @Override
    public int compare(courseDetails course1, courseDetails course2) {
        return course1.getStudents() - course2.getStudents();
    }
}

class StudentCourseComparator implements Comparator<courseDetails> {
    @Override
    public int compare(courseDetails course1, courseDetails course2) {
        return course1.getCourse().compareTo(course2.getCourse());
    }
}