package phonebook;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();

        telephoneDirectory.add(new Record("Bob",   "+375445766969"));
        telephoneDirectory.add(new Record("Tom",   "+375295768493"));
        telephoneDirectory.add(new Record("Bob",  "+375447395818"));

        Record firstBob = TelephoneDirectory.find("Bob");
        System.out.println("Первая запись Боба:" +firstBob);

        List<Record>AllBobs = TelephoneDirectory.findAll("Bob");
        System.out.println("Все записи Боба: " + AllBobs);

        Record firstGleb = TelephoneDirectory.find("Gleb");
        System.out.println("Глеб: " +firstGleb);
    }
}
