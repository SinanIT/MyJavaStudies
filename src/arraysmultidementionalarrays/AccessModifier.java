package arraysmultidementionalarrays;

public class AccessModifier {
    //To access a class member to another class
    //1- You can use class name (just for static member of the class)
    //2- you can create objject of the class

    // if a class member is privet you cannot access it from another class
    // if you do not type anything before variable type it means access modifier is "default"
    //Note: if a class member has default access modifier, then you can not access to it from another classes
    //default is package private
    //In Java some classes can eb a child of another classes
    // if something is protected child classes can access from child classes
    //classes can not be private

    public static void main(String[] args) {
      AccessModifier2 obj = new AccessModifier2();
        System.out.println(obj.name);
        System.out.println(obj.schoolName);
    }
}
