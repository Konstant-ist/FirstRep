package number5;

 class Cat extends AnimalCanRunAndSwim{
     static int catCount = 0;
     private static final int maxRunDistance = 200;


    public Cat(String name) {
        catCount++;
        super(name);
    }
    public void say(){
        System.out.println("MEOW");
    }

    public void run(int distance){
        if (distance<=maxRunDistance){
            System.out.println(name  + " пробежал" +distance + " метров!");
        }else {
            System.out.println(name + "не смог пробежать" + distance + " метров.");
        }
    }
    public void swim(int disnatce){
        System.out.println(name + "не умет плавать.");
    }

    public static int getCatCount() {
        return catCount;


    }
}
