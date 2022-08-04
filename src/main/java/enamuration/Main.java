package enamuration;

public class Main {
    public static void main(String[] args) {
        Color c1 = Color.RED;
        System.out.println("Red Enum name: " + c1.name()); //Red Enum name: RED
        System.out.println("Red enum value: " + c1.getValue());// Red enum value: red

        for (Color color : Color.values()){
            System.out.print("Enum value: " + color.getValue() + " ");
        }
    }
}
