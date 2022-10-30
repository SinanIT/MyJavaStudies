package string;

public class StringBuilder03 {
    public static void main(String[] args) {
        //String is immutable, when we update a string JVM do too many things liek creating a container, putting the updated value into it
        //then remove the previous string object
        String string = "Java";

        string.concat("x");
        // StringBuffer is created to update Strings easily but Java made StringBuffer thread-safe and synchronized. This makes StringBuffer slow.
        //Java Created StringBuilder which is not thread-safe and NOt synchronized. StringBuilder faster then StringBuffer


        StringBuffer sbf = new StringBuffer("Java");//it is thread safe and synchronized working slow.
        sbf.insert(4,"x");
        System.out.println(sbf);// no need to create new container on heap

        // if you are sure you will not need multi threading then use StringBuilder when you need a to update a string. But if it is possible then use StrinBuffer.
        StringBuilder stringBuilder = new StringBuilder("Java");// has more feature. I you don't need synchronization no need use STRINGBUFFER
        sbf.insert(4,"x");
        System.out.println(sbf);//no need to create new container on heap
    }
}
