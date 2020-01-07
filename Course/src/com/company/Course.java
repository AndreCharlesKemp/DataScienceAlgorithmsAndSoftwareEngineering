package com.company;
import java.util.*;
public class Course {

    public static void main(String[] args) {

        List<courseDetails> courses1 = new ArrayList<courseDetails>();

        courses1.add(new courseDetails("Combat Staff", 101, "Donatello"));
        courses1.add(new courseDetails("Sais", 80, "Raphael"));
        courses1.add(new courseDetails("Katana", 602, "Leonardo"));
        courses1.add(new courseDetails("Nunchaku", 209, "Michaelangelo"));
        courses1.add(new courseDetails("Leadership", 4, "Splinter"));

        System.out.println("Original course order:");
        System.out.println(courses1);

        Collections.sort(courses1, new StudentNumberComparator());
        System.out.println("Sorted by number of students:\n");
        System.out.println(courses1);



        List<courseDetails> courses2 = new ArrayList<courseDetails>();
        courses2.addAll(courses1);
        courses2.add(new courseDetails("Java 101", 55, "Dr. P. Green"));
        courses2.add(new courseDetails("Advanced Programming", 93, "Prof. M Milton"));
        Collections.sort(courses2, new StudentCourseComparator());
        System.out.println(courses2);

        System.out.println("Checking fro common elements in lists...");

        boolean common = Collections.disjoint(courses1, courses2);
        if(common)
        {
            System.out.println("Common elements present: " + common);
            System.out.println("There are no elements in common");
        }
        else
        {
            System.out.println("Common elements present: " + common);
            System.out.println("There are common elements in both lists");
        }
        System.out.println("The course with the most students is: " + Collections.max(courses2, new StudentNumberComparator()));
        System.out.println("The course with the fewest amount of students is: " + Collections.min(courses2, new StudentNumberComparator()));
    }
}
