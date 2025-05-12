package phonebook;


import java.util.ArrayList;
import java.util.List;

public class TelephoneDirectory {
    private static final List<Record> records = new ArrayList<>();

    public void add(Record record) {
        records.add(record);
    }

    public  static Record find(String name) {
        for (Record record : records) {
            return record;
        }
        return null;
    }


    public static List<Record> findAll(String name) {
        List<Record> foundRecords = new ArrayList<>();
        for (Record record : records) {
            if (record.getName().equals(name)) {
                foundRecords.add(record);
            }
        }
        return foundRecords;

    }

    public void printAllRecords() {
        for (Record record : records) {
            System.out.println(record);
        }
    }

}


