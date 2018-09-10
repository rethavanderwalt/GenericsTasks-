package generictasks;
import java.util.ArrayList;

public class StudyCourse {

    // attributes
    String subject;
    int numberOfStudents;
    String subjectID;
            
    
    public StudyCourse(String subject, int numberOfStudents, String subjectID) {
        this.subject = subject;
        this.numberOfStudents = numberOfStudents;
        this.subjectID = subjectID;


        // arraylist containing courses
        ArrayList<String> courses = new ArrayList<>();
 }
        
        // print out study course details as a string
        public String toString(){
            return "Course details: \nSubject: " + subject + 
                    "\nNumber of Students: " + numberOfStudents + 
                    "\nSubject ID: " + subjectID;
                    }
        } 

