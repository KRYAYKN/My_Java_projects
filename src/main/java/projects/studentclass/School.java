package projects.studentclass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class School {

    private String schoolName;
    private int maxStudentNumber;
    static Scanner scan = new Scanner(System.in);
    static List<Student> students = new ArrayList<>();

    public School(String schoolName, int maxStudentNumber) {
        setSchoolName(schoolName);
        setMaxStudentNumber(maxStudentNumber);
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getMaxStudentNumber() {
        return maxStudentNumber;
    }

    public void setMaxStudentNumber(int maxStudentNumber) {
        this.maxStudentNumber = maxStudentNumber;
    }


}
