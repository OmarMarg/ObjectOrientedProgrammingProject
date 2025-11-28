import java.util.ArrayList;

public class Courses {
	String couseName;
	String professorName;
	int year;
	
	ArrayList<Student> enrolledStudents = new ArrayList();
	
	   public void enroll(Student student){
		      //TODO add the student to the collection
		   		enrolledStudents.add(student);
		   }

		   public void unEnroll(Student student){
		       //TODO remove this student from the collection
			   if (student != null) {
				   enrolledStudents.remove(student);
			   } else { 
				   System.out.println("Student is not on the subject.");
			   }
		   }

		   public int countStudents(){
		       //TODO implement
		       return enrolledStudents.size();
		   }
		   
//		   public int bestGrade(Student student){
//		       //TODO implement
//		       int best = 0;
//		       for ( Student stud : student) {
//		    	   if (stud.grade() > best) {
//		    		   best = stud.grade();
//		    	   }
//		       }
//		   }
}
