package projects.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda03 {

    public static void main(String[] args) {

        // Create a String list which has 5 String elements. 3 of them will start with the letter "A"
        // If the elements are starting with the letter "A" and the length of the elements is less than 5, print them in upper case in a list on the console.

        List<String> words = new ArrayList<>(Arrays.asList("Art", "Strawberry", "Ant", "Avocado", "Cat"));
        printTheElementsWanted(words);


    }

    public static void printTheElementsWanted(List<String> w){
        w.stream().filter(t -> t.startsWith("A") && t.length()<5).map(String::toUpperCase).forEach(Lambda03::print);
    }

    public static void print(String a){
        System.out.print(a + " ");
    }


}
