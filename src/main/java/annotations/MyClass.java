package annotations;

import java.lang.reflect.Method;

public class MyClass {
    @MyCustomAnnotation(value =  10)
    public void sayHello(){
        System.out.println("my custom annotation");
    }
    public static void main(String[] args) throws NoSuchMethodException {
        MyClass h = new MyClass();
        Method methodVal = h.getClass().getMethod("sayHello");

        MyCustomAnnotation myCustomAnnotation = methodVal.getAnnotation(MyCustomAnnotation.class);
        System.out.println("Value is: " + myCustomAnnotation.value());


    }
}
