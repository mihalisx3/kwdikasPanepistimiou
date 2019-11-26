
package panepistimiouparadeigma;


public class PanepistimiouParadeigma {

    
    public static void main(String[] args) {
        
        Student S1 = new Student ("Mihalis", "125458");
        Student S2 = new Student ("Takis", "1151478");
        
        
        Course C1 = new Course ("Java");
        Course C2 = new Course ("Python");
        Course C3 = new Course ("Ruby");
        
        S1.addCourse(C1);
        S1.addCourse(C2);
        S1.addCourse(C3);
        
        S2.addCourse(C1);//Τον S2 βάλ'τον στο μάθημα C1
        
       // C1.addStudent(S1);
       // C1.addStudent(S2);
        //C1.printInformation();
        System.out.println("---------");
        S1.printData();
        
        
        //S1.printData();
    }
    
}
