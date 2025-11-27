import java.util.Date;

public class Student {
    String firstName;
    String lastName;
    int registration;
    int grade;
    int year;
    
    public void printFullName(String firstName, String lastName){
        //TODO implement
    	System.out.println(firstName + " " + lastName);
     }

     public void isApproved(int grade){
         //TODO implement: should return true if grade >= 60
    	 if (grade >= 60) {
    		 year =+ 1;
    		 System.out.println("Congrats, you approved the subject.");
    		 
    	 } else {
    		 System.out.println("You didn't pass the subject.");
    	 }
     }

     public int changeYearIfApproved(){
         //TODO implement: the student should advance to the next year if he/she grade is >= 60
         // Make year = year + 1, and print "Congragulations" if the student has been approved
    	 return year;
     }
    
     public Student(String firstName, String lastName, int registration, int grade, int year) {
    	 this.firstName = firstName;
    	 this.lastName = lastName;
    	 this.registration = registration;
    	 this.grade = grade;
    	 this.year = year;
     }//Constructor
     
}//Class Student