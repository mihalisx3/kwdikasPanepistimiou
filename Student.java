
package panepistimiouparadeigma;

import java.util.ArrayList;


public class Student {
    
    private String name;
    private String id;
    private ArrayList <Course> courses = new ArrayList <Course> ();
    int counter = 0;
    
    public void addCourse (Course aCourse) {
        courses.add(aCourse); //στέλνω μήνυμα στο student -> add αυτό το course
        aCourse.addStudent(this); //και επίσης στέλνω μήνυμα στο course -> add αυτό το student
                                 //εδω το this σημαινει η διευθυνση του αντικείμενου/εαυτού μου
    }                            //για να μη χρειάζεται στη main ή όπου αλλού ζητάω να εκτελεστεί αυτή η 
                                 //ενέργεια, να ζητώ το ίδιο και από το 2ο αντικείμενο

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public Student(String name) {
        this.name = name;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public void printData () {
        System.out.println("Student data: ");
        System.out.println("Name: " + name );
        System.out.println("ID: " + id );
        System.out.println("Enrolled in: " );
        for (Course c:courses) {
            //Course c = courses.get(i); //Κάνω downcasting, γιατί αλλιώς είναι object
        System.out.println(c.getName() );
        }
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", id=" + id + ", myCourse=" + myCourse + '}';
    }
     
     
     
     
     
}
