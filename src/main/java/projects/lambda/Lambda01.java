package projects.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {

    /*
      Create 4 objects by using class Can(private String season; private String courseName; private int averageScore; private int numberOfStudents;)
      1. Add them into a list
      2. Check if all average scores are less than 98
      3. Check if all course names contain "Day" word
      4. Check if any number of students is 154
      5. Check if any season is Winter
      6. Check if no number of students is 100
      7. Sort the elements in natural order according to the average score
      8. Sort the elements in reverse order according to the number of students
      9. Sort the elements in reverse order according to the course name
    */

    static Can course1 = new Can("Winter", "Math", 85, 100);
    static Can course2 = new Can("Spring", "Science", 80, 154);
    static Can course3 = new Can("Summer", "ArtDay", 90, 90);
    static Can course4 = new Can("Fall", "English", 99, 100);
    static List<Can> list = new ArrayList<>();

    public static void main(String[] args) {

        addToTheList(list);
        checkIfAverageScoreLessThanNinetyEight(list);
        System.out.println();
        checkIfCourseNamesContainDay(list);
        System.out.println();
        checkIfAnyNumberOfStdIsOneHundredFiftyFour(list);
        System.out.println();
        checkIfAnySeasonIsWinter(list);
        System.out.println();
        checkIfNoNumberOfStdAHundred(list);
        System.out.println();
        AverageScoreInNaturalOrder(list);
        System.out.println();
        theNumberOfStdInReverseOrder(list);
        theCourseNameInReverseOrder(list);

    }

    public static void addToTheList(List<Can> l){
        l.add(course1);
        l.add(course2);
        l.add(course3);
        l.add(course4);
    }

    public static void checkIfAverageScoreLessThanNinetyEight(List<Can> l){
        System.out.print("All the average scores which are less than 98: ");
        l.stream().filter(t -> t.getAverageScore()<98).forEach(t -> System.out.print(t.getAverageScore() + " "));
    }

    public static void checkIfCourseNamesContainDay(List<Can> l){
        System.out.print("All the course names which contains 'Day' word: ");
        l.stream().filter(t -> t.getCourseName().contains("Day")).forEach(t -> System.out.print(t.getCourseName() + " "));
    }

    public static void checkIfAnyNumberOfStdIsOneHundredFiftyFour(List<Can> l){
        System.out.print("All the number of the students which is 154: ");
        l.stream().filter(t -> t.getNumberOfStudents()==154).forEach(t -> System.out.print(t.getNumberOfStudents() + " "));
    }

    public static void checkIfAnySeasonIsWinter(List<Can> l){
        System.out.print("All the season which is Winter: ");
        l.stream().filter(t -> t.getSeason().equalsIgnoreCase("Winter")).forEach(t -> System.out.print(t.getSeason() + " "));
    }

    public static void checkIfNoNumberOfStdAHundred(List<Can> l){
        System.out.print("All the number of students which is not 100: ");
        l.stream().filter(t -> t.getNumberOfStudents()!=100).forEach(t -> System.out.print(t.getNumberOfStudents() + " "));
    }

    public static void AverageScoreInNaturalOrder(List<Can> l){
        System.out.print("All the elements in natural order according to the average score: ");
        l.stream().map(Can::getAverageScore).sorted().forEach(t -> System.out.print(t + " "));
    }

    public static void theNumberOfStdInReverseOrder(List<Can> l){
        System.out.println("All the elements in reverse order according to the number of students: ");
        l.stream()
                .sorted(Comparator.comparing(Can::getNumberOfStudents).reversed())
                .forEach(t->System.out.println(t + " "));
    }

    public static void theCourseNameInReverseOrder(List<Can> l){
        System.out.println("All the elements in reverse order according to the course name: ");
        l.stream().
                sorted(Comparator.comparing(Can::getCourseName).reversed()).
                forEach(t -> System.out.println(t + " "));
    }




}
