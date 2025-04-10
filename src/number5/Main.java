package number5;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Korgi") {
            @Override
            public void run(int distance) {

            }

            @Override
            public void swim(int distance) {

            }
        };
        Cat cat = new Cat("Tom");
        dog.Run(150);
        dog.swim(5);
        cat.run(5);
        cat.swim(5);
        System.out.println(AnimalCanRunAndSwim.getAnimalCount1());
        System.out.println(Dog.getDogCount());
        System.out.println(Cat.getCatCount());
    }
}
