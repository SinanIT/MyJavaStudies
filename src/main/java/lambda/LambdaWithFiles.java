package lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class LambdaWithFiles {
    public static void main(String[] args) {
        // how to read a file with functional programming
        try {
            Files.lines(Paths.get("src/main/java/lambda/LambdaFile.txt")).map(String::toUpperCase).forEach(t-> System.out.println(t));
        } catch (IOException e) {
            System.out.println(" Could not read the file" + e.getMessage());
        }

        System.out.println("*****************************************************************************************");
        //print all distinct words
        try {
            Files.lines(Paths.get("src/main/java/lambda/LambdaFile.txt"))
                    .map(t->t.split(" ")).flatMap(Arrays::stream).map(t->t.replaceAll("\\W", ""))
                    .distinct().forEach(t-> System.out.println(t + " "));
        } catch (IOException e) {

            System.out.println(" Could not read the file" + e.getMessage());
        }
        System.out.println("*****************************************************************************************");
        //print all words contains character e
        try {
            Files.lines(Paths.get("src/main/java/lambda/LambdaFile.txt"))
                    .map(t->t.split(" ")).flatMap(Arrays::stream)
                    .map(t->t.replaceAll("\\W", ""))
                    .filter(t->t.contains("e"))
                    .forEach(System.out::println);
        } catch (IOException e) {

            System.out.println(" Could not read the file " + e.getMessage());
        }
    }
}
