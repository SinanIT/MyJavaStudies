package arraysmultidementionalarrays;

import com.sun.security.jgss.GSSUtil;

public class StringBuilder01 {
    public static void main(String[] args) {
        //How to create a string using by string builder

    //1-
        StringBuilder sb1 =  new StringBuilder();
        System.out.println(sb1);//""
        sb1.append("Ali Can");
        System.out.println(sb1);//Ali Can
        sb1.append(" is a student");
        System.out.println(sb1);//Ali Can is a student

    //2-
        StringBuilder sb2 =  new StringBuilder("Ali can is a student");

    //3-
        StringBuilder sb3 =  new StringBuilder(5);//length of the string
        sb3.append("javax");
        System.out.println(sb3);
        sb3.append("javaxxxxmmmmm");
        System.out.println(sb3);// string builder update the length
        System.out.println(sb3.capacity());// capacity is 18
        System.out.println(sb3.reverse());
        String c = " Sinan";
        StringBuilder sb4 =  new StringBuilder(c);
        System.out.println(sb4.reverse());

        //Some Methods
        StringBuilder sb5 = new StringBuilder("Java");
        System.out.println(sb5.append("x").append("y").append("z"));
        System.out.println(sb5);//Javaxyz
        //2
        System.out.println(sb5.append("mmm",0,3));//Javaxyzmmm
        //3
        System.out.println(sb5.charAt(5));//y

        //4
        System.out.println(sb5.delete(7,10));//Javaxyz

        //equals() method.
        StringBuilder sb7 = new StringBuilder("Same");
        StringBuilder sb8 = new StringBuilder("Same");
        /*
            because String builder equals method is difference from string equals method.
            StringBuilder equals() method return true just for sam object
            If you use StringBuilder equals() method with different object whose values are same will get false.
         */
        System.out.println(sb7.equals(sb7));//true
        System.out.println(sb7.equals(sb8));//false

       //indexOf()
        System.out.println(sb7.indexOf("a"));//1
        //insert()
        System.out.println(sb7.insert(1, "CCCC"));//SCCCCame
        System.out.println(sb7.insert(4, "KKKKK",1,5));
        //replace()
        System.out.println(sb7.replace(4, 8, "****"));//SCCC****Came
        //setCharAt()
       sb7.setCharAt(8, '9');
        System.out.println(sb7);//SCCC****9ame

        //subSquence()
        System.out.println(sb7.subSequence(4,8));//****- this method is not updating the sb7

        //trmToSize() makes the capacity same with the length. It attempts to reduce storage used for the character sequence.
        sb7.trimToSize();
    }
}
