package basics;

public class InstanceLocalClassVariables {

    /*
            Instance Variables:
            1- If the variables inside the class but outside the main method
            2- And if it is not STATIC
            - If you do not assign a value to the int Java assign its value as  'O'. It is default value.
            Default value for instance valuable is null
            Default values for boolean is 'false'
            Default values for char is ''

            -Objects are instance of the class
            -- Instance variable attaches to the object
    * */

    /*
    * Class Variable:
        1-If a variable created inside the class and outside the main method
        2- If the variable is STATIC
         --Class variables attaches to the Class
         *
         THE MAIN DIFFRENCE BETWEEN Instance(object) and Class(static) variable is that;
         1- All updates on static variable visible by all objects which are created from the class
         * but all updates on instance variable is just visible by object
         2- Static variables are common for all objects, but instance variables are specified for an object

    * */

    /*
    * LOCAL VARIABLE
            1- If a variable created inside the method it called local variable
            * -- For local variables there is no DEFAULT value. They should assign a value.
            * -- Local variables which are created in a static methods are static automatically.
    *
    * */

    int i= 20; //instance variable
    int k; //Instance variable.
    String a;//instance variable
    boolean c;//instance variable
    char d;//instance variable
    static byte by;// CLASS VARIABLE

    public static void main(String[] args) {
        InstanceLocalClassVariables obj= new InstanceLocalClassVariables();
        System.out.println(obj.k);//instance variable
        System.out.println(obj.a);//instance variable
        System.out.println(obj.c);//instance variable
        System.out.println(obj.d);//instance variable
        System.out.println(by);// Class variable

        int local= 5;// Local variable



    }
}
