package number8;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        AttendanceLogger logger = new AttendanceLogger();


        logger.logVisit("user1", "09:15");
        logger.logVisit("user2", "10:00");
        logger.logVisit("user1", "09:45");
        logger.logVisit("user3", "11:30");
        logger.logVisit("user2", "10:20");
        logger.logVisit("user4", "14:10");
        logger.logVisit("user1", "09:55");
        logger.logVisit("user2", "10:45");
        logger.logVisit("user4", "14:25");
        logger.logVisit("user3", "11:50");
        logger.logVisit("user5", "15:00");
        logger.logVisit("user1", "16:30");
        logger.logVisit("user3", "11:59");

        // 1. Выводим частоту посещений
        Map<String, Integer> frequency = logger.calculateVisitFrequency();
        System.out.println("Частота посещений:");
        System.out.println(frequency);


        String popularHour = logger.findMostPopularHour();
        System.out.println("\nСамое популярное время посещения:");
        System.out.println(popularHour);
    }
}