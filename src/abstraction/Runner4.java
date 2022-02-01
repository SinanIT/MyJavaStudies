package abstraction;

public class Runner4 {
    public static void main(String[] args) {
        ElementarySchoolCalculator elStudent= new ElementarySchoolCalculator();
        System.out.println(elStudent.add(2,3,4));

        HigSchoolCalculator hsStudent = new HigSchoolCalculator();
        System.out.println(hsStudent.division(12,3));
    }
}
