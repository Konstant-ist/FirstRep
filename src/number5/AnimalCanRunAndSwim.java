package number5;

 abstract class AnimalCanRunAndSwim{
    protected String name;
    private static int animalCount1 = 0;
    public AnimalCanRunAndSwim(String name){
        this.name = name;
        animalCount1++;
    }

    public abstract void run(int distance);
    public abstract void swim(int distance);

    public static int getAnimalCount1(){
        return animalCount1;
    }
}
