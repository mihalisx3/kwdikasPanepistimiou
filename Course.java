
package panepistimiouparadeigma;

import java.util.ArrayList;


public class Course {
    
    private String name;
    private ArrayList <Student> students = new ArrayList <Student> ();
    
    public void addStudent (Student aStudent) {
       students.add(aStudent);
    }
    
    public void printInformation () {
        System.out.println("Course Name: " + name); 
        System.out.println("has the following student: ");
        students.forEach((s) -> {
            System.out.println(s.getName());
        });
    }
   
    
    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
