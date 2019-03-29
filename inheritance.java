class Student {
   private String designation = "Student";
   private String collegeName = "College Name";
   private String Section ="First";
   private String Number="999";

   public String getSection (){
       return Section;
   }
   protected void setSection(String Section){
       this.Section = Section;
   }
   public String getNumber(){
    return Number;
   }
   protected void setNumber(String Number){
    this.Number= Number;
   }
   public String getDesignation() {
	return designation;
   }
   protected void setDesignation(String designation) {
	this.designation = designation;
   }
   protected String getCollegeName() {
	return collegeName;
   }
   protected void setCollegeName(String collegeName) {
	this.collegeName = collegeName;
   }
   void does(){
	System.out.println("student");
   }
}

public class inheritance extends Student{
   String mainSubject = "Physics";

   public static void main(String args[]){
	inheritance obj = new inheritance();
	System.out.println("College name : "+obj.getCollegeName());
	System.out.println("Designation : "+obj.getDesignation());
    System.out.println("Subject : "+obj.mainSubject);
    System.out.println("Section : "+obj.getSection());
    System.err.println("Roll Number : "+obj.getNumber());
	obj.does();
   }
}