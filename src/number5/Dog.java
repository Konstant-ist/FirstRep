package number5;

abstract class Dog extends AnimalCanRunAndSwim {
    private static int dogCount = 0;
    private static final int maxRunDistance = 500;
    private static final int maxSwimDistance = 10;

    public Dog(String name) {
        super(name);
        dogCount++;
    }
    public void say(){
        System.out.println("BARK");
    }

    public void Run(int distance) {
        if (distance<=maxRunDistance) {
            System.out.println(name + "Корги пробежал " + distance + " метров!");
            System.out.println(name + "не смог пробежать" + distance + "метров.");
        }
    }
    public void Swim(int distance){
        if (distance<=maxSwimDistance) {
            System.out.println(name + " проплыл" + distance + " метров");
        }else {
            System.out.println(name+" не смог проплыть"+distance+" метров");
        }
    }

    public static int getDogCount(){
        return dogCount;
    }
}
