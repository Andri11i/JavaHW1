public class Dog extends Animal {
    private static final int RUN_LIMIT = 500;
    private static final int SWIM_LIMIT = 10;
    private static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= RUN_LIMIT) {
            System.out.println(name + " пробіг " + distance + " м");
        } else {
            System.out.println(name + " не зміг пробігти " + distance + " м");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= SWIM_LIMIT) {
            System.out.println(name + " проплив " + distance + " м");
        } else {
            System.out.println(name + " не зміг проплисти " + distance + " м");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}
