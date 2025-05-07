package number7;


public class ListUtilsFourth {
    private String name;
    private int occurrence;

    public void ListUtilsFourth(String name, int occurrence){
        this.name = name;
        this.occurrence = occurrence;
    }

    public String getName() {
        return name;
    }

    public int getOccurrence() {
        return occurrence;
    }
    public String toString(){
        return "{name: \"" + name + "\",occurrence: " + occurrence + '}';
    }
}
