package lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class LambdaWithFiles {
    public static void main(String[] args) {
        // how to read a file with functional programming

//        try {
//            Files.lines(Paths.get("E:/inteleij/src/lambda/LambdaFile.txt")).map(String::toUpperCase).forEach(t-> System.out.println(t));
//        } catch (IOException e) {
//            System.out.println(" Could not read the file" + e.getMessage());
//        }

        //print all distinct words
        try {
            Files.lines(Paths.get("E:/inteleij/src/lambda/LambdaFile.txt"))
                    .map(t->t.split(" ")).flatMap(Arrays::stream).map(t->t.replaceAll("\\W", ""))
                    .distinct().forEach(t-> System.out.println(t + " "));
        } catch (IOException e) {
            System.out.println(" Could not read the file" + e.getMessage());
        }
    }
}
