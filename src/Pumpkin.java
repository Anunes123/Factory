public class Pumpkin {

    int size;
    String color;
    String shape;


    boolean isHalloween;

    public void printInfo() {
        System.out.println(color);
        System.out.println(shape);
        System.out.println(size);
        System.out.println(isHalloween);
        if (isHalloween) {
            System.out.println("I'm going to be used for Halloween!");
        } else {
            System.out.println("I'm a regular pumpkin.");
        }


    }

    public Pumpkin(String pShape, String pColor, int pSize, boolean pIsHalloween) {
        System.out.println("making a pumpkin");
        size = pSize;
        color = pColor;
        shape = pShape;
        isHalloween = pIsHalloween;

    }
    public Pumpkin(){
        size = 20;
        color = "blue";
        shape = "triangle";
        isHalloween = true;
    }
}
