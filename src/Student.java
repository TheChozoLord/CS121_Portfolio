public class Student {

    String studentName;
    int studentID;
    String major;
    public Student(){
        this.studentName = "No name";
        this.studentID = 0;
        this.major = "NULL";
    }

    public Student(String Name, int SID, String Major){
        this.studentName = Name;
        this.studentID = SID;
        this.major = Major;
    }

    public void displayStudentInfo(){
        System.out.printf("Student Name: %s\nStudent ID number %d\nStudent Major: %s\n", this.studentName, this.studentID, this.major);
    }
}
