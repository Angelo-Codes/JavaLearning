package staticVariableAndMethod;

public class Cat {
    public static final int MAX_LIVES = 9;
    private static int catCount = 0;
    String name;
    int age;
    int livesRemaining;

    public void meow() {
        System.out.println("Meow");
    }

    public Cat() {
        catCount++;
    }

    public static int getCountCat() {
        return catCount;
    }

}
