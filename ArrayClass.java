import java.util.ArrayList;
public class ArrayClass{

    public static void main(String[] args){
        ArrayList studentList = new ArrayList();
        studentList.add(new Student(1,"Rajesh"));
        studentList.add(new Student(2,"Ramesh"));
        studentList.add(new Student(3,"Lokesh"));
        studentList.add(new Student(4,"Miraj"));
     printStudentList(studentList);
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