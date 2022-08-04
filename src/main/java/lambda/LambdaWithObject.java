package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaWithObject {
    public static void main(String[] args) {

        Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
        Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 154);
        Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
        Course courseEnglishNight = new Course("Winter", "English Night", 93, 144);

        List<Course> list = new ArrayList<>();
        list.add(courseTurkishDay);
        list.add(courseTurkishNight);
        list.add(courseEnglishDay);
        list.add(courseEnglishNight);

        System.out.println(list);
        System.out.println();
        System.out.println(checkAvg(list));//false
        System.out.println();
        System.out.println(checkWordDay(list));//false
        System.out.println();
        System.out.println(checkAnyNumberOfStudentsis154(list));//true
        System.out.println();
        System.out.println(checkNoNumberOfStudents100(list));//true
        System.out.println();
        sortByAvgScore(list);
        System.out.println();
        sortStudentNum(list);
        System.out.println();
        sortCourseName(list);
    }

        /*
        TODO: Check Avarage scores are less ten 98
         */
    public static boolean checkAvg(List<Course> list) {
        return list.stream().allMatch(t -> t.getAverageScore() < 98);
    }
        /*
        TODO: Check if all course names contain "Day" word
         */
    public static boolean checkWordDay(List<Course> list){
        return list.stream().allMatch(t->t.getCourseName().contains("Day"));
    }
        /*
        TODO: Check if any number of students is 154
         */
    public static boolean checkAnyNumberOfStudentsis154(List<Course> list){
        return list.stream().anyMatch(t->t.getNumberOfStudents()==154);
    }

        /*
        TODO: Check if no number of students is 100
         */
    public static boolean checkNoNumberOfStudents100(List<Course> list){
        return list.stream().noneMatch(t->t.getNumberOfStudents()==100);
    }
        /*
        TODO: Sort the elements in natural order according to average score
         */
    public static void sortByAvgScore(List<Course> list){
        list.stream().sorted(Comparator.comparing(Course::getAverageScore)).forEach(t-> System.out.print(t + " // "));
    }
        /*
        TODO: Sort the elements in reverse order according to number of students
         */
        public static void sortStudentNum(List<Course> list){
            list.stream().sorted(Comparator.comparing(Course::getNumberOfStudents).reversed()).forEach(t-> System.out.print(t + " // "));
        }
        /*
        TODO: Sort the elements in reverse order according to course name
        */
    public static void sortCourseName(List<Course> list){
        list.stream().sorted(Comparator.comparing(Course::getCourseName).reversed()).forEach(t-> System.out.print(t + " // "));
    }

}