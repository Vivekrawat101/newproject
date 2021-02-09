import java.util.ArrayList;
public class ArrayClass{

    public static void main(String[] args){
        ArrayList studentList = new ArrayList();
        studentList.add(new Student(1,"Rajesh")); // add student with roll number 1 and name Rajesh
        studentList.add(new Student(2,"Ramesh")); // add student with roll number 2 and name Ramesh
        studentList.add(new Student(3,"Lokesh"));// add student  with roll number 3 and name Lokesh 
        studentList.add(new Student(4,"Miraj")); // add student with roll number 4 and name Miraj
     printStudentList(studentList); // call the printStudentList with an arguement list of studentlist [ArrayList]
    }
    public static String printStudentList(ArrayList student){
        for(Object m : student){
        Student s = (Student) m;
        System.out.println(s.getDetails());
        }
    }
}

class Student{
    public int rollNumber ;
    public String name;
    
    public Student(int rollNumber , String Name){
        this.name = Name;
        this.rollNumber = rollNumber;
    }
    public String getDetails(){
        return "Name = " + this.name + '\n'
         + "RollNumber = " + this.rollNumber +'\n';
    }

}