package projects.studentclass;

public class Student {

    private String studentName;
    private String studentSurname;
    private int studentAge;

    public Student(String studentName, String studentSurname, int studentAge) throws Exception {
        setStudentAge(studentAge);
        setStudentName(studentName);
        setStudentSurname(studentSurname);

    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) throws Exception {
        if(studentAge>15)
            throw new Exception("Student age can not be more than 15");
        this.studentAge = studentAge;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentSurname='" + studentSurname + '\'' +
                ", studentAge=" + studentAge +
                '}';
    }


}
