package constuctor;

public class Student {
    public static void main(String[] args) {
         //Two different objects created with value.
         Student stdn1 = new Student("Michael"); 
         Student stdn2 = new Student("Robert");
   }

   //Constructor with parameter to pass values of object
   //Name of constructor Is same as class name.
   public Student(String name){ 
         String stdnname = name;
         System.out.println("Student's Name Is "+stdnname);
   }

}