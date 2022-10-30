package interfaces;

public interface Sound {
    //All methods below are public and abstract.
    public void sound();

    public abstract void increaseVolume();

    void decreaseVolume();

    // variables in interface public static and final automatically- as default
    public static final int LEVEL = 0;
    int price = 23;

    //

}
