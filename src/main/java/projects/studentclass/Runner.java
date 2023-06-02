package projects.studentclass;

import java.util.Hashtable;

import static projects.studentclass.School.scan;
import static projects.studentclass.School.students;

public class Runner {

    public static void main(String[] args) {

        /*
          1. fieldları ad, soyad, yas olan bir Ogrenci sınıfı tanımlayınız.
          2. Ogrenci sınıfına ad, soyad ve yas dan oluşan bir constructor tanımlayınız.
          3. Bütün fieldlar için encapsulation uygulayınız.
          4. Bir okul isimli sınıf tanımlayınız, fieldları okulAd, maxOgrenciSayisi,
          5. ArrayList cinsinden Öğrencileri olsun.
          6. main metodunun olduğu OkulMain isimli bir sınıf oluşturunuz.
          7. bir okul nesnesi oluşturup, bu okula max öğrenci miktarına ulaşana kadar öğrenci
          8. ekleyiniz.Fakat oluşturacağınız öğrencilerin yaşı 15 i geçmemeli.
             bu yaşı geçen bir öğrenci eklenmek istenir ise yerine başka öğrenci isteyiniz.
        */

        School school = new School("HappySchool", 3);


        int studentCounter = 1;

        do {
            try {
                System.out.println("Enter the name of the student you want to add");
                String studentName = scan.nextLine();
                System.out.println("Enter the surname of the student you want to add");
                String studentSurname = scan.nextLine();
                System.out.println("Enter the age of the student you want to add");
                int studentAge = scan.nextInt();
                students.add(new Student(studentName, studentSurname, studentAge));
                studentCounter++;
                scan.nextLine();
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println("Enter a new student");
                scan.nextLine();
            }
        }while (studentCounter <= school.getMaxStudentNumber());

        System.out.println(students);


        // with Map
        Hashtable<String, Student> students = new Hashtable<>();

        int count = 1;
        while (count<= school.getMaxStudentNumber()){
            try {
                System.out.println("Enter the class name of the student you want to add");
                String className = School.scan.nextLine();
                System.out.println("Enter the name of the student you want to add");
                String name = School.scan.nextLine();
                System.out.println("Enter the surName of the student you want to add");
                String surName = School.scan.nextLine();
                System.out.println("Enter the age of the student you want to add");
                int age = School.scan.nextInt();
                students.put(className, new Student(name, surName, age));
                count++;
                School.scan.nextLine();
            } catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println("Enter a new student");
                School.scan.nextLine();
            }

        }

        System.out.println(students);



    }
}
