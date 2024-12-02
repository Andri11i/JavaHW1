public class Main {
    public static void main(String[] args) {
        Dog bobik = new Dog("Бобік");
        bobik.run(150);
        bobik.swim(5);

        Cat murzik = new Cat("Мурзик");
        murzik.run(250);
        murzik.swim(10);

        Dog sharik = new Dog("Шарик");
        sharik.run(600);
        sharik.swim(15);

        System.out.println("Кількість тварин: " + Animal.getAnimalCount());
        System.out.println("Кількість собак: " + Dog.getDogCount());
        System.out.println("Кількість котів: " + Cat.getCatCount());
    }
}
//main